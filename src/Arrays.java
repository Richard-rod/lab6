//Richard Rodriguez
public class Arrays {
    //Method 1
    public static void printArray (int [][] array){
        int row = array.length-1;
        int col = array[0].length-1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                System.out.format("%-10d",array[i][j]);
            }
        }
    }
    //method 4
    public static void fillDown (int [][] array, int step) {
        int row = array.length-1;
        int col = array[0].length-1;
        int n = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                array[i][j] = step*(n+1);
                n++;
            }
        }
    }
    //method 5
    public static void fillRight (int [][] array, int step) {
        int row = array.length;
        int col = array[0].length;
        int n = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                array[i][j] = step*(n+1);
                n++;
            }
        }
    }
    // method 2
    public static int getColSum (int [][] array, int colIndex) {
        int row = array.length-1;
        int col = array[0].length-1;
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
            sum = array[colIndex][j];
            }
        }
        return (sum);
    }
    public static void main (String[] args) {
    int[][] fillRightArray = new int [5][8];
    fillRight(fillRightArray,2);
    fillDown(fillRightArray,2);
    printArray(fillRightArray);
        System.out.println();
    printArray(fillRightArray);
    }
}
