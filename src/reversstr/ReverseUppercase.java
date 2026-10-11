package reversstr;

class ReverseUppercase {
    public static void main(String[] args) {
        String s = "JaVaProGrAM";
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (!Character.isUpperCase(a[i]))
                i++;
            else if (!Character.isUpperCase(a[j]))
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
}