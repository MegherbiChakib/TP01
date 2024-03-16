package exo3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class binarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        assertEquals(0, BinarySearch.binarySearchResolved(array, 1)); // L'élément 1 est à l'indice 0
        assertEquals(4, BinarySearch.binarySearchResolved(array, 9)); // L'élément 9 est à l'indice 4
        assertEquals(9, BinarySearch.binarySearchResolved(array, 19)); // L'élément 19 est à l'indice 9
        assertEquals(-1, BinarySearch.binarySearchResolved(array, 2)); // L'élément 2 n'est pas présent dans le tableau
        assertEquals(-1, BinarySearch.binarySearchResolved(array, 20)); // L'élément 20 n'est pas présent dans le tableau
    }
    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearchResolved(null, 5);
        });
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        assertEquals(-1, BinarySearch.binarySearchResolved(emptyArray, 5)); // Rien n'est trouvé dans un tableau vide
    }
}
