package classandmethods;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.SortedMap;

class Table{
    void printTable(int n){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception ex) {
                    System.out.println(ex);;
                }
                Scanner sc=new Scanner(System.in);
                int l = sc.nextInt();
            }
        }
    }
}

public class SynchrinizedEg {
    public static void main(String args[]){
        Console c=System.console();
        System.out.println("Enter the password");
        String ch=c.readLine();
        String pass= ch;
        System.out.println(pass);
    }
}
