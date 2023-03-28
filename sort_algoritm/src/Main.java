import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(100);
        }
        print(unsortedArray);

        int[] sortedArrayBySelectionSort = selectionSort(unsortedArray);
        print(sortedArrayBySelectionSort);
        int[] sortedArrayByBubbleSort = bubbleSort(unsortedArray);
        print(sortedArrayByBubbleSort);




    }

    public static int[] selectionSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < array.length; j++) {
                if (array[j]<min) {
                    min = array[j];
                    index = j;
                }
            }
            if (index>-1) {
                int z = array[i];
                array[i] = array[index];
                array[index] = z;
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        for (int j = 0; j<array.length ; j++) {
            for (int i = array.length-1; i > j; i--) {
                if (array[i] < array[i - 1]) {
                    int z = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = z;
                }
            }
        }
        return array;
    }
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }


}