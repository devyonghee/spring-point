package me.devyonghee.eventpublisher;


public class MyEvent {
    private int data;

    public MyEvent(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
