public class sorter{
    public static void main(String[] args) {
        System.out.println("Let's start");
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            
            array[j + 1] = key;
        }
    }
}