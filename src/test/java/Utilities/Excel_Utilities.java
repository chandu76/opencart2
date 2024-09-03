package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.*;

public class Excel_Utilities {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;
	public Excel_Utilities(String path)
	{
		this.path=path;
	}
	public int GetRowCount(String sheetname)throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum(); 
		workbook.close();
		fi.close();
		return rowcount;
	}
	public int GetCellCount(String sheetname, int rownum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		int celcellcount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return celcellcount;

	}

	public String GetCellData(String sheetname, int rownum, int colnum) throws IOException
	{
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		DataFormatter df = new DataFormatter();
		String data;
		try
		{
			data=df.formatCellValue(cell);

		}
		catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fi.close();
		return data;
	}
	public void SetCellData(String sheetname,int rownum,int colnum,String data) throws IOException
	{
		File xlfile=new File(path);
		if(xlfile.exists()==true)
		{
			workbook=new XSSFWorkbook();
			fo=new FileOutputStream(path);
			workbook.write(fo);
		}
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		if(workbook.getSheetIndex(sheetname)==-1)   //if sheet is not exist then create new sheet
		{
			workbook.createSheet(sheetname);
			sheet=workbook.getSheet(sheetname);
		}
		if(sheet.getRow(rownum)==null)    // if row is not exist then create a new row
		{
			sheet.createRow(rownum);
			row=sheet.getRow(rownum);
			cell=row.createCell(colnum);
			cell.setCellValue(data);
			fo=new  FileOutputStream(path);
			workbook.write(fo);
			workbook.close();
			fi.close();
			fo.close();

		}
	}
	public void FillGreanColor(String sheetname, int rownum,int colnum) throws IOException
	{
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		style=workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}
	public void FillRedColor(String sheetname, int rownum,int colnum) throws IOException
	{
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		style=workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}

}
