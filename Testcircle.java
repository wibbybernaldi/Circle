public class Testcircle {
    public static void main(String[] args) {
        circle c1=new circle(5.0,"yellow");
        System.out.println("radius= "+c1.getRadius()+", Color="+ c1.getColor()+", Area= "+ c1.getArea());

        circle c2=new circle(3);
        System.out.println("radius= "+c2.getRadius()+", Color="+ c2.getColor()+", Area= "+ c2.getArea());

        circle c3=new circle();
        System.out.println("radius= "+c3.getRadius()+", Color="+ c3.getColor()+", Area= "+ c3.getArea());
    }
}
