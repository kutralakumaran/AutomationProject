package dProvider;

import org.testng.annotations.DataProvider;

public class OrderMobile {
	@DataProvider(name="order")
	public static String[][] getdata(){
		
		String[][] testData=new String[2][10];
		testData[0][0]="abcd";
		testData[0][1]="abcd";
		testData[0][2]="abcd@gmail.com";
		testData[0][3]="abcd";
		testData[0][4]="9865098650";
		testData[0][5]="1-123";
		testData[0][6]="M.G road";
		testData[0][7]="bengaluru";
		testData[0][8]="560002";
		testData[0][9]="2";
		
		testData[1][0]="qwer";
		testData[1][1]="qwer";
		testData[1][2]="qwer@gmail.com";
		testData[1][3]="qwerrr";
		testData[1][4]="7865078650";
		testData[1][5]="2-454";
		testData[1][6]="Manyata";
		testData[1][7]="bengaluru";
		testData[1][8]="560043";
		testData[1][9]="1";
		return testData;
	}
}
