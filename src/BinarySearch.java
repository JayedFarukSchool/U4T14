public class BinarySearch {
    public static int binarySearch(int[] elements, int target) {
        int loopCounter = 0;
        int leftIdx = 0;
        int rightIdx = elements.length - 1;
        while (leftIdx <= rightIdx) {
            loopCounter++;
            System.out.print(loopCounter + " ");
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (target < elements[middleIdx]) rightIdx = middleIdx - 1;
            else if (target > elements[middleIdx]) leftIdx = middleIdx + 1;
            else {return middleIdx;}
        }
        return -1; // not found
    }
}