import Materia.Stacks.*;
import Models.Pantalla;

public class App {

    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();

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


    }
}
