package com.examples_java;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class WorkBookReadWrite {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/TestData.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet("TestSheet");

        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            HSSFRow row = sheet.getRow(i);
            System.out.println("Row Value is " + i);

            for (int j = 0; j < row.getLastCellNum(); j++) {
                HSSFCell cell = row.getCell(j);
                System.out.println("Cell Value is " + cell.toString());
            }
        }

    }
}
