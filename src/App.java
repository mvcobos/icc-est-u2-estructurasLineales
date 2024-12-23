import Controllers.MenuController;
import Ejercicio_02_sorting.StackSorter;
import Ejercicio_01_sign.SignValidator;
import Materia.Queues.*;
import Materia.Stacks.*;
import Models.Pantalla;

public class App {

    public static void main(String[] args) throws Exception {
/*      runStack();
        runStackGeneric();
        runQueue();
        runQueueGeneric();
        menu();*/
        stackSorter1();
        signValidator1();
    }

    public static void runStack(){
        //Instanciar la clase
        Stack stack = new Stack();

        //Agregar valores a la pila
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        stack.printStack();
        System.out.println("Tamanio: " + stack.getSize());
        System.out.println("Tamanio: " + stack.getSize2());


        //Mostrar valores
        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
    }

    public static void runStackGeneric(){
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + router.popNode().getNext().getValue().getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());
        
        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));

        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.printStack();

    }

    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        cola.printQueue();
        System.out.println("Size=" + cola.size());
        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
        

    }

    public static void runQueueGeneric(){
        QueueGeneric<Pantalla> colaGeneric = new QueueGeneric<>();
        colaGeneric.enqueue(new Pantalla(1, "Home Page", "/home"));
        colaGeneric.enqueue(new Pantalla(1, "Menu Page", "/home/menu"));
        colaGeneric.enqueue(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("****QUEUE****");
        colaGeneric.printQueueGeneric();
        System.out.println("size=" + colaGeneric.size());
        System.out.println("Eliminar= " + colaGeneric.dequeue().getValue().getRuta());
        System.out.println("COLA ACTUAL:");
        colaGeneric.printQueueGeneric();
        

    }

    public static void menu(){
        MenuController menuController = new MenuController(null, null);
        menuController.showMenu();
    }

    public static void stackSorter1(){
        StackGeneric<String> mainStack = new StackGeneric<>();
        mainStack.push("1h0l4");
        mainStack.push("u");
        mainStack.push("1");
        mainStack.push("a");
        mainStack.push("5");
        mainStack.push("e");

        System.out.println("Stack original: ");
        mainStack.printStack();
        StackSorter<String> sorter = new StackSorter<>();
        sorter.sortStack(mainStack);
        System.out.println("Stack ordenado: ");
        mainStack.printStack();
    }

    public static void signValidator1(){
        SignValidator sv = new SignValidator();
        String input1 = "([]){}";
        String input2 = "({)}";
        String input3 = "(}{[]})";

        System.out.println("Input: " + input1 + " -> Output: " + sv.isValid(input1)); // true
        System.out.println("Input: " + input2 + " -> Output: " + sv.isValid(input2)); // false
        System.out.println("Input: " + input3 + " -> Output: " + sv.isValid(input3)); // false
    }
}