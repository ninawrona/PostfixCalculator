import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> list;

    public Stack(){
        this.list = new LinkedList<T>();
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return list.getLast();
    }

    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        T elm = list.get(list.size()-1);
        System.out.println("POP: " + elm);
        list.remove(elm);
        return elm;
    }

    public void push(T elm){
        list.add(elm);
        System.out.println("PUSH: " + elm);
    }

}
