package factorydesignpattern;

public class ClientCode {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.shapeFactoryMethod("circle");
        circle.draw();

        Shape square = shapeFactory.shapeFactoryMethod("square");
        square.draw();

        Shape rectangle = shapeFactory.shapeFactoryMethod("rectangle");
        rectangle.draw();

        Shape triangle = shapeFactory.shapeFactoryMethod("triangle");
        triangle.draw();

//        Shape shape = shapeFactory.shapeFactoryMethod("uytdrsdf");
//        shape.draw();
    }
}
