//code for adding new element in the frist of the LinkedList
import org.w3c.dom.Node;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
class AddLink{
//    here we make function to add the new element in the linked list
//    lets the LinkedList in comman ant thenn pass
    LinkedList<Integer> oi = new LinkedList<>();
    AddLink() {
        oi.add(1);
        oi.add(2);
        oi.add(13);
        oi.add(14);
        System.out.println("linkedlist Elemet "+oi);
        stage();
    }

//    elements are added in the code
//    give each method new tasks.

    public void stage(){
        int newNode = 61;
        oi.addFirst(newNode);
        System.out.println("new Linkedlist "+ oi);



    }
}

public class LinkedListall {
    public static void main(String[] args) {
//        use just for calling
        AddLink rt = new AddLink();

    }

    }

