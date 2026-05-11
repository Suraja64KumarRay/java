public class area {
    public static void main(String[] args) {
        rectangle rect=new rectangle(10, 5);
        System.out.println("area of rectangle :"+rect.getarea());
        
    }
}
class shape {
    public double getarea() {
        return 0;
    }
}
class rectangle extends shape {
    double length;
    double width;
    rectangle(double length,double width) {
        this.length=length;
        this.width=width;
    }
    public double getarea() {
        return length*width;
    }
}
