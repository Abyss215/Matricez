
/**
 * Write a description of class cubo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.math.*;
public class cubo
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
        int i=0;
        for(int z=0;z<larg;z++)
            for(int y=0;y<alt;y++)
                for(int x=0;x<anch;x++){
                    cubo[x][y][z]=i;
                    i++;
                }
        /*F*/System.out.print("\nfrente\n");
        for(int y=0;y<alt;y++){
            for(int x=0;x<anch;x++){
                System.out.print("["+cubo[x][y][0]+"]");
            }
            System.out.print("\n");
        }
        /*A*/System.out.print("\natras\n");
        for(int y=0;y<alt;y++){
            for(int x=0;x<anch;x++){
                System.out.print("["+cubo[x][y][larg-1]+"]");
            }
            System.out.print("\n");
        }
        /*Ar*/System.out.print("\narriba\n");
        for(int z=0;z<larg;z++){
            for(int x=0;x<anch;x++){
                System.out.print("["+cubo[x][0][z]+"]");
            }
            System.out.print("\n");
        }
        /*Ab*/System.out.print("\nabajo\n");
        for(int z=0;z<larg;z++){
            for(int x=0;x<anch;x++){
                System.out.print("["+cubo[x][alt-1][z]+"]");
            }
            System.out.print("\n");
        }
        /*Li*/System.out.print("\nLateral izquierdo\n");
        for(int z=0;z<larg;z++){
            for(int y=0;y<alt;y++){
                System.out.print("["+cubo[0][y][z]+"]");
            }
            System.out.print("\n");
        }
        /*Ld*/System.out.print("\nLateral derecho\n");
        for(int z=0;z<larg;z++){
            for(int y=0;y<alt;y++){
                System.out.print("["+cubo[anch-1][y][z]+"]");
            }
            System.out.print("\n");
        }
    }
}
