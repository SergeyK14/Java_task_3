package Homework_3;

import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add (1);
        arr.add (2);
        arr.add (7);
        arr.add (8);
        arr.add (11);
        arr.add (12);
        arr.add (14);
        int min_e = arr.get(0);
        int max_e = arr.get(0);
        float sr_arif = arr.get(0);
        for (int i = 1; i < arr.size(); i++){
            if(arr.get(i) > arr.get(i-1)){
                max_e = arr.get(i);
            }
            if(min_e >= arr.get(i)){
                min_e = arr.get(i);
            }
            sr_arif += arr.get(i);  
        }
    sr_arif = (sr_arif/arr.size());
    System.out.println(arr.size());
    System.out.printf("Макс = %s Мин = %s Ср. арифм-е = %f", max_e, min_e, sr_arif);   
    }
}
