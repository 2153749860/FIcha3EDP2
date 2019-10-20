/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3edp2ex1;


/**
 *
 * @author tiago
 */
public class LinkedStack<T> implements StackADT<T> {
    
    private int count;
    private LinearNode<T> head;

    public LinkedStack() {
        this.count = 0;
        this.head = null;
    }

    @Override
    public void push(T element) {
        LinearNode newNode = new LinearNode(element);
        if(this.count == 0){
            this.head = newNode;
            this.count++;
        }
        else{
            newNode.setNext(this.head);
            this.head = newNode;
            this.count++;
        }
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if(this.count==0){
            throw new EmptyCollectionException("Não tem!");
        } else{
            LinearNode<T> current = this.head;
            this.head = this.head.getNext();
            current.setNext(null);
            this.count--;
            return current.getElement();
        }
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("Lista vazia!");
        }
        else{
            return this.head.getElement();
        }
    }

    @Override
    public boolean isEmpty() {
        if(this.count == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public String toString() {
        LinearNode<T> current = this.head;
        StringBuilder str = new StringBuilder();
        str.append("Head: ");str.append(this.head.getElement());str.append("\n");
        str.append("Tamanho: ");str.append(this.count);str.append("\n");
        

        while (current != null) {
            str.append(current.getElement());
            str.append("\n");
            current = current.getNext();
        }
        return str.toString();
    }
    
    
    
}
