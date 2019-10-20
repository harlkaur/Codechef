package Codechef.com;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class PractisingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			foo();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(JAXBException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException{
		
	}
}
