public class StackOfIntegers {
    private int size=0;
    private int elements[];

    public StackOfIntegers() {
        elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty(){
        return size<=0;
    }

    public int peek(){
        int data;
        data = elements[size-1];
        return data;
    }

    public void push(int data){
        elements[size]=data;
        size++;
    }

    public int pop(){
        int data;
        size--;
        data = elements[size];
        elements[size] =0;
        return data;
    }

    public int getSize() {
        return size;
    }

}
