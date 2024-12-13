package Ejercicio_02_sorting;
import Materia.Stacks.StackGeneric;

public class StackSorter <T>{

    public void sortStack(StackGeneric<T> mainStack) {
        StackGeneric<T> auxStack = new StackGeneric<>();

        
        while (!mainStack.isEmpty()) { // Ordenar los elementos
            T temp = mainStack.pop();

            while (!auxStack.isEmpty() && ((Comparable<T>) auxStack.peek()).compareTo(temp) > 0) { // Mover elementos mayores de auxStack a mainStack
                mainStack.push(auxStack.pop());
            }
            auxStack.push(temp);  // Insertar el elemento en su posición correcta en auxStack
        }

        
        while (!auxStack.isEmpty()) { // Transferir de vuelta los elementos a mainStack si es necesario
            mainStack.push(auxStack.pop());
        }
    }
}