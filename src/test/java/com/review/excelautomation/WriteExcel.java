package com.review.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteExcel {
    @Test
    public void WriteExcel ()throws Exception{
        String path="src/test/resources/Capitals.xlsx";

        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);

        Cell cell4= row.createCell(3);
        cell4.setCellValue("Population");
        //row.createCell(3).setCellValue("Population");



        sheet.getRow(1).createCell(3).setCellValue("1500000");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
    }
}
