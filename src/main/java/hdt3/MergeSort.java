// Clase que implementa el algoritmo de ordenamiento Merge Sort
package hdt3;

public class MergeSort {
    // Método para iniciar el proceso de ordenamiento con Merge Sort
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    // Método recursivo para dividir y combinar los elementos del arreglo
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Método para combinar dos subarreglos ordenados en uno solo
    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }
    }
}