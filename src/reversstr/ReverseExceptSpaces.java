package reversstr;

public class ReverseExceptSpaces {
    public static void main(String[] args) {
        String s = "ab cd ef";
//        String rev = "";

        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j) {
        	if(ch[i]==' ') {
        		i++;
        	}
        	else if(ch[j]==' ') {
        		j--;
        	}
        	else {
        		char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
        	}
        }
        System.out.println(ch);
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) != ' ') {
//                rev = rev + s.charAt(i);
//            }
//        }
//        System.out.println(rev);

//        int k = 0;

//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ')
//                System.out.print(" ");
//            else
//                System.out.print(rev.charAt(k++));
//        }
    }
}

