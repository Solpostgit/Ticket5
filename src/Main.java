import java.util.Arrays;

public class Main {
    public static void calcArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { //к каждому чётному
                arr[i] = arr[i] + 1; //прибавили единицу
            }
        }
        for (int i = 2; i < 7; i++) { //вывод элементов массива
            System.out.print(arr[i] + " "); //с 3-го по 7-й
        }
    }

    public static void main(String[] args) {
        int[] rack = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(rack));
        calcArr(rack); //вызвали метод calcArr
    }
}