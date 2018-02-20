import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class EXcieUtility2 {
  
	public static void Update() throws IOException{
		File file=new File(System.getProperty("user.dir")+"/RPF.xls");
		FileInputStream fis=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(1);
		int noRow=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=1;i<=noRow;i++){
			int noCol=sheet.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<=noCol-1;j++){
				boolean colValue=sheet.getRow(i).getCell(j).getBooleanCellValue();
				
				if(colValue){
					String colname=sheet.getRow(0).getCell(j).getStringCellValue();
					System.out.println("Row no "+(i+1)+" has true value in column "+(j+1)+" "+colname);
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					for(int k=0;k<=noCol-1;k++){
						boolean vlaue=sheet.getRow(i).getCell(k).getBooleanCellValue();
						System.out.println(k+" column value of true column is "+vlaue);
					}
				}else
					continue;
			}
			
			
			}
	
	}
	
	public static void main(String[] args) throws IOException {
		Update();
		
	}

}
