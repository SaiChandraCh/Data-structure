package sorts;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
        for (int i = 1; i < array.length; i++) {
            int selectedNumber = array[i];
            int j;
            for (j = i; j > 0 && array[i-1]>selectedNumber; j--) {
                array[i] = array[i-1];
            }
            array[j]=selectedNumber;
        }
    }
}
