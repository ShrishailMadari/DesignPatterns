package builderDesignPatterns;
class StudentDemo{
    private String name;
    private Integer id;
    private String section;
    private String address;
    private String state;
    private Long zipCode;
    private Integer rollNumber;
    private String subject;

    public StudentDemo(String name, Integer id, String section,
                       String address, String state, Long zipCode,
                       Integer rollNumber, String subject) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.address = address;
        this.state = state;
        this.zipCode = zipCode;
        this.rollNumber = rollNumber;
        this.subject = subject;
    }

    static class StudentBuilder{

    }
}
public class Student {
    public static void main(String[] args) {

    }
}
