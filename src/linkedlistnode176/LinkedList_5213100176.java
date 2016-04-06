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
public interface LinkedList_5213100176 {
   public void addNext(LinkedList_5213100176 node);
//   method ini bertujuan untuk memberi nilai baru pada next LinkedList
//   parameter node - adalah sebuah variabel bertipe LinkedListNode 
   public void addPrev(LinkedList_5213100176 node);
//   method ini bertujuan untuk memberi nilai baru pada prev LinkedListNode
//   parameter node - adalah sebuah variabel bertipe LinkedListNode
   public LinkedList_5213100176 next();
//   method next digunakan untuk mengembalikan next Node , jika tidak ada maka kembalikan null
//   return LinkedList_5213100176
   public LinkedList_5213100176 prev();
//   method prev digunakan untuk mengembalikan prev Node , jika tidak ada maka kembalikan null
//   return LinkedList_5213100176
   public LinkedList_5213100176 removePrev();
//   method removeNext berarti akan membuat prev Linkedlist menjadi null, jika sebelum operasi ini, prev LinkedListNode tidak null maka kembalikan namun jika memang null maka kembalikan null saja.
//   return LinkedList_5213100176   
   public LinkedList_5213100176 removeNext();
//   method removeNext berarti akan membuat next LinkedlistNode menjadi null, jika sebelum operasi ini, next LinkedListNode tidak null maka kembalikan namun jika memang null maka kembalikan null saja.
//   return LinkedList_5213100176
   public void setValue(java.lang.Object object);
//   menyimpan nilai pada LinkedListNode
//   parameter object - adalah sebuah variabel bertipe Object
   java.lang.Object value();
//   mengembalikan nilai pada sebuah LinkedListNode
//   return object
}
