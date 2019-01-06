package sorts;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int firstUnsortedIndex = 0; firstUnsortedIndex <= lastUnsortedIndex; firstUnsortedIndex++) {
                if(array[firstUnsortedIndex]>array[largest]){
                    largest = firstUnsortedIndex;
                }
            }
            swap(array,largest,lastUnsortedIndex);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
    static void swap(int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
