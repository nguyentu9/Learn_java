package com.example.javapoi.apachepoi;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class _7_HashMapToExcel {
    public static void main(String[] args) throws IOException {
        javaToExcel();
        excelToJava();
    }

    private static void javaToExcel() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Student data");

        Map<String, String> data = new HashMap<>();
        data.put("101", "John");
        data.put("102", "Smith");
        data.put("103", "Scott");
        data.put("104", "Kim");
        data.put("105", "Mary");

        int rowno = 0;

        for (Map.Entry entry : data.entrySet()) {
            XSSFRow row = sheet.createRow(rowno++);

            row.createCell(0).setCellValue((String) entry.getKey());
            row.createCell(1).setCellValue((String) entry.getValue());
        }

        FileOutputStream fos = new FileOutputStream("./student.xlsx");
        workbook.write(fos);
        fos.close();
        System.out.println("Done");
    }

    private static void excelToJava() throws IOException {
        FileInputStream fis = new FileInputStream("./student.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Student data");

        int rows = sheet.getLastRowNum();
        HashMap<String, String> data = new HashMap<String, String>();

        // Reading data from excel to HashMap
        for (int r = 0; r <= rows; r++) {
            String key = sheet.getRow(r).getCell(0).getStringCellValue();
            String value = sheet.getRow(r).getCell(1).getStringCellValue();
            data.put(key, value);
        }

        // Read data from HashMap
        for (Map.Entry entry : data.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
