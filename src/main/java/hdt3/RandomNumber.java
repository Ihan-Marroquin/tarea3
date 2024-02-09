// Clase que genera y guarda números aleatorios en un archivo
package hdt3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumber {
    // Método para generar y guardar números aleatorios en un archivo
    public void generateAndSaveRandomNumbers(String filename, int count) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int num = random.nextInt();
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir el rastreo de la pila si ocurre una excepción de E/S
        }
    }
}