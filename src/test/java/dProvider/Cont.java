package dProvider;

import org.testng.annotations.DataProvider;

public class Cont {
	
	
	@DataProvider(name="contact")
	public static String[][] getdata(){
		
		String[][] testData=new String[2][4];
		testData[0][0]="abcd";
		testData[0][1]="abcd@gmail.com";
		testData[0][2]="9865098650";
		testData[0][3]="Hi,hello";
		
		
		testData[1][0]="qwer";
		testData[1][1]="qwer@gmail.com";
		testData[1][2]="7865078650";
		testData[1][3]="hellooo!!";
	
		return testData;
		
}
}
