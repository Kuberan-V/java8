package com.coding;

public class prime {
    static void prime(int number){
    for(int i=0;i<=number;i++)
    {
        if(i==0 || i==1)
            continue;
        else{
            int flag=1;
            for(int j=2;j*j<=i;j++)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }
            if(flag==1)
                System.out.print(i+" ");
        }
    }
}
    public static void main(String[] args) {
        // write your code here
        int n=11;
        prime(n);
    }

}
