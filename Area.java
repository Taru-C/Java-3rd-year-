public class Area {

    double radius;
    int length, breadth;
    int side;

   
    Area() {
        radius = 7;
    }

   
    Area(int l, int b) {
        length = l;
        breadth = b;
    }

   
    Area(Area obj) {
        side = obj.length;
    }

    void areaCircle() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    void areaRectangle() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void areaSquare() {
        System.out.println("Area of Square = " + (side * side));
    }

    public static void main(String[] args) {

        Area c = new Area(); 
        Area r = new Area(5, 4); 
        Area s = new Area(r); 

        c.areaCircle();
        r.areaRectangle();
        s.areaSquare();
    }
}