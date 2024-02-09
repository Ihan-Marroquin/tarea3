package hdt3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Generar un arreglo de números aleatorios del 1 al 3000
        int[] arr = generateRandomArray(3000);

        GnomeSort gnomeSort = new GnomeSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        RadixSort radixSort = new RadixSort();

        // Ordenar el arreglo con cada algoritmo de ordenamiento
        gnomeSort.sort(arr.clone());
        mergeSort.sort(arr.clone());
        quickSort.sort(arr.clone());
        radixSort.sort(arr.clone());
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(3000) + 1; // Números aleatorios del 1 al 3000
        }
        return arr;
    }
}

