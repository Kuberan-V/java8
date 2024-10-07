package classandmethods;
class Stack {
    char c[]=new char[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(char ch){
        if(tos!=9)
            c[++tos]=ch;
        else
            System.out.println("Stack is full");
    }
    char pop(){
        if(tos>=0)
            return c[tos--];
        else
            System.out.println("Stack is empty");
        return '0';
    }
}

public class Stackdemo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push('a');
        s1.push('k');
        s1.push('m');
        s1.push('s');
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

    }
}
