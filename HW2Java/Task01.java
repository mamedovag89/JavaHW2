// Реализуйте алгоритм сортировки пузырьком числового массива
//  (введён вами),результат после каждой итерации запишите в лог-файл.


/**
 * Task01
 */
public class Task01 {

public static void bubbleSort(int[]array) {
    for(int i = 0; i <array.length - 1; i++){
        for (int j = 0; j<array.length - i - 1; j++){
            if (array[j +1] < array[j]){
                int swap = array[j];
                array[ j+1] = swap;

            }
        }
    }
}
public static void main (String args[]){
    int[] array = { 12, 6, 5, 2, 16, 10};
    bubbleSort(array);
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i] + "\n");
    }
}
}