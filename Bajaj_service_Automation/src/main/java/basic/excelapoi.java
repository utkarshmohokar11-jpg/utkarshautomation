package basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class excelapoi {
    public static void main(String[] args) {
        try {
        	//asjdncakjsdc
        	//kjhbv 
            // Open Excel file
            FileInputStream fis = new FileInputStream("src/test/resources/testdata/testdata.xlsx");
            Workbook wb = WorkbookFactory.create(fis);

            // Get first sheet
            Sheet sheet = wb.getSheetAt(0);

            // Iterate over rows and cells
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell + "\t"); // print cell value
                }
                System.out.println();
            }

            // Close resources
            wb.close();
            fis.close();

        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
