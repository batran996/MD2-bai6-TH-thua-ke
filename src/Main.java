public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ////check Shape/////
        System.out.println("---------SHAPE-----------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
        //////check Cricle//////////
        System.out.println("------CRICLE---------");
        Cricle cricle = new Cricle();
        System.out.println(cricle);
        cricle = new Cricle(3.5);
        System.out.println(cricle);
        cricle = new Cricle(3.5,"indigo",false);
        System.out.println(cricle);
        ///check RETANGLE/////////
        System.out.println("--------RETANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);
        /////check SQUARE////////
        System.out.println("------SQUARE--------------");
        Square square = new Square(2.3);
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8,"yellow",true);
        System.out.println(square);

    }
}