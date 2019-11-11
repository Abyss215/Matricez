
/**
 * Hacer un programa de una arreglo de tres dimensiones (largo, ancho y alto),
 * donde en cada celda se guarde un número al azar entre 1 y 20.
 * Después leer desde el teclado un número y escribir en pantalla 
 * la posición o posiciones en que se encuentra ese número..
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.math.*;
import java.util.Scanner;
public class Poc3D
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese largo");
        int larg=sc.nextInt();
        System.out.println("ingrese ancho");
        int anch=sc.nextInt();
        System.out.println("ingrese alto");
        int alt=sc.nextInt();
        int cubo[][][]=new int[anch][alt][larg];
        System.out.println("\n Imagen  Cubo ");
        for(int z=0;z<larg;z++)
            for(int y=0;y<alt;y++)
                for(int x=0;x<anch;x++){
                    cubo[x][y][z]=(int)(Math.random()*(20-1)+1);
                }
        for(int z=0;z<larg;z++){
            System.out.print("\n");
            for(int y=0;y<alt;y++){
                for(int x=0;x<anch;x++){
                    System.out.print("["+cubo[x][y][z]+"]");
                }
                System.out.print("\n");
            }
        }
        System.out.println("ingrese un numero para inprimir su posicion");
        int n=sc.nextInt();
        System.out.println("x-->ancho\ny-->altura\nz-->largo");
        System.out.println("                               [x][y][z]");
        for(int z=0;z<larg;z++)
            for(int y=0;y<alt;y++)
                for(int x=0;x<anch;x++)
                    if(cubo[x][y][z]==n)
                         System.out.println("el valor "+n+" esta en la posicion ["+x+"]["+y+"]["+z+"]");
                    
    }
}
