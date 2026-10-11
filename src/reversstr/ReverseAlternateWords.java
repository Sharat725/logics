package reversstr;

public class ReverseAlternateWords {
    public static void main(String[] args) {
        String s = "Java Is Very Easy";
        String[] a = s.split(" ");

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                String rev = "";
                for (int j = a[i].length() - 1; j >= 0; j--) {
                    rev = rev + a[i].charAt(j);
                }
                System.out.print(rev + " ");
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }
}
