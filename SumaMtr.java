/**
 * 1.Hacer un programa que dada una matriz identifique si la suma los valores es igual,
 * mayor o menor que los valores almacenados en otra matriz.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumaMtr
{
    public static void main(String [] args){
        int matr1[][]=crear(1);
        int matr2[][]=crear(2);
        int sumaM1=suma(matr1);
        int sumaM2=suma(matr2);
        impri(matr1,1);
        impri(matr2,2);
        if(sumaM1>sumaM2){
            System.out.println("la matriz 1 es mayor y la matriz 2 es la menor");
        }else if(sumaM1<sumaM2){
            System.out.println("la matriz 2 es mayor y la matriz 1 es la menor");
        }else{
            System.out.println("la matriz 1 y la matriz 2 son iguales");
        }
    }
    private static int suma(int [][] matr){
        int suma=0;
        for(int i=0;i<matr.length;i++){
            for(int x=0;x<matr[0].length;x++){
                suma+=matr[i][x];
            }
        }
        return suma;
    }
    private static int[][] crear(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero de columnas de la matriz "+n);
        int col=sc.nextInt();
        System.out.println("ingrese numero de filas de la matriz "+n);
        int fil=sc.nextInt();
        int matriz[][]=new int[fil][col];
        for(int i=0;i<fil;i++)
            for(int x=0;x<col;x++){
                System.out.println("valor en ["+(i+1)+"]["+(x+1)+"]");
                matriz[i][x]=sc.nextInt();
            }
        return matriz;
    }
    private static void impri(int [][] matriz,int n){
        System.out.println("\n matriz "+n);
        for(int i=0;i<matriz.length;i++){
            System.out.print("|");
            for(int x=0;x<matriz[0].length;x++){
                System.out.print(matriz[i][x]+" | ");
            }
            System.out.println("");
        }
    }
}
