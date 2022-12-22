import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void first(){
        int a[] = new int[12],i;
        System.out.println("1 способ:");
        Random rand = new Random();
        for (i=0;i<12;i++){
            a[i]=rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        double b[] = new double[12];
        System.out.println("2 способ:");
        for (i=0;i<12;i++){
            b[i]= Math.random();
        }
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

    }
    public static void third(){
        Random rand = new Random();
        int a[] = new int[4],i,j=0;
        for (i=0;i<4;i++){
            a[i]=rand.nextInt(10,99);
        }
        for (i=1;i<4;i++){
            if(a[i]>a[i-1]){
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        if(j==3){
            System.out.println("Последовательность является возрастающей");
        }
        else{
            System.out.println("Последовательность НЕ является возрастающей");
        }
    }
    public static void second(){
        Tester a=new Tester();
        a.Min();
        a.Max();
    }
    public static void fourth(){
        Random rand = new Random();
        System.out.println("Введите натуральное число n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            a[i]=rand.nextInt(n);
            if(a[i]%2==0&&a[i]!=0){
                j++;
            }
        }
        int b[]=new int[j];
        j=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0&&a[i]!=0){
                b[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Массив чётных элементов:");
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        System.out.println("Задание [1]");
        first();
        System.out.println("Задание [2]");
        second();
        System.out.println("Задание [3]");
        third();
        System.out.println("Задание [4]");
        fourth();
    }
}