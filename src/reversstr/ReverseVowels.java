package reversstr;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (!isVowel(a[i]))
                i++;
            else if (!isVowel(a[j]))
                j--;
            else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(a);
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}
