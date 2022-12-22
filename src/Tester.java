import java.util.Random;

public class Tester{
    private Circle arr[];
    private int n;
    public Tester(){
        Random rand = new Random();
        n= rand.nextInt(10);
        arr=new Circle[n];
        for(int i=0;i<n;i++){
            arr[i]=new Circle();
        }
    }
    public void Min(){
        int min=100,j = 0;
        for (int i=0;i<n;i++){
            if(min>arr[i].getRadius()){
                min=arr[i].getRadius();
                j=i;
            }
        }
        System.out.println("Окружность с минимальным радиусом: radius - "+arr[j].getRadius()+", length: - "+arr[j].length+",point - (" +arr[j].point.x+","+arr[j].point.y+")");
    }
    public void Max(){
        int max=0,j = 0;
        for (int i=0;i<n;i++){
            if(max<arr[i].getRadius()){
                max=arr[i].getRadius();
                j=i;
            }
        }
        System.out.println("Окружность с максимальным радиусом: radius - "+arr[j].getRadius()+", length: - "+arr[j].length+",point - (" +arr[j].point.x+","+arr[j].point.y+")");
    }
    public class Point{
        private int x;
        private int y;
        public Point(){
            Random rand = new Random();
            x=rand.nextInt(1000);
            y=rand.nextInt(1000);
        }

    }
    public class Circle{
        private Point point;
        private int radius;
        private double length;
        public Circle(){
            point=new Point();
            Random rand = new Random();
            radius=rand.nextInt(n*10);
            length= 2*3.14*radius;
        }
        public int getRadius(){
            return radius;
        }
    }
}
