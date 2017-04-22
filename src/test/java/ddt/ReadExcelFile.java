package ddt;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by VChubenko on 21.04.2017.
 */
public class ReadExcelFile {

    public String[][] readExcel(String filePath,String fileName,String sheetName) throws IOException {

        //Create a object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook workbook = null;

        //Find the file extension by spliting file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

            //If it is xlsx file then create object of XSSFWorkbook class

            workbook = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

            workbook = new HSSFWorkbook(inputStream);

        }

        //Read sheet inside the workbook by its name

        Sheet workbookSheet = workbook.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = workbookSheet.getLastRowNum()-workbookSheet.getFirstRowNum();
        Row row = workbookSheet.getRow(0);
        int cellCount = row.getLastCellNum();


        //Create a loop over all the rows of excel file to read it

        String [][] mas = new String[rowCount][cellCount];

        for (int i = 1; i < rowCount+1; i++) {

            row = workbookSheet.getRow(i);

            //Create a loop to print cell values in a row

            for (int j = 0; j < cellCount/*row.getLastCellNum()*/; j++) {

                //Print excel data in console

                //System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                mas[i][j] = row.getCell(j).getStringCellValue();
                System.out.println(mas);

            }

            System.out.println(mas);

        }



    return mas;
    }
}
