//Arreglos java en 1 y 2 dimensiones
public class Run {
    public static void main(String[] args) {
        //variable comun de java
        //int numero;
        //numero = 10;

        //arreglo unidimensional
        int[] arreglo1D = new int[5];

        //inicializar y asignar valores a cada posicion
        arreglo1D[0] = 10;
        arreglo1D[1] = 20;
        arreglo1D[2] = 30;
        arreglo1D[3] = 40;
        arreglo1D[4] = 50;

        //otra forma de inicializar los valores del arreglos 

        int[] arreglo1DSf ={10,20,30,40,50};

        //System.out.println(arreglo1DSf[2]);

        int[][] arreglo2D = new int[3][4];

        //inicializacion y asignacion de valores primera forma

        arreglo2D[0][0] = 1;  arreglo2D[0][1] = 2;  arreglo2D[0][2] = 3;  arreglo2D[0][3] = 4;
        arreglo2D[1][0] = 5;  arreglo2D[1][1] = 6;  arreglo2D[1][2] = 7;  arreglo2D[1][3] = 8;
        arreglo2D[2][0] = 9;  arreglo2D[2][1] = 10;  arreglo2D[2][2] = 11;  arreglo2D[2][3] = 12;

        //otra forma de inicializar un arreglo bidimensional
        int[][] otraForma2D =
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for( int i=0;i<arreglo2D.length; i++){
            for(int j=0; j<arreglo2D[i].length; j++){
                System.out.print(arreglo2D[i][j]+"\t");
            }
            System.out.println("");
            

        }
    }
}