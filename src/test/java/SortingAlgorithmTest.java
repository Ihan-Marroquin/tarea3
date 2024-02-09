import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// Clase de prueba para los algoritmos de ordenamiento
public class SortingAlgorithmTest {
    
    // Prueba para GnomeSort
    @Test
    public void testGnomeSort() {
        int[] inputArray = {4, 2, 7, 1, 9, 3, 6, 5, 8}; // Arreglo de entrada desordenado
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Arreglo esperado después de ordenar
        
        // Crear una instancia del algoritmo de GnomeSort
        GnomeSort gnomeSort = new GnomeSort();
        // Ordenar el arreglo de entrada
        gnomeSort.sort(inputArray);
        
        // Verificar si el arreglo ordenado es igual al arreglo esperado
        assertArrayEquals(expectedArray, inputArray);
    }

    // Prueba para MergeSort
    @Test
    public void testMergeSort() {
        int[] inputArray = {4, 2, 7, 1, 9, 3, 6, 5, 8}; // Arreglo de entrada desordenado
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Arreglo esperado después de ordenar
        
        // Crear una instancia del algoritmo de MergeSort
        MergeSort mergeSort = new MergeSort();
        // Ordenar el arreglo de entrada
        mergeSort.sort(inputArray);
        
        // Verificar si el arreglo ordenado es igual al arreglo esperado
        assertArrayEquals(expectedArray, inputArray);
    }

    // Prueba para QuickSort
    @Test
    public void testQuickSort() {
        int[] inputArray = {4, 2, 7, 1, 9, 3, 6, 5, 8}; // Arreglo de entrada desordenado
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Arreglo esperado después de ordenar
        
        // Crear una instancia del algoritmo de QuickSort
        QuickSort quickSort = new QuickSort();
        // Ordenar el arreglo de entrada
        quickSort.sort(inputArray);
        
        // Verificar si el arreglo ordenado es igual al arreglo esperado
        assertArrayEquals(expectedArray, inputArray);
    }
}
