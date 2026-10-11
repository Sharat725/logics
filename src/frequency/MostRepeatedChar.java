package frequency;

public class MostRepeatedChar {
	public static void main(String[] args) {
		String s="fheiagfuyhABSQHQHS2sy2iydS@YEDY@IDYGD&&&&&&&&&";
		int[] arr= new int[127];
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			arr[ch]++;
		}
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				System.out.println((char)i+" "+arr[i]);
			}
		}
	}
	
}
