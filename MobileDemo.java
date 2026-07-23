class Mobile {
    String company_name;
    double screen_size;

    Mobile(String company_name, double screen_size) {
        this.company_name = company_name;
        this.screen_size = screen_size;
    }

    void display() {
        System.out.println("Company Name : " + company_name);
        System.out.println("Screen Size  : " + screen_size + " inches");
        System.out.println();
    }
}

public class MobileDemo {
    public static void main(String args[]) {
        Mobile m1 = new Mobile("Samsung", 6.5);
        Mobile m2 = new Mobile("Apple", 6.1);
        Mobile m3 = new Mobile("OnePlus", 6.7);
        Mobile m4 = new Mobile("Realme", 6.6);
        Mobile m5 = new Mobile("Vivo", 6.4);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}