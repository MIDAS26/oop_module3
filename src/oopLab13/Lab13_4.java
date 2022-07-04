package oopLab13;

import java.util.Iterator;

public class Lab13_4 {
    public static class GenericList<T extends Animal> {
        private Node head;


        class Node {

            private T data;

            public T getData() {
                return data;
            }

            public void setData(T data) {
                this.data = data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            private Node next;

            // Constructor
            Node(T d)
            {
                data = d;
                next = null;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "data=" + data +
                        ", next=" + next +
                        '}';
            }
        }

        public void addHead(T t) {
            Node n = new Node(t);

            n.setNext(head);
            head = n;
        }

        public void iterator() {
            Node current = head;
            while (current != null) {
                if (current.next != null)
                System.out.print(current.next.toString());
                current = current.next;
            }
        }

        public T FindFirstOccurrence(String s)
        {
            Node current = head;
            T t = null;
            while (current != null)
            {
//The constraint enables access to the Name property.
                if (current.getData().getName().equals(s))
                {
                    t = current.getData();
                    break;
                }
                else
                {
                    current = current.next;
                }
            }
            return t;
        }




    }

    public static void main(String[] args) {
        GenericList<Animal> animalGenericList = new GenericList<>();

        Animal animal1 = new Animal("qwewe", 1);
        Animal animal2 = new Animal("q11wewe", 1);
        Animal animal3 = new Animal("qw2313ewe", 1);

        animalGenericList.addHead(animal1);
        animalGenericList.addHead(animal2);
        animalGenericList.addHead(animal3);

        animalGenericList.iterator();
        System.out.println(animalGenericList.FindFirstOccurrence("qwewe"));
    };
}
