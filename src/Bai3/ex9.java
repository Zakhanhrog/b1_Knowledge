package Bai3;

public class ex9 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Max value in 2-way array: " + valueMax2WayArray(array));
    }
    public static int valueMax2WayArray(int[][] array){
        int max = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

}
