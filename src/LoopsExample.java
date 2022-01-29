
public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int numb = 1;
//		while(numb==5) {
//			numb++;
//			continue;
//		}
//			System.out.println(numb);
		
//		for (int number = 10; number>0; number--) {
//			if(number==5) {
//				continue;
//			}	
//			
//				System.out.println("Inside for Loop " + number);
//		}		
		
		
		
//		Array with Loop
		
		int [] array = {20,30,40,50,60};
		
		for (int index=0; index<array.length; index++) {
			System.out.println("Value inside Array " + array[index]);
		}
		
		for (int index:array) {
			System.out.println(index);
		}
	}		

}
