package model;

public class Board {
    private PipeLine head;
    private PipeLine tail;

    public Board() {
    }

    public PipeLine getHead() {
        return head;
    }

    public void setHead(PipeLine head) {
        this.head = head;
    }

    public PipeLine getTail() {
        return tail;
    }

    public void setTail(PipeLine tail) {
        this.tail = tail;
    }
}
