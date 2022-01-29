import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "Order confirmation 1233434";
		FileOutputStream file1;
		
		try {
			
				file1 = new FileOutputStream("result.txt",true);
				try {
					file1.write(file.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
