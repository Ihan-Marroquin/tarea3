# Algoritmos de Ordenamiento

Este proyecto implementa varios algoritmos de ordenamiento en Java, incluyendo Gnome Sort, Merge Sort, Quick Sort y Radix Sort. También incluye una clase para generar y guardar números aleatorios en un archivo, así como pruebas unitarias para los algoritmos de ordenamiento.

## Contenido

- [Estructura del Proyecto](#estructura-del-proyecto)
- [Cómo Usar](#cómo-usar)
- [Pruebas Unitarias](#pruebas-unitarias)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Estructura del Tarea

La tarea está estructurado de la siguiente manera:

hdt3/ -> Paquete principal del proyecto
├── FileHandler.java -> Clase para leer números desde un archivo
├── GnomeSort.java -> Implementación de Gnome Sort
├── MergeSort.java -> Implementación de Merge Sort
├── QuickSort.java -> Implementación de Quick Sort
├── RadixSort.java -> Implementación de Radix Sort
└── RandomNumber.java -> Clase para generar y guardar números aleatorios

test/ -> Directorio de pruebas unitarias
└── SortingAlgorithmTest.java -> Pruebas unitarias para los algoritmos de ordenamiento

README.md -> Este archivo README


## Cómo Usar

Puedes utilizar los algoritmos de ordenamiento proporcionados en tu propio proyecto Java. Simplemente importa las clases relevantes y utiliza los métodos apropiados según sea necesario.

Ejemplo de uso de Gnome Sort:

```java
int[] arr = {4, 2, 7, 1, 9, 3, 6, 5, 8};
GnomeSort gnomeSort = new GnomeSort();
gnomeSort.sort(arr);
System.out.println(Arrays.toString(arr)); // Salida: [1, 2, 3, 4, 5, 6, 7, 8, 9]

Pruebas Unitarias
Se han incluido pruebas unitarias utilizando JUnit para verificar la corrección de los algoritmos de ordenamiento implementados. Puedes ejecutar estas pruebas para asegurarte de que los algoritmos funcionan como se espera.

Para ejecutar las pruebas, puedes utilizar tu entorno de desarrollo integrado (IDE) o ejecutar el siguiente comando desde la raíz del proyecto:

mvn test


Aquí tienes un ejemplo de un archivo README.md para tu programa:

markdown
Copy code
# Algoritmos de Ordenamiento

Este proyecto implementa varios algoritmos de ordenamiento en Java, incluyendo Gnome Sort, Merge Sort, Quick Sort y Radix Sort. También incluye una clase para generar y guardar números aleatorios en un archivo, así como pruebas unitarias para los algoritmos de ordenamiento.

## Contenido

- [Estructura del Proyecto](#estructura-del-proyecto)
- [Cómo Usar](#cómo-usar)
- [Pruebas Unitarias](#pruebas-unitarias)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

hdt3/ -> Paquete principal del proyecto
├── FileHandler.java -> Clase para leer números desde un archivo
├── GnomeSort.java -> Implementación de Gnome Sort
├── MergeSort.java -> Implementación de Merge Sort
├── QuickSort.java -> Implementación de Quick Sort
├── RadixSort.java -> Implementación de Radix Sort
└── RandomNumber.java -> Clase para generar y guardar números aleatorios

test/ -> Directorio de pruebas unitarias
└── SortingAlgorithmTest.java -> Pruebas unitarias para los algoritmos de ordenamiento

README.md -> Este archivo README

csharp
Copy code

## Cómo Usar

Puedes utilizar los algoritmos de ordenamiento proporcionados en tu propio proyecto Java. Simplemente importa las clases relevantes y utiliza los métodos apropiados según sea necesario.

Ejemplo de uso de Gnome Sort:

```java
int[] arr = {4, 2, 7, 1, 9, 3, 6, 5, 8};
GnomeSort gnomeSort = new GnomeSort();
gnomeSort.sort(arr);
System.out.println(Arrays.toString(arr)); // Salida: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Pruebas Unitarias
Se han incluido pruebas unitarias utilizando JUnit para verificar la corrección de los algoritmos de ordenamiento implementados. Puedes ejecutar estas pruebas para asegurarte de que los algoritmos funcionan como se espera.

Para ejecutar las pruebas, puedes utilizar tu entorno de desarrollo integrado (IDE) o ejecutar el siguiente comando desde la raíz del proyecto:

bash
Copy code
mvn test
Contribuciones
Las contribuciones son bienvenidas. Si tienes alguna sugerencia, mejora o problema, no dudes en abrir un problema o enviar una solicitud de extracción.

Licencia
Este proyecto está licenciado bajo la Licencia MIT.


Este archivo README.md proporciona una descripción general del proyecto, su estructura, cómo usarlo, cómo ejecutar las pruebas unitarias, cómo contribuir y la licencia bajo la cual se distribuye el proyecto. Asegúrate de personalizarlo según las necesidades específicas de tu proyecto.
