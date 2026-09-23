/*Yanalis Adames 
Programming language: Java 
IDE/Editor : VS Code */
public class Homework2{
    public static void main(String[] args){
        int [] arr = {10, 2, 82, 4, 22, 29, 13, 33, 45, 1, 12, 8};
        int n = arr.length;
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        mergeSort(arr);

        System.out.print("Merge sorted result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Linear Search Results:  ");
        printSearchResult(arr, 4);
        printSearchResult(arr, 22);
        printSearchResult(arr, 18);

        System.out.println("Binary Search Results");
        printSearchResultsBinary(arr, 2);
        printSearchResultsBinary(arr, 45);
        printSearchResultsBinary(arr, 34);

    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length -1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Bubble sorted result: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr){
        int length = arr.length;
        if(length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for (; i < length; i++){
            if(i < middle){
                leftArray[i] = arr[i];

            }else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);

    }
    private static void merge(int [] leftArray, int[] rightArray, int[] arr ){
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;
        

        while(l < leftSize && r < rightSize){
            if(leftArray[l]<rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            }else{
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            arr[i] = leftArray[l];
            i++;
            l++;

        }
        while(r < rightSize){
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }
    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void printSearchResult(int[] arr, int target) {
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Searching for " + target + ": found at index " + result);
        } else {
            System.out.println("Searching for " + target + ": not found");
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }
    public static void printSearchResultsBinary(int[] arr, int target){
        int resultBinary = binarySearch(arr, target);
        if (resultBinary != -1) {
            System.out.println("Searching for " + target + ": found at index " + resultBinary);
        } else {
            System.out.println("Searching for " + target + ": not found");
        }
    }
}