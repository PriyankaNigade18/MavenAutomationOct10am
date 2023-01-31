package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData 
{
	XSSFWorkbook wb;

	@DataProvider(name="MyData")
	public Object[][] testData()
	{
		Object[][] arr={{"Admin","admin123"},{"Pooja","test123"},{"Sumeet","test123"}};
		return arr;
	}
	
	
	
	@DataProvider(name="filedata")
	public Object[][] fileData()
	{
		File f1=new File("./"+"\\TestData\\Data.xlsx");
		  FileInputStream fs;
		  
		try {
			fs = new FileInputStream(f1);
			wb=new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  //workbook--->sheet-->row-->cell-->value
		  
		   //All rows
		  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		  System.out.println("Total Rows: "+rows);
		  
		  //All Column
		  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		  System.out.println("Total Columns are: "+cells);
		  
		  Object arr[][]=new Object[rows][cells];
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  arr[i][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
								  
			  }
			 
		  }
		  
		  return arr;
		  
		  
		  
	}
}
