class Rectangle{
   int length;
   int width;
   void insert(int l, int w){
    length = l;
    width = w;
   }
   void Calculatearea(){System.out.println(length * width);}
}
public class RectangleArea{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.insert(20, 7);
        r.Calculatearea();
    }
}