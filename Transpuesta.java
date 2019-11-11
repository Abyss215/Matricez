
/**
 *1.Realizar un programa que lea una matriz de n X m, y 
 *que imprima la matriz transpuesta
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Transpuesta
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero de columnas");
        int col=sc.nextInt();
        System.out.println("ingrese numero de filas");
        int fil=sc.nextInt();
        int matr[][]=new int[fil][col];
        int transM[][]=new int[col][fil];
        for(int i=0;i<fil;i++)
            for(int x=0;x<col;x++){
                System.out.println("valor en ["+(i+1)+"]["+(x+1)+"]");
                matr[i][x]=sc.nextInt();
                transM[x][i]=matr[i][x];
            }
        System.out.println("matriz original");
        imprimir(matr);
        System.out.println("matriz transpuesta");
        imprimir(transM);
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
