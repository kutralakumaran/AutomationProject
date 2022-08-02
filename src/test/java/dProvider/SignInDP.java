package dProvider;

import org.testng.annotations.DataProvider;

public class SignInDP {

@DataProvider(name="mobile")
	public static String[][] getdata(){
		
		String[][] testData=new String[2][2];
		testData[0][0]="abcd";
		testData[0][1]="efgh";
		
		testData[1][0]="qwerty";
		testData[1][1]="qwertyui23";
		
		return testData;
		
	}
}
