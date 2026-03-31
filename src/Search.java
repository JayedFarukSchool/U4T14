import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static int linearSearchFirst(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }



    public static int linearSearchLast(int[] arr, int target){
        for (int i = arr.length-1; i>=0; i--){
            if (arr[i] == target) return i;
        }
        return -1;
    }


    public static boolean linearSearchFound(int[] arr, int target){
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target) return true;
        }
        return false;
    }


    public static int linearSearchCount(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target) count++;
        }
        return count;
    }


    public static int linearSearchFirst(ArrayList<Integer> arr, int target){
        int[] array = new int[arr.size()];
        for (int i = 0; i<arr.size(); i++){
            array[i] = arr.get(i);
        }
        return linearSearchFirst(array, target);
    }

    public static int linearSearchLast(ArrayList<Integer> arr, int target){
        int[] array = new int[arr.size()];
        for (int i = 0; i<arr.size(); i++){
            array[i] = arr.get(i);
        }
        return linearSearchLast(array, target);
    }

    public static boolean linearSearchFound(ArrayList<Integer> arr, int target){
        int[] array = new int[arr.size()];
        for (int i = 0; i<arr.size(); i++){
            array[i] = arr.get(i);
        }
        return linearSearchFound(array, target);
    }

    public static int linearSearchCount(ArrayList<Integer> arr, int target){
        int[] array = new int[arr.size()];
        for (int i = 0; i<arr.size(); i++){
            array[i] = arr.get(i);
        }
        return linearSearchCount(array, target);
    }



}