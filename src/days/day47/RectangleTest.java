package days.day47;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(10,15);
        System.out.println("rectangle.getBreatdth() = " + rectangle.getBreatdth());
        System.out.println("rectangle.getLength() = " + rectangle.getLength());

        areaOfRectangle(rectangle);
        System.out.println("rectangle.setChange(rectangle).getLength() = " + rectangle.setChange(rectangle).getLength());
        System.out.println("rectangle.setChange(rectangle).getBreatdth() = " + rectangle.setChange(rectangle).getBreatdth());
        areaOfRectangle(rectangle);

    }

    public static void areaOfRectangle (Rectangle rectangle ){

        int areaOfRectangle= rectangle.getLength() * rectangle.getBreatdth();
        System.out.println("areaOfRectangle = " + areaOfRectangle);
    }
}
