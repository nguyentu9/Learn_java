package com.example.javapoi.apachepoi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _2_WritingDataExcel {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp Info");

        Object employeeData[][] = {
                {"EmpID", "Name", "Job"},
                {101, "David", "Enginner"},
                {102, "Smith", "Manager"},
                {103, "Scott", "Analyst"},
        };

        // Using for loop
        int rows = employeeData.length;
        int cols = employeeData[0].length;

//        System.out.println(rows); // 4
//        System.out.println(cols); // 3

        for (int r = 0; r < rows; r++) {
            XSSFRow row = sheet.createRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.createCell(c); // 0
                Object value = employeeData[r][c];

                if (value instanceof String) cell.setCellValue((String) value);
                if (value instanceof Integer) cell.setCellValue((Integer) value);
                if (value instanceof Boolean) cell.setCellValue((Boolean) value);
            }
        }

        String filePath = ".\\employee.xlsx";
        FileOutputStream outstream = new FileOutputStream(filePath);
        workbook.write(outstream);

        outstream.close();
        System.out.println("employee.xlsx file written successfully...");
    }
}
