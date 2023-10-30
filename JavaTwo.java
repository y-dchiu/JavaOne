package com.xpanxion.assignments.student.JavaOneII;
import java.util.*;
import java.text.*;
import java.util.stream.*;
import java.util.LinkedList;
import java.util.Queue;
public class JavaTwo {

    public JavaTwo() {}

    public void ex1() {
        System.out.println("Student 1: ex1.");
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        StringBuilder nameList = new StringBuilder();
        ArrayList <String> firstName = new ArrayList<>();
        ArrayList <String> lastName = new ArrayList<>();
        int person = 1;
        while (!exit){
            System.out.print("Enter Person: "+person+", ");
            person++;
            String name = input.nextLine();

            if(name.equals("done")){
                exit = true;
                break;
            }

            nameList.append(name);
            nameList.append(" ");
        }
        String[] names = nameList.toString().split(" ");
        for (int i=0;i<names.length;i++){
            if (i%2==0){
                firstName.add(names[i]);
            }
            if (i%2==1){
                lastName.add(names[i]);
            }
        }

        for (int i=0;i<lastName.size();i++){
            System.out.println("Person{id="+(i+1)+", firstName='"+firstName.get(i)+
                    "', lastName='"+lastName.get(i)+"'}");
        }
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        HashMap<Integer,Person> map = new HashMap<>();
        Person person1 = new Person(1, "Peter","Jones");
        Person person2 = new Person(2, "John","Smith");
        Person person3 = new Person(3,"Mary","Jane");
        map.put(1,person1);
        map.put(2,person2);
        map.put(3,person3);
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        while (!exit) {
            System.out.print("Enter Person ID: ");
            if (input.toString().equals("done")){
                exit = true;
                break;
            }
            String id = input.nextLine();
            System.out.println("Person{id="+id+", firstName='"
                    +map.get(Integer.parseInt(id)).getFirstName() +"', lastName='"
                    +map.get(Integer.parseInt(id)).getLastName()+"'}");
        }
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p.toString());
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
        Calculator calc = new Calculator();
        calc.calculate();
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        var newPersonList = personList.stream()
                .map(p -> new Person(p.getId(), p.getFirstName(), "xxx"))
                .toList();

        for (Person p : newPersonList) {
            System.out.println(p);
        }

    }
    public void ex8() {
        System.out.println("Student 1: ex8.");
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList = personList.stream()
                .sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
                .collect(Collectors.toList());

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream()
                .filter(p -> p.getLastName().equals("Smith"))
                .toList();

        for (Person p : filteredList) {
            System.out.println(p);
        }

    }

    public void ex10() throws InterruptedException {
        System.out.println("Student 1: ex10.");
                Queue<Cat> catQueue = new LinkedList<>();

                catQueue.add(new Cat("Alice"));
                catQueue.add(new Cat("Bob"));
                catQueue.add(new Cat("Charlie"));
                catQueue.add(new Cat("Dan"));

                while (!catQueue.isEmpty()) {
                    System.out.println(catQueue);
                    catQueue.remove();
                    Thread.sleep(3000);
                }
    }
}


