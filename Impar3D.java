
/**
 * 1.Hacer un programa que lea un arreglo tridimensional (nXmXz),
 * donde n,m y z son de diferente magnitud,
 * almacenar valores aleatorios comprendidos entre cero y 30,
 * y posteriormente calcular cual cara tiene más números impares almacenados.
 * 
 * @criss_215
 * 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.math.*;
public class Impar3D
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int larg=0,anch=0,alt=0;
        do{
            if(larg!=0)
            System.out.println("\ningrese datos otra vez, asegurese de que sean cada uno diferente\n");
            System.out.println("ingrese largo");
            larg=sc.nextInt();
            System.out.println("ingrese ancho");
            anch=sc.nextInt();
            System.out.println("ingrese alto");
            alt=sc.nextInt();
        }while(larg==anch||larg==alt||anch==alt);
        int cubo[][][]=new int[anch][alt][larg];
        int impar[]=new int[larg];
        for(int z=0;z<larg;z++)
            for(int y=0;y<alt;y++)
                for(int x=0;x<anch;x++){
                    cubo[x][y][z]=(int)(Math.random()*(30));
                    if(cubo[x][y][z]%2!=0)
                        impar[z]=impar[z]+1;
                }
        System.out.println("\n imagen cubo");
        for(int z=0;z<larg;z++){
            System.out.print("\n");
            for(int y=0;y<alt;y++){
                for(int x=0;x<anch;x++){
                    System.out.print("["+cubo[x][y][z]+"]");
                }
                System.out.print("\n");
            }
        }
        int im1=0;
        for(int i=0;i<larg;i++)
            if(impar[im1]<impar[i])
                im1=i;
        if(impar[im1]!=0){
            System.out.println("\n la cara con mas numeros impares es la numero: "+im1);
            for(int y=0;y<alt;y++){
                for(int x=0;x<anch;x++){
                    System.out.print("["+cubo[x][y][im1-1]+"]");
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("no hay impares");
        }
    }
}
