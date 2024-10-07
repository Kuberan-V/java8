package classandmethods;

public class Average {
    static int average(int x,int y){
        return (x+y)/2;
    }
    static int average(int x,int y,int z){
        return (x+y+z)/3;
    }

    public static void main(String[] args) {
        System.out.println(average(2,4));
        System.out.println(average(2,3,4));
    }
}
