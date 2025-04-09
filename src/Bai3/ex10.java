package Bai3;

public class ex10 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, -1, 6}, {7, 8, 9}};
        System.out.println("Min value in 2-way array: " + valueMin2WayArray(array));
    }
    public static int valueMin2WayArray(int[][] array){
        int min = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
