package com.review.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    @Test
    public void readExcel() throws Exception {

        String path="src/test/resources/Capitals.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell= row.getCell(0);
        System.out.println("Data in the first cell : "+cell);

        System.out.println(workbook.getSheetAt(0).getRow(1).getCell(0));
        System.out.println("3rd row 2nd cell is :"+workbook.getSheetAt(0).getRow(2).getCell(1));

        int rowCount= sheet.getLastRowNum();
        System.out.println("Last Row number : "+(++rowCount));

    }


}



