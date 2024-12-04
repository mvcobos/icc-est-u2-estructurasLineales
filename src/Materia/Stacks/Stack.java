package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {

    private Node top;

    //Creamos la pila con la cima nula o vacia
    public Stack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }
    
    public boolean isEmpty(){
        return top == null;
    }

}
