package Materia.Stacks;
import java.util.EmptyStackException;
import Materia.Models.NodeGeneric;

public class StackGeneric<T> {
    private NodeGeneric<T> top;
    private int size;
    
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }


    public void push(T data){
        NodeGeneric<T> newNode = new NodeGeneric<T>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
        /* 
        if(isEmpty()){
            top = newNode;
        } else 
            
        */
    }

    public NodeGeneric<T> popNode(){
        if(isEmpty()){ //Si la pila esta vacia
            throw new EmptyStackException(); //Lanza una excepcion 
        }
        NodeGeneric<T> value = top;
        top = top.getNext();
        size--; //Decrementa el tamanio
        return value;
    }

    public T pop(){
        if(isEmpty()){ //Si la pila esta vacia
            throw new EmptyStackException(); //Lanza una excepcion 
        }
//        T value = top.getValue(); 
        T hi = top.getNext().getValue();//El nodo top sera el siguiente
        top = top.getNext();
        size--; //Decrementa el tamanio
        return hi;
    }


    public boolean isEmpty(){
        return top == null;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack(){
        NodeGeneric<T> current = top;
        while(current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }


    public NodeGeneric<T> getTop() {
        return top;
    }


    public void setTop(NodeGeneric<T> top) {
        this.top = top;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }
    

}
