package singleton;
interface Vehicle{
    void startEngin();
}
interface SpecialFunction{
    void addSpecialFunction();
}
class Car implements Vehicle,SpecialFunction{

    @Override
    public void addSpecialFunction() {
        System.out.println("added special function to the car");
    }

    @Override
    public void startEngin() {
        System.out.println("started car Engine");
    }
}

public class Demo102 {
    public static void main(String[] args) {
        Car car = new Car();
        car.addSpecialFunction();
        car.startEngin();
    }
}





