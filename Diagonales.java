/**
 * 1.Hacer un programa que dadas tres matrices
 * identifique si las tres diagonales son iguales.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Diagonales
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero de columnas de las matrices ");
        int col=sc.nextInt();
        System.out.println("ingrese numero de filas de las matrices ");
        int fil=sc.nextInt();
        int matr1[][]=crear(col,fil);
        int matr2[][]=crear(col,fil);
        int matr3[][]=crear(col,fil);
        
        System.out.println("matriz 1");
        imprimir(matr1);
        System.out.println("\n matriz 2");
        imprimir(matr2);
        System.out.println("\n matriz 3");
        imprimir(matr3);
        System.out.println("\n");
        if(col<fil){
            DIgual(matr1,matr2,matr3,col);
        }else{
            DIgual(matr1,matr2,matr3,fil);
        }
    }
    private static void DIgual(int matr1[][],int matr2[][],int matr3[][],int a){
        boolean igual=false;
        for(int i=0;i<a;i++){
            if(matr1[i][i]==matr2[i][i]&&matr1[i][i]==matr3[i][i]){
                igual=true;
            }else{
                igual=false;
                break;
            }
        }
        if(igual){
            System.out.println("las diagonales son iguales");
        }else{
            System.out.println("las diagonales no son iguales");
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
