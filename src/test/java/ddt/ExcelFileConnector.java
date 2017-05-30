package ddt;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import ua.bms.osop.utils.ConfigProperties;


import java.io.*;

/**
 * Created by VChubenko on 21.04.2017.
 */
public class ExcelFileConnector {

    //Prepare the path of excel file
    private String importFilePath = ConfigProperties.getProperty("excelimport.filePath");
    private String importFileName = ConfigProperties.getProperty("excelimport.fileName");

    public String[][] readExcel(String sheetName) throws IOException {

        //Create a object of File class to open xlsx file
        File file = new File(importFilePath +"\\"+ importFileName);

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        Workbook workbook = null;

        //Find the file extension by spliting file name in substring and getting only extension name
        String fileExtensionName = importFileName.substring(importFileName.indexOf("."));

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
        int i, j = 0;
        row = null;

        //Create a loop over all the rows of excel file to read it
        String [][] mas = new String[rowCount+1][cellCount];

        for (i = 1; i < rowCount+1; i++) {
            row = workbookSheet.getRow(i);
            //Create a loop to print cell values in a row
            for (j = 0; j < cellCount; j++) {
                //Print excel data in console
                mas[i][j] = row.getCell(j).getStringCellValue();
            }
        }
    return mas;
    }


    public void writeExcel(String fileName, Object[][] datatypes) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet");

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(importFilePath+"\\"+fileName+".xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }

}
