package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        while (top <= bottom && left <= right){
//            left to right
            for (int i = left; i <= right; i++){
                result.add(arr[top][i]);
            }
            top++;

//        top to bottom
            for (int i = top; i <= bottom; i++){
                result.add(arr[i][right]);
            }
            right--;

//        right to left
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right){
//                bottom to top
                for (int i = bottom; i >= top; i--){
                    result.add(arr[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> spiralOrder = spiralOrder(arr);
        System.out.println(spiralOrder);
    }
}
