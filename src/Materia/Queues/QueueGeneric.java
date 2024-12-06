package Materia.Queues;
import java.util.NoSuchElementException;
import Materia.Models.NodeGeneric;

public class QueueGeneric<T> {
    private NodeGeneric<T> front; //Nodo al frente de la cola
    private NodeGeneric<T> rear; //Nodo al final de la cola
    private int size = 0;

    //Creamos una cola con nodos vacios
    public QueueGeneric(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    //Metodo para encolar nodos
    public void enqueue(T data){
        NodeGeneric<T> newNode = new NodeGeneric<T>(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    //Desencolar el nodo
    public NodeGeneric<T> dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        NodeGeneric<T> node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        size--;
        return node;
    }

    //Retorna el primer nodo
    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.getValue();
    }


    public boolean isEmpty(){
        return front == null;
    }

    public void printQueueGeneric(){
        NodeGeneric<T> current = front;
        while(current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int size(){
        return size;
    }
}
