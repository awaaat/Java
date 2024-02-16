class Area_of_Triangle{
    int base;
    int height;
    void findArea(int b, int h){
        base = b;
        height = h;
    }
    void showArea(){System.out.println(0.5*(base * height));}
}
public class Triangle{
    public static void main(String[] args) {
        Area_of_Triangle ar = new Area_of_Triangle();
        ar.findArea(12, 7);
        ar.showArea();
    }
}