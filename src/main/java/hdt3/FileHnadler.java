// Clase que maneja la lectura de números desde un archivo
package hdt3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHnadler {
    // Método para leer números desde un archivo y devolverlos en un arreglo de enteros
    public int[] readNumbersFromFile(String filename) {
        List<Integer> numbersList = new ArrayList<>(); // Lista para almacenar los números leídos
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) { // Leer línea por línea hasta el final del archivo
                int num = Integer.parseInt(line.trim()); // Convertir la línea a entero y agregarlo a la lista
                numbersList.add(num);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir el rastreo de la pila si ocurre una excepción de E/S
        }

        // Convertir la lista de enteros a un arreglo de enteros
        int[] numbers = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            numbers[i] = numbersList.get(i);
        }
        return numbers; // Devolver el arreglo de enteros
    }
}