import java.util.ArrayList;

public class MatrixZero{
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,7},
            {0,6,7,8},
            {9,0,1,2},
            {3,4,5,6}
        };

        ArrayList<Integer> remI = new ArrayList<>();
        ArrayList<Integer> remJ = new ArrayList<>();


        for(int i =0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    remI.add(i);
                    remJ.add(j);
                }
            }
        }


        for(int i =0; i<matrix.length;i++){ 
            for (int j = 0; j < remI.size(); j++) {
                if (i == remI.get(j) ){
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[i][k]=0;
                    }
                }
            }
        }

                for(int i =0; i<matrix.length;i++){ 
            for (int j = 0; j < remJ.size(); j++) {
                if (i == remJ.get(j) ){
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][i]=0;
                    }
                }
            }
        }


                for(int i =0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length; j++){
                    System.out.print(matrix[i][j]+" ");
            }
              System.out.println();
        }
    }
}