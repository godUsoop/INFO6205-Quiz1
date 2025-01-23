public class BubbleSort {
    /**
     * Sorts the given array using the Bubble Sort algorithm.
     *
     * @param a The array to be sorted. It contains elements that implement the Comparable interface.
     *          This allows the method to sort any type of objects that can be compared (e.g., Integers, Strings).
     *
     * Hint: Remember to break the loop if no elements are swapped during a pass.
     *       This optimization ensures the algorithm stops early if the array is already sorted.
     */
    public void sort (Comparable[] a){
//        write your code here.
        int w = -1;
        while (true) {
            int x = 0;
            boolean swap = false;
            while (x < a.length - 1 && x + 1 != w) {
                if (a[x].compareTo(a[x + 1]) > 0) {
                    swap(a, x, x + 1);
                    swap = true;
                }
                x ++;
            }

            if (!swap) {
                break;
            }
            w = x;
        }

    }
    /**
     * Swaps two elements in the given array.
     *
     * @param a The array in which the elements are to be swapped.
     * @param j The index of the first element to swap.
     * @param i The index of the second element to swap.
     */
    private void swap(Object[] a, int j, int i) {
        Object temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
