public class EstudoArrayB {


    public static void main(String args[]){

        Integer[][] lista1 ;


        lista1 = new Integer[][]{{1, 2, 3},{4,5,6},{7,8,9}};

        for(int linha = 0 ; linha < lista1.length; linha++){
                // For que passa pelas colunas
                for(int coluna = 0 ; coluna < lista1[linha].length ; coluna++){
                System.out.printf("%d ", lista1[linha][coluna]);
                }

            }
        }
    }

