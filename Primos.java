
/**
 * Hacer un programa que dadas dos arreglos tridimensionales (largo X ancho X altura),
 * agregarle números aleatorios comprendidos entre 1 y 5,000 
 * y que determine en que posiciones se encuentran los números primos en el arreglo y cuantos hay..
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.math.*;
import java.util.Scanner;
public class Primos
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int cubo1[][][]=newCubo(1);
        int [][][]cubo2=newCubo(2);
        System.out.println("\n imagen cubo 1");
        impri(cubo1);
        System.out.println("\n imagen cubo 2");
        impri(cubo2);
        System.out.println("\nlos numeros primos del cubo 1 son y estan en:");
        primo(cubo1);
        System.out.println("\nlos numeros primos del cubo 2 son y estan en:");
        primo(cubo2);
    }
    private static void primo(int [][][] cubo){
        int cont=0;
        for(int z=0;z<cubo[0][0].length;z++)
            for(int y=0;y<cubo[0].length;y++)
                for(int x=0;x<cubo.length;x++){
                    boolean pri=true;
                    for(int i=2;i<cubo[x][y][z];i++)
                        if(cubo[x][y][z]%i==0){
                            pri=false;
                            break;
                        }
                    if(pri){
                        System.out.println("el numero "+cubo[x][y][z]+" en la posicion ["+x+"]["+y+"]["+z+"]");
                        cont++;
                    }
                    }
    }
    private static int[][][] newCubo(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese largo del cubo "+n);
        int larg=sc.nextInt();
        System.out.println("ingrese ancho del cubo "+n);
        int anch=sc.nextInt();
        System.out.println("ingrese alto del cubo "+n);
        int alt=sc.nextInt();
        int cubo[][][]=new int[anch][alt][larg];
        for(int z=0;z<larg;z++)
            for(int y=0;y<alt;y++)
                for(int x=0;x<anch;x++){
                    cubo[x][y][z]=(int)(Math.random()*(5000-1)+1);
                }
        return cubo;
    }
    private static void impri(int [][][] cubo){
        for(int z=0;z<cubo[0][0].length;z++){
            System.out.print("\n");
            for(int y=0;y<cubo[0].length;y++){
                for(int x=0;x<cubo.length;x++){
                    System.out.print("["+cubo[x][y][z]+"]");
                }
                System.out.print("\n");
            }
        }
    }
}
