package com.actitime.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	String path=null;
	public XLUtils(String path) {
	this.path=path;	
		
	}
	/*
	 * public static FileInputStream fi; public static FileOutputStream fo; public
	 * static XSSFWorkbook wb; public static XSSFSheet ws; public static XSSFRow
	 * row; public static XSSFCell cell;
	 */
	
	public  int getRowCount(String xlsheet) throws IOException {
		FileInputStream src	=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(src);
		XSSFSheet sheet=wb.getSheet(xlsheet);
		int rowcount=sheet.getLastRowNum();
		return rowcount;
	}
		public  int getCellcount(String xlsheet,int rownum) throws IOException {
			FileInputStream src=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(src);
			XSSFSheet sheet=wb.getSheet(xlsheet);
			XSSFRow row	=sheet.getRow(rownum);
		int cellcount	=row.getLastCellNum();
			return cellcount;
			
			
		}
		public String getCellData(String xlsheet,int rownum,int colnum) throws IOException {
			FileInputStream src=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(src);
			XSSFSheet sheet=wb.getSheet(xlsheet);
			XSSFRow row=sheet.getRow(rownum);
			XSSFCell cell=row.getCell(colnum);
			DataFormatter formatter=new DataFormatter();

			String cellData;
			try {
						 cellData=formatter.formatCellValue(cell);
	
			}
       catch(Exception e){
    	    cellData = "";
       }
			return cellData;
			
  
			
		}
			public static void setCellData(String xlfile,String xlsheet, int rownum,int colnum,String data) throws IOException {
				FileInputStream fi=new FileInputStream(xlfile);
				XSSFWorkbook wb=new  XSSFWorkbook(fi);
				XSSFSheet ws=wb.getSheet(xlsheet);
				XSSFRow row=ws.getRow(rownum);
				XSSFCell cell=row.getCell(colnum);
				cell.setCellValue(data);
				FileOutputStream fo=new FileOutputStream(xlfile);
				wb.write(fo);
				wb.close();
				fi.close();
				fo.close();
			
				
			}
			
			
		
	}
	
	
	


