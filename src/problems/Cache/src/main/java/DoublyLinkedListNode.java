package problems.Cache.src.main.java;

public class DoublyLinkedListNode<Key> {
    Key key;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    DoublyLinkedListNode(Key key){
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    Key getValue(){
        return key;
    }
    void updateNext(DoublyLinkedListNode node){
        this.next = node;
    }

    void updatePrev(DoublyLinkedListNode node){
        this.prev = node;
    }
}
