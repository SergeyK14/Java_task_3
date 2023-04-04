//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Homework_3;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        int [] arr = {2, 5, 4, 8, 1, 10, 8, 90, 3, 4};
        ArrayList<Integer> arr_2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0 ){
                arr_2.add(arr[i]); 
            }
        }
        System.out.println(arr_2);
    }
}
