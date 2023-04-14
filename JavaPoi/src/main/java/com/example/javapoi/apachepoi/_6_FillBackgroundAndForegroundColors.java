package com.example.javapoi.apachepoi;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _6_FillBackgroundAndForegroundColors {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Sheet1");

        XSSFRow row = sheet.createRow(1);

        // Setting background color

        XSSFCellStyle style = workbook.createCellStyle();

        style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
        style.setFillPattern(FillPatternType.BIG_SPOTS);

        XSSFCell cell = row.createCell(1);
        cell.setCellValue("welcome");
        cell.setCellStyle(style);

        // Setting Foreground color
        style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell = row.createCell(2);
        cell.setCellValue("Automation");
        cell.setCellStyle(style);


        FileOutputStream fos = new FileOutputStream(".\\style.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();

        System.out.println("Done");

        /**

         // My Color
         XSSFColor color = new XSSFColor(workbook.getStylesSource().getIndexedColors());
         color.setARGBHex("#DDD".substring(1));
         */
    }
}
