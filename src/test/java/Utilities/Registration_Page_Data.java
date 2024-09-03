package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Registration_Page_Data {
	@DataProvider(name="registion_data") 
	 String [][] GetData() throws IOException
	{
		String path=".\\TestData\\Nopcommerse_loginData.xlsx";
	
		
		Excel_Utilities xlutil= new Excel_Utilities(path);

		int total_rows=xlutil.GetRowCount("Registrationpage");
		int total_colms=xlutil.GetCellCount("Registrationpage", 1);
		String registion_data[][]=new String [total_rows][total_colms];
		for (int i=1;i<total_rows;i++)
		{
			for (int j=0;j<total_colms;j++)
			{
				registion_data[i-1][j]=xlutil.GetCellData("Registrationpage", i, j);
			}
		}
		return registion_data;
	}

}
