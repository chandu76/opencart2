package Utilities;

import java.io.IOException;
import org.testng.annotations.*;
public class Dataprovider {


	@DataProvider(name="Login_Data") 
	 String [][] GetData() throws IOException
	{
		String path=".\\TestData\\Nopcommerse_loginData.xlsx";
		
		Excel_Utilities xlutil= new Excel_Utilities(path);

		int total_rows=xlutil.GetRowCount("logindatasheet1");
		int total_colms=xlutil.GetCellCount("logindatasheet1", 1);
		String logindata[][]=new String [total_rows][total_colms];
		for (int i=1;i<total_rows;i++)
		{
			for (int j=0;j<total_colms;j++)
			{
				logindata[i-1][j]=xlutil.GetCellData("logindatasheet1", i, j);
			}
		}
		return logindata;
	}
	
}
