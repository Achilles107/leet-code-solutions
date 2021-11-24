import java.util.Stack;

public interface IStack {
    void push(Object obj);
    Object pop();
}
class StackImpl implements IStack{
    protected Object[] stackArray;
    protected int tos;
    private int capacity;

    StackImpl(int capacity){
        this.stackArray = new Object[capacity];
        this.tos = -1;
        this.capacity = capacity;
    }

    @Override
    public void push(Object obj) {
        stackArray[++tos] = obj;
    }

    @Override
    public Object pop() {
        Object poppedVal = stackArray[tos--];
        stackArray[tos+1] = null;
        return poppedVal;
    }
    public Object peek(){

        return stackArray[tos];
    }
}
interface ISafeStack extends IStack{
    boolean isEmpty();
    boolean isFull();
}
class SafeStackImpl extends StackImpl implements ISafeStack{
    int capacity;
    SafeStackImpl(int capacity) {
        super(capacity);
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        if (tos < 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (tos>=capacity){
            return true;
        }
        return false;
    }
}
