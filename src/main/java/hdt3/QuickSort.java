// Clase que implementa el algoritmo de ordenamiento Quick Sort
package hdt3;

public class QuickSort {
    // Método para iniciar el proceso de ordenamiento con Quick Sort
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // Método recursivo para dividir y ordenar los elementos del arreglo
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Método para dividir el arreglo y colocar el pivote en su posición correcta
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}