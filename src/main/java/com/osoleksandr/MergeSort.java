package com.osoleksandr;

public class MergeSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length);
    }

    public static void sort(int[] array, int low, int high) {

        int N = high - low;

        if (N <= 1) return;

        int mid = low + N / 2;

        sort(array, low, mid);
        sort(array, mid, high);

        int[] tempArray = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) {
            if (i == mid) {
                tempArray[k] = array[j];
                j++;
            } else if (j == high) {
                tempArray[k] = array[i];
                i++;
            } else if (array[j] < array[i]) {
                tempArray[k] = array[j];
                j++;
            } else {
                tempArray[k] = array[i];
                i++;
            }
        }

        for (int k = 0; k < N; k++) {
            array[low + k] = tempArray[k];
        }
    }
}
