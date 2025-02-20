package builderDesignPatterns;

//Got it! Here's the shallow copy example where I print the object before and after cloning, without modifying anything.

//Shallow Copy Example (Printing Before and After Cloning)

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;  // Reference type

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding clone() for shallow copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    void display() {
        System.out.println("Person@" + Integer.toHexString(hashCode()) + " [name=" + name + ", address=" + address + "]");
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person person1 = new Person("John", addr);

        // Printing original object before cloning
        System.out.println("Before Cloning:");
        person1.display();

        // Creating a shallow copy
        Person person2 = (Person) person1.clone();

        // Printing cloned object
        System.out.println("\nAfter Cloning:");
        person2.display();
    }
}

//Output (Example)

//Before Cloning:
//Person@6d06d69c [name=John, address=Address@7852e922]

//After Cloning:
//Person@4e25154f [name=John, address=Address@7852e922]
/*
Explanation:

The hashCode() of person1 and person2 are different → different objects.

The hashCode() of address is the same in both → same reference (shallow copy).

This confirms that the address reference is shared in both objects.


Would you like me to simplify anything further?*/
