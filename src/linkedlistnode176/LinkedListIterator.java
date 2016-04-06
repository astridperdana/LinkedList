/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistnode176;

/**
 *
 * @author Kigo
 */




import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

 class LinkedListIterator implements Iterator<LinkedList_5213100176>{
     
     private Node <LinkedList_5213100176> nextNode;
     public LinkedListIterator()
     {
         Node<LinkedList_5213100176> head = null;
         nextNode = head;
     }
     
     
     
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList_5213100176 next() {
        if(!hasNext()) throw new NoSuchElementException();
        LinkedList_5213100176 res = nextNode.data;
        nextNode = nextNode.next;
        return res;
    }
    
    public Iterator<LinkedList_5213100176> iterator() {
    return new LinkedListIterator();
    }

    private static class Node<LinkedList_5213100176> {
        private LinkedList_5213100176 data;
        private Node<LinkedList_5213100176> next;
        public Node(LinkedList_5213100176 data, Node<LinkedList_5213100176> next) {
            this.data = data;
            this.next = next;
        }
    }
 }