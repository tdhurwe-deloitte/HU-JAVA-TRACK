class Area_calc{
    static final double PI = Math.PI;
    void area(float a)
    {
        float ar = a * a;
        System.out.println("Area of the square : " + ar);
    }

    void area(int l, int b)
    {
        int ar = l * b;
        System.out.println("Area of rectangle : " + ar);
    }

    void area(double a)
    {
        double ar = PI * Math.pow(a, 2);
        System.out.println("Area of circle : " + ar);
    }

    void area(long b, long h)
    {
        long ar = (b * h)/2;
        System.out.println("Area of triangle : " + ar);
    }
}

public class Area {
    public static void main(String[] args)
    {
        Area_calc obj = new Area_calc();
        obj.area(4);
        obj.area(6, 4);
        obj.area(10.5);
        obj.area(12, 10);
    }
}

