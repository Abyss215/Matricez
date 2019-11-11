
/**
 * acer una matriz de 3X3, donde se realice el juego del gato,
 * para tirar la persona deberá escribir dos valores( c,f) 
 * que será el número de columna y de fila. Primero se tira una X 
 * y después una O y así sucesivamente. 
 * El programa dirá si ganan las X o las O (en texto, no gráfico)..
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Gato
{
    private char [][] tablero=new char[3][3];
    private boolean player=true;
    char [] j={'o','x'};
    private void jugadas(){
        Scanner sc=new Scanner(System.in);
        impri();
        System.out.println("ingrese posicion de su jugada");
        System.out.print("columna: ");int x=sc.nextInt();
        System.out.print("fila: ");int y=sc.nextInt();
        boolean jugadaValida=true;
        if(x>=3||y>=3){
            jugadaValida=false;
        }else{
            if(tablero[x][y]!='\u0000')
                jugadaValida=false;
        }
        if(jugadaValida){
            if(player){
                tablero[x][y]='o';
                player=!player;
            }else{
                tablero[x][y]='x';
                player=!player;
            }
            if(tLlena()){
                if(!(ganador()=='x'||ganador()=='o'))
                    jugadas();
                else{
                    impri();
                    System.out.println("gano el jugador de la "+ganador());
                }
            }else{
                impri();
                if(ganador()=='x'||ganador()=='o'){
                    System.out.println("gano el jugador de la "+ganador());
                }else{
                    System.out.println("empate");
                }
            }
            
        }else{
            System.out.println("\nya se jugo en esa posicion o esta fuera de rango, intente otra");
            jugadas();
        }
    }
    private char ganador(){
        char gano=' ';
        if((tablero[0][0]=='o'&&tablero[1][1]=='o'&&tablero[2][2]=='o')||
           (tablero[2][0]=='o'&&tablero[1][1]=='o'&&tablero[0][2]=='o')||
           (tablero[0][0]=='o'&&tablero[0][1]=='o'&&tablero[0][2]=='o')||
           (tablero[1][0]=='o'&&tablero[1][1]=='o'&&tablero[1][2]=='o')||
           (tablero[2][0]=='o'&&tablero[2][1]=='o'&&tablero[2][2]=='o')||
           (tablero[0][0]=='o'&&tablero[1][0]=='o'&&tablero[2][0]=='o')||
           (tablero[0][1]=='o'&&tablero[1][1]=='o'&&tablero[2][1]=='o')||
           (tablero[0][2]=='o'&&tablero[1][2]=='o'&&tablero[2][2]=='o')){
               gano='o';
            }else if((tablero[0][0]=='x'&&tablero[1][1]=='x'&&tablero[2][2]=='x')||
           (tablero[2][0]=='x'&&tablero[1][1]=='x'&&tablero[0][2]=='x')||
           (tablero[0][0]=='x'&&tablero[0][1]=='x'&&tablero[0][2]=='x')||
           (tablero[1][0]=='x'&&tablero[1][1]=='x'&&tablero[1][2]=='x')||
           (tablero[2][0]=='x'&&tablero[2][1]=='x'&&tablero[2][2]=='x')||
           (tablero[0][0]=='x'&&tablero[1][0]=='x'&&tablero[2][0]=='x')||
           (tablero[0][1]=='x'&&tablero[1][1]=='x'&&tablero[2][1]=='x')||
           (tablero[0][2]=='x'&&tablero[1][2]=='x'&&tablero[2][2]=='x')){
               gano='x';
            }
        return gano;
    }
    private boolean tLlena(){
        boolean lleno=true;
        for(int y=0;y<3;y++){
            for(int x=0;x<3;x++){
                if(tablero[x][y]!='\u0000'){
                    lleno=false;
                }else{
                    lleno=true;
                    break;
                }
            }
            if(lleno)
                break;
        }
        return lleno;
    }
    private void impri(){
        System.out.println("\n   0  1  2");
        for(int y=0;y<3;y++){
            System.out.print(y+" ");
            for(int x=0;x<3;x++){
                System.out.print("["+tablero[x][y]+"]");}
                System.out.println("");}
    }
    public static void main(String [] args){
        Gato cat=new Gato();
        cat.jugadas();
        
    }
}
