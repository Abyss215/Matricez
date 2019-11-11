    
    /**
    * 1.Hacer un programa que lea una matriz de n X m.
    * Y un arreglo tridimensional 
    * (llenarlos con valores aleatorios comprendidos entre 1 y 100)
    * y determinar cuántos elementos de la matriz se encuentran en el arreglo 
    * tridimensional..
    * 
    * @criss_215
    * @version (a version number or a date)
    */
    import java.math.*;
    import java.util.Scanner;
    public class Elementos
    {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Crear matriz");
        System.out.println("ingrese numero de columnas");
        int col=sc.nextInt();
        System.out.println("ingrese numero de filas");
        int fil=sc.nextInt();
        int matr[][]=new int[col][fil];
        System.out.println("Crear matriz cubica");
        System.out.println("ingrese largo");
        int larg=sc.nextInt();
        System.out.println("ingrese ancho");
        int anch=sc.nextInt();
        System.out.println("ingrese alto");
        int alt=sc.nextInt();
        int cubo[][][]=new int[anch][alt][larg];
        for(int z=0;z<larg;z++)
            for(int y=0;y<alt;y++)
                for(int x=0;x<anch;x++)
                    cubo[x][y][z]=(int)(Math.random()*(100-1)+1);
        int cont=0;
        for(int y=0;y<fil;y++)
            for(int x=0;x<col;x++){
                matr[x][y]=(int)(Math.random()*(100-1)+1);
                if(esta(matr[x][y],cubo)){
                    cont++;
                }
            }
            /*opcional inicio*/
        System.out.println("\nimagen de la matriz");
        impriMatr(matr);
        System.out.println("\nimagen del cubo");
        impriCubo(cubo);
            /*opcional fin*/
        System.out.println("\nhay "+cont+" elementos de la matriz en el arreglo cubo");
    }
    private static boolean esta(int mt,int [][][]cubo){
        boolean est=false;
        for(int z=0;z<cubo[0][0].length;z++){
            for(int y=0;y<cubo[0].length;y++){
                for(int x=0;x<cubo.length;x++){
                    if(mt==cubo[x][y][z]){
                        est=true;
                        break;
                    }
                }
                if(est)
                    break;
            }
            if(est)
                break;
        }
        return est;
    }
    /*opcional*/
    private static void impriMatr(int [][] matriz){
        for(int y=0;y<matriz[0].length;y++){
            for(int x=0;x<matriz.length;x++){
                System.out.print("["+matriz[x][y]+"]");
            }
            System.out.println("");
        }
    }
    /*opcional*/
    private static void impriCubo(int [][][]cubo){
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
