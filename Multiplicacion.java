
/**
 * 1.Hacer un programa que lea dos matriz de n X m, y que las multiplique.
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Multiplicacion
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero de columnas de las matrices ");
        int col=sc.nextInt();
        System.out.println("ingrese numero de filas de las matrices ");
        int fil=sc.nextInt();
        System.out.println("rellene matriz 1");
        int matr1[][]=crear(col,fil);
        System.out.println("rellene matriz 2");
        int matr2[][]=crear(col,fil);
        System.out.println("matriz 1");
        imprimir(matr1);
        System.out.println("matriz 2");
        imprimir(matr2);
        System.out.println("multiplicacion de matrices");
        for(int i=0;i<fil;i++){
            for(int x=0;x<col;x++){
                System.out.print("matriz1 ["+(i+1)+"]["+(x+1)+"]-->("+matr1[i][x]+") x matriz1 [");
                System.out.println((i+1)+"]["+(x+1)+"]-->("+matr2[i][x]+") = "+(matr1[i][x]*matr2[i][x]));
            }
            System.out.println("\n");
        }
    }
    private static int[][] crear(int col,int fil){
        Scanner sc=new Scanner(System.in);
        int matriz[][]=new int[fil][col];
        for(int i=0;i<fil;i++)
            for(int x=0;x<col;x++){
                System.out.println("valor en ["+(i+1)+"]["+(x+1)+"]");
                matriz[i][x]=sc.nextInt();
            }
        return matriz;
    }
    private static void imprimir(int [][] matriz){
        for(int i=0;i<matriz.length;i++){
            System.out.print("|");
            for(int x=0;x<matriz[0].length;x++){
                System.out.print(matriz[i][x]+" | ");
            }
            System.out.println("");
        }
    }
}
