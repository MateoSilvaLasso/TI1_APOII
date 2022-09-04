package model;

public abstract class PipeLine {
    private PipeLine next;
    private char x;

    public PipeLine getNext() {
        return next;
    }

    public void setNext(PipeLine next) {
        this.next = next;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }
}


