package com.example.javapoi.apachepoi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class _5_ReadDataFrmoPassworProtectedExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\customers.xlsx");
        String password = "test123";

        // XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis, password);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        // read data from sheet using for loop
        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType()) {
                    case FORMULA:
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                }
                System.out.println(" | ");
            }
        }
        System.out.println();
        workbook.close();
        fis.close();


        // read data from sheet using iterator
        Iterator<Row> iterator = sheet.iterator();
        while(iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            while(cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case FORMULA:
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                }
                System.out.println(" | ");
            }
            System.out.println();
        }
    }
}
