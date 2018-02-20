import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class EXcieUtility {

	public static void Up(String planName,String PRcase) throws IOException{
			File path=new File(System.getProperty("user.dir")+"/RPF.xls");
		
			FileInputStream fis=new FileInputStream(path);
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet=workbook.getSheetAt(0);
			System.out.println("Sheet name is: "+sheet);
				
			int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
			int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
				Cell cell;
				boolean k = false;
				for(int i=rowcount;i<rowcount+1 && k==false;i++){
					String colName= sheet.getRow(0).getCell(0).getRichStringCellValue().getString();
					System.out.println("Value is : "+colName);
					for(int j=1;j<colcount;j++){
						if(colName.equalsIgnoreCase("planName")){
							Row row =sheet.createRow(i+1);
						 cell=sheet.getRow(i+1).createCell(j-1);
								cell.setCellValue(planName);
								cell=sheet.getRow(i+1).createCell(j);
								cell.setCellValue(PRcase);
								k = true;
								break;
								}			
				}
				}
				fis.close();
				FileOutputStream outputStream = new FileOutputStream(path);
				workbook.write(outputStream);
				outputStream.close();
			
		
	}
	
	public static void main(String[] args) throws IOException {
		 
          Up("bijendra","kumar");
          Up("kumara","sangakara");
          Up("almost","awasthi");
          Up("dubey","panime");
	}

}
