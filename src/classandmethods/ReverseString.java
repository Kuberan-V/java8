package classandmethods;

public class ReverseString {
    public static void main(String[] args) {
        String str="kuberan";
        char[] ch=new char[str.length()];
        for(int i=str.length()-1,j=0;i>=0;i--,j++){
            ch[j]=str.charAt(i);
        }
        String s=String.valueOf(ch);
        System.out.println(s);
    }
}
