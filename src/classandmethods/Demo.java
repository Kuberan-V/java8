package classandmethods;

import java.util.*;
interface Example {


}
class MyThread extends Thread {
    public void run()
    {
        for (int i = 0; i <10; i++) {
        System.out.println(" Running thread : " + i);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
class A{
    static final int data;//static blank final variable
    static{ data=50;}
    public static void main(String args[]){
        System.out.println(A.data);
    }
}
class Apple{
    String name;
    int age;
    Apple(){
    }
    public Apple(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Demo {
    static int x;
    static float y;
    static char c;
    static String s;

    static int sum(int... number) {
        int res=0;
        for(int i:number)
            res+=i;
        return res;

    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));


    }
}
