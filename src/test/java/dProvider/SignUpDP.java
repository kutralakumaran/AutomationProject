package dProvider;

import org.testng.annotations.DataProvider;

public class SignUpDP {

	@DataProvider(name="signup")
	public static String[][] getdata(){
		
		String[][] testData=new String[2][7];
		testData[0][0]="abcd";
		testData[0][1]="abcd";
		testData[0][2]="abcd@gmail.com";
		testData[0][3]="abcd";
		testData[0][4]="10102020";
		testData[0][5]="9865098650";
		testData[0][6]="hi";
		
		testData[1][0]="qwer";
		testData[1][1]="qwer";
		testData[1][2]="qwer@gmail.com";
		testData[1][3]="qwerrr";
		testData[1][4]="02252022";
		testData[1][5]="9865098650";
		testData[1][6]="hello";
		
		return testData;
		
	}
	
}
