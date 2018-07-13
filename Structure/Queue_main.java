package Structure;

class Queue<T>{
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    // add, remove, peek, isEmpty

    public void add(T data){
        Node<T> t = new Node<T>(data);
        if(last != null){
            last.next = t;
        }
        last = t;
        if(first == null){
            first = last;
        }
    }

    public T remove(){
        if(first == null){
            System.out.println("First is NULL");
        }
        T data = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        return data;
    }

    public T peek(){
        if(first == null){
            System.out.println("First is NULL");
        }

        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

}


public class Queue_main {
    public static void main(String[] args){
        Queue<Integer> q = new Queue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());



    }
}
