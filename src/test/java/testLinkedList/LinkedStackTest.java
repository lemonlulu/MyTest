package testLinkedList;

/**
 * Created by lemon on 14-11-28.
 */
public class LinkedStackTest<T> {
    private class Node<T> {
        T item;
        Node<T> next;

        Node() {
            this.item = null;
            this.next = null;
        }

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    private void push(T item) {
        top = new Node<>(item, top);
    }

    private T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStackTest<String> test = new LinkedStackTest<>();
        for(String s:"Ok, Let's begin test.".split(" "))
            test.push(s);
        String s;
        while((s = test.pop())!=null)
            System.out.println(s);
    }
}
