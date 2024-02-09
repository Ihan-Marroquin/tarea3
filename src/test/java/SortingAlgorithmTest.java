import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmTest {
    
    @Test
    public void testGnomeSort() {
        int[] inputArray = {4, 2, 7, 1, 9, 3, 6, 5, 8};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.sort(inputArray);
        
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testMergeSort() {
        int[] inputArray = {4, 2, 7, 1, 9, 3, 6, 5, 8};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray);
        
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testQuickSort() {
        int[] inputArray = {4, 2, 7, 1, 9, 3, 6, 5, 8};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        QuickSort quickSort = new QuickSort();
        quickSort.sort(inputArray);
        
        assertArrayEquals(expectedArray, inputArray);
    }
}
