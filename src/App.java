import Materia.Stacks.Stack;
public class App {

    public static void main(String[] args) throws Exception {
        runStack();

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
        int cont = stack.getSize();
        System.out.println("Tamanio: " + cont);

        System.out.println(stack.getSize2());


        //Mostrar valores
        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
    }
}
