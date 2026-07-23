class Cube
{
    int length, breadth, height;


    Cube()
    {
        length = 2;
        breadth = 2;
        height = 2;
    }


    Cube(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
    }


    Cube(Cube c)
    {
        length = c.length;
        breadth = c.breadth;
        height = c.height;
    }

    void volume()
    {
        System.out.println("Volume = " + (length * breadth * height));
    }
}

public class CubeDemo {
    public static void main(String args[])
    {
        Cube c1 = new Cube();          
        Cube c2 = new Cube(4, 5, 6);   
        Cube c3 = new Cube(c2);       

        c1.volume();
        c2.volume();
        c3.volume();
    }
}
