/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddls;

/**
 *
 * @author labfatec
 */
public class Node implements NodeValue {

    private int id;
    private Object value;
    private Node next;

    public Node() {
        this.id = 0;
        this.next = null;
        this.value = value;
    }

    public Node(int id, Object value) {
        this.id = id;
        this.value = value;
    }

    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
