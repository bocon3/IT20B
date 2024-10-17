
package it20b_bocon;

import java.util.LinkedList;
 
public class IT20B_BOCON {

    
    public static void main(String[] args) {
       LinkedList<String> animals = new LinkedList<>();


        animals.add("Dog");
        animals.addFirst("Cat");
        animals.addLast("Elephant");
        animals.add(1, "Lion");

        System.out.println("Linked List Original: " + animals);
        System.out.println(animals.size());


        if (animals.contains("Lion")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = animals.contains("Lion");
        System.out.println(containslion);
    }
    
}
