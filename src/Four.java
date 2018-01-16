import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Four {
    private static int counts;
    public static void main(String[] args) throws IOException {
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream("/home/artem/IdeaProjects/module/src/myXLSs.xls"));
        HSSFSheet myExcelSheet = myExcelBook.getSheet("LoginPass");
        for (int i = 0; i <= myExcelSheet.getLastRowNum(); i++) {
            HSSFRow row = myExcelSheet.getRow(i);
            List<String> loginList = new ArrayList<String>();
            List<String> passwordList = new ArrayList<>();
            loginList.add(row.getCell(0).getStringCellValue());
            passwordList.add(row.getCell(1).getStringCellValue());



//            HashMap<Integer, String> matches = new HashMap<>();
//
//            for (int j=0; j < passwordList.size(); j++){
//                String name;
//
//
//                int tempt = 0;
//                name = passwordList.get(j);
//
//                matches.put(tempt, name);
//            }
//            System.out.println(matches);
       }
    }
  
}
