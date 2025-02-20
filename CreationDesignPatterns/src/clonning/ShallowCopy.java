package clonning;
class Address {
    private String street;
    private Long zipCode;
    private String houseNumber;

    public Address(String street, Long zipCode, String houseNumber) {
        this.street = street;
        this.zipCode = zipCode;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "{ " +"\n"+
                " street = " + street + "\n" +
                " zipCode = " + zipCode + "\n"+
                " houseNumber = " + houseNumber  +
                "}";
    }
}

class Student implements Cloneable{
    private int id;
    private String name;
    private Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +",\n"+
                "name= " + name + ",\n" +
                "address=" + address +"\n"+
                '}';
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(101,"Shri Hari",
                new Address("Vaikunta",10000L,"KsheeraSagara"));
        String string = student.toString();
        System.out.println(string);
        Student clone = (Student) student.clone();
        System.out.println("Before Modifying : ");
        System.out.println(clone.toString()+" ");

        System.out.println("After Modifying: "+clone.toString());



    }
}
