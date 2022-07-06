package Atividades.src.com.sharkdays.atividadeVetorMatriz;

public class Matriz3d {
    public static void main(String[] args) {

        int [][][] matriz =new int[2][2][2];

        for(int i=0;i < matriz.length;++i){
            for(int j=0;j<matriz.length;++j){
                for(int k=0;k<matriz.length;++k){
                    matriz[i][j][k]=i+j+k;
                }

            }
        }

        for(int i=0;i<matriz.length;++i){
            for(int j=0;j<matriz.length;++j){
                for(int k=0;k<matriz.length;++k){
                    System.out.println(matriz[i][j][k]);
                }

            }
        }
    }

}
