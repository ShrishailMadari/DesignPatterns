package abstarctfactory;
class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public DoorFactory createDoor() {
        return new Door();
    }

    @Override
    public ChairFactory createChair() {
        return new Chair();
    }

    @Override
    public SofaFactory createSofa() {
        return new Sofa();
    }
}
interface FurnitureFactory{
    DoorFactory createDoor();
    ChairFactory createChair();
    SofaFactory createSofa();
}

interface DoorFactory{
    void openDoor();
    void closeDoor();
}
interface ChairFactory{
    void site();
    void adjustHeight();
}
interface SofaFactory{
    void sit();
    void recline();
}

class Chair implements ChairFactory{

    @Override
    public void site() {
        System.out.println("we can sit on the chair: ");
    }

    @Override
    public void adjustHeight() {
        System.out.println("we can adjust the height of the chair: ");
    }
}
class Sofa implements SofaFactory{

    @Override
    public void sit() {
        System.out.println("sitting on sofa: ");
    }

    @Override
    public void recline() {
        System.out.println("sofa is comfort to recline: ");
    }
}

class Door implements DoorFactory{

    @Override
    public void openDoor() {
        System.out.println("Opening Door: ");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing Door: ");
    }
}


public class ClientCode {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        ChairFactory chair = furnitureFactory.createChair();
        chair.adjustHeight();
        chair.site();

        DoorFactory door = furnitureFactory.createDoor();
        door.closeDoor();
        door.openDoor();

        SofaFactory sofa = furnitureFactory.createSofa();
        sofa.recline();
        sofa.sit();
    }
}
