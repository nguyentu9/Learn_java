package com.example.javapoi.apachepoi;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _4_WriteFormulaCellExcelSheet {
    public static void main(String[] args) throws IOException {
        writeFormula1();
        writeFormula2();
    }

    private static void writeFormula1() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Numbers");
        XSSFRow row = sheet.createRow(0);

        row.createCell(0).setCellValue(10);
        row.createCell(1).setCellValue(20);
        row.createCell(2).setCellValue(30);
        row.createCell(3).setCellFormula("A1*B1*C1");

        FileOutputStream fos = new FileOutputStream(".\\calc.xlsx");
        workbook.write(fos);
        fos.close();
        System.out.println("calc.xlsx created with formula cell..");
    }

    private static void writeFormula2() throws IOException {
        String path = ".\\calc.xlsx";
        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        sheet.createRow(1).createCell(3).setCellFormula("SUM(A1:C1)");
        fis.close();

        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        workbook.close();
        fos.close();
        System.out.println("Done");
    }
}
