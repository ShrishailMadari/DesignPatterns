package prototype;

import java.time.LocalDate;
import java.util.List;
class Address{
    private String street;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class Student implements Cloneable{
    private String name;
    private int age;
    private LocalDate enrollmentDate;
    private List<String> subjects;
    private Address address;

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class ClientCode {
    public static void main(String[] args) {
        System.out.println("prototype design pattern: ");
    }
}
