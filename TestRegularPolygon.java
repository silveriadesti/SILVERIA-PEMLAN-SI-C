public class TestRegularPolygon {
    public static void main(String[] args){
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1: perimeter = " + poly1.getPerimeter() + ", area = " + poly1.getArea());
        System.out.println("Polygon 2: perimeter = " + poly2.getPerimeter() + ", area = " + poly2.getArea());
        System.out.println("Polygon 3: perimeter = " + poly3.getPerimeter() + ", area = " + poly3.getArea());
    }
}