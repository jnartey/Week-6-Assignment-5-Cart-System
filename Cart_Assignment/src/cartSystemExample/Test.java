package cartSystemExample;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TheSystem system = new TheSystem();
			System.out.println(system.getItemCollection());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
