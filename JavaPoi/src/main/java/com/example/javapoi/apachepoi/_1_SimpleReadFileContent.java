package com.example.javapoi.apachepoi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class _1_SimpleReadFileContent {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\Dev-java\\Learn_java\\JavaPoi\\src\\main\\resources\\static\\countries.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0); // XSSFSheet sheet = workbook.getSheet("Sheet1");

        // USING FOR LOOP

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);

            for(int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                switch(cell.getCellType()) {
                    case STRING: System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
                    case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
