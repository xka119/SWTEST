package Structure;
/*
자료구조 테스트
 */


class Stack<T>{
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }
    private Node<T> top;

    //pop

    public T pop(){
        if(top == null){
            System.out.println("Top이 비었습니다.");
        }

        T item = top.data;
        top = top.next;
        return item;
    }

    //push
    public void push(T data){
        Node<T> t = new Node<T>(data);
        t.next = top;
        top = t;
    }

    public T peek(){
        if(top == null){
            System.out.println("asdasd");
        }

        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}


public class Stack_main {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());

    }
}
