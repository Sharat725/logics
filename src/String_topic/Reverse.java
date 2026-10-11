package String_topic;

public class Reverse {
    static void palindrome(String s){
        char[] ch = s.toCharArray();
        int i=0,j=ch.length-1;
        while (i<j) {
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
            
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        palindrome("JAVA");
    }
    
}
