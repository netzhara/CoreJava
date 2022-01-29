
public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		reverse String
//		reverse of Array
//		reverse of number
		
		String country = "Clean Tanzania Green Tanzania";
		String revCountry= " ";
		
		for(int index= country.length()-1; index>=0; index--) {
			revCountry = revCountry + country.charAt(index);
		}
		System.out.println("Reversed String: " + revCountry);
		
		
//		 Number of Vowel 
		
//		int result = 0;
//		for(int index=0;index<country.length();index++)
		
		
//		Reverse Number of Array
		
		int [] array = {20,30,40,50,60};
		
			for (int index=array.length - 1; index>=0; index--) {
				System.out.println(array[index]);
			}	

	}

}
