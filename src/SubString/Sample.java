package SubString;

class Sample{
    public static String reverse(String s){
        char[] ch = s.toCharArray();
        int i =0,j=ch.length-1;
        while (i<j) {
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        return (new String(ch));
    }
    public static void main(String[] args) {
        String s ="MethodOverloading";
        String first = s.substring(0,6);
        String last = s.substring(6);
        System.out.println(reverse(first)+last);
        System.out.println(first+reverse(last));
    }
}