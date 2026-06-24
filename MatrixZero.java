import java.util.ArrayList;

public class MatrixZero{
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,7},
            {0,6,7,8},
            {9,0,1,2},
            {3,4,5,6}
        };

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();


        for(int i =0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }


for (int row : rows) {
    for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = 0;
    }
}

for (int col : cols) {
    for (int row = 0; row < matrix.length; row++) {
        matrix[row][col] = 0;
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