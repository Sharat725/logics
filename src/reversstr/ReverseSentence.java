package reversstr;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "I Love Java";
        String[] a = s.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            String rev = "";
            for (int j = a[i].length() - 1; j >= 0; j--) {
                rev = rev + a[i].charAt(j);
            }
            System.out.print(rev + " ");
        }
    }
}
