package com.myproject.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public FileInputStream fi;
    public FileOutputStream fo;
    public  XSSFWorkbook wb;
    public  XSSFSheet   ws;
    public  XSSFRow row;
    public  XSSFCell cell;
    public  String path;
    
 public   ExcelUtility(String path){
 	   this.path=path;
    }
    public   int getrowcount( String xlsheet) throws IOException {
 	   
 	    fi=new FileInputStream(path);
 	    wb=new XSSFWorkbook(fi);
        	ws  =wb.getSheet(xlsheet); 
          int rowcount = ws.getLastRowNum();
          wb.close();
          fi.close();
          return rowcount;
          
 	 }
    
    
    public  int  getcellcount( String xlsheet , int rownum ) throws IOException {
 	   fi=new FileInputStream(path);
 	    wb=new XSSFWorkbook(fi);
 	    ws = wb.getSheet(xlsheet);
 	        row = ws.getRow(rownum);
 	        
 	      int cellcount = row.getLastCellNum();
 	        wb.close();    
 	        fi.close();
 	      return cellcount;
 	   
 	   
      }   
    
    
    public  String getcelldata( String xlsheet, int rownum, int column ) throws IOException {
 	   fi=new FileInputStream(path);
 	    wb=new XSSFWorkbook(fi);
 	    ws = wb.getSheet(xlsheet);
 	         row   = ws.getRow(rownum);
 	          cell  = row.getCell(column);
				
 	          String data;
 	          try {
 	        	data   =cell.toString();
 	        	
 	          }
 	     catch (Exception e) {
				data="";
				
			}
 	          wb.close();    
	    	        fi.close();
	    	      return data;
 	    
 	  }
    
    
    

}
