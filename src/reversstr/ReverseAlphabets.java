package reversstr;

class ReverseAlphabets {
    public static void main(String[] args) {
        String s = "a1b2c3A6B5c";
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
        	if((a[i]>='0' && a[i]<='9')) {
				i++;
			}
			else if((a[j]>='0' && a[j]<='9')) {
				j--;
			}
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
