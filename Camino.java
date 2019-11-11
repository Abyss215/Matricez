
/**
 * Hacer una matriz de 4X4, donde la persona se posiciona en la esquina superior izquierda,
 * y deberá llegar a la esquina inferior derecha. 
 * Para moverse la persona solo podrá ir a la derecha(D) o izquierda(I) o hacia abajo(A),
 * pero nunca hacia atrás

       1       2       3       4
1   Inicio
2
3
4                               Fin
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Camino
{
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char [][] cam=new char[4][4];
        int x=0,y=0;
        System.out.println("usted esta en inico [0][0]\n\tREGLAS\nescriba cualquiera de las siguientes letras para avanzar y legar al final [3][3]");
        System.out.println("D--->derecha\nI--->izquierda\nA--->abajo\nPD:no puede pasar por donde ya paso xd");
        int i=0;
        while(i<1){
            System.out.println("ingrese hacia donde quiere dezplasarse");
            char mov=sc.next().charAt(0);
            if(mov=='a'||mov=='A'){
                if(y==3){
                    System.out.println("ya no puede bajar mas");
                }else{
                    y++;
                    cam[x][y]='p';
                    if(y==3&&x==3){
                        i++;
                        System.out.println("llego al destino [3][3] UwU");
                    }
                }
            }else if(mov=='d'||mov=='D'){
                if(x==3){
                    System.out.println("ya no puede ir mas a la derecha");
                }else if(cam[x+1][y]!='\u0000'){
                    System.out.println("no puede ir por alla, ya paso por ahi");
                }else {
                    x++;
                    cam[x][y]='p';
                    if(y==3&&x==3){
                        i++;
                        System.out.println("llego al destino [3][3] UwU");
                    }
                }
            }else if(mov=='i'||mov=='I'){
                if(x==0){
                    System.out.println("ya no puede ir mas a la izquierda");
                }else if(cam[x-1][y]!='\u0000'){
                    System.out.println("no puede ir por alla, ya paso por ahi");
                }else {
                    x--;
                    cam[x][y]='p';
                    if(y==3&&x==3){
                        i++;
                        System.out.println("llego al destino [3][3] UwU");
                    }
                }
            }else{
                System.out.println("ingrese un dato correcto");
            }
            if(x==0&&y==3){
                if(cam[x+1][y]!='\u0000'){
                    i++;
                    System.out.println("upps se quedo atrapado ya no puede continuar");
                }
            }
            System.out.println("esta en la posicion ["+x+"]["+y+"]");
        }
    }
}
