import java.util.*;
class data
{
    static Scanner s1=new Scanner(System.in);
    int height,breadth;
    void get_data()
    {
        System.out.print("Enter Heigth: ");
        height=s1.nextInt();
        System.out.print("Enter breadth: ");
        breadth=s1.nextInt();
    }
    void put_data()
    {
        System.out.print("Height is: "+height+"\n");
        System.out.print("Height is: "+height+"\n");
    }
}
class rectangle extends data
{
    void areaRectangle()
    {
        System.out.print("Area of given Rectangle is: "+height*breadth+"\n");
    }
    void perimeterRectangle()
    {
        System.out.print("Perimeter of given Rectangle is: "+2*(height+breadth)+"\n");
    }
}
class triangle extends data
{
    void areaTriangle(int base)
    {
        System.out.print("Area of given trianle is: "+0.5*base*height+"\n");
    }
    void perimeterTriangle(int base,int thrd)
    {
        System.out.print("Perimeter of given Triangle is: "+(height+base+thrd)+"\n");
    }
    
    public static void main(String ss[])
    {
        rectangle r1=new rectangle();
        r1.get_data();
        r1.put_data();
        r1.areaRectangle();
        r1.perimeterRectangle();
        
        System.out.println();
        
        triangle t1=new triangle();
        t1.get_data();
        t1.put_data();
        t1.areaTriangle(1);
        t1.perimeterTriangle(1, 1);
    }
}