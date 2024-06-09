package testNG;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Login extends BaseParaBank{
    @DataProvider(name = "dataProvider")
    public Object[][] getTestData(){

        return new Object[][]{{"username1","password1"},{"username2","password2"},{"username3","password3"}};
    }

    @Test(dataProvider ="getTestExcelData")
    public void verifyLogin(String username,String password) throws InterruptedException {
        WebElement element1= driver.findElement(By.name("username"));
        element1.clear();
        element1.sendKeys(username);
        Thread.sleep(3000);

        WebElement element2= driver.findElement(By.name("password"));
        element2.clear();
        element2.sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[class^='button']")).click();

       WebElement logOut=driver.findElement(By.linkText("Log Out"));
                logOut.click();



    }
    @Test(dataProvider = "getTestExcelData")
    public void verifyRegister(String firstName,String lastName,String address) throws InterruptedException {
        WebElement register=driver.findElement(By.cssSelector("a[href*='register.ht']"));
        register.click();
        Thread.sleep(3000);

        WebElement firstnameE= driver.findElement(By.id("customer.firstName"));
        firstnameE.clear();
        firstnameE.sendKeys(firstName);
        Thread.sleep(3000);

        WebElement lastnameE= driver.findElement(By.id("customer.lastName"));
        lastnameE.clear();
       lastnameE.sendKeys(lastName);
        Thread.sleep(3000);

        WebElement addressE= driver.findElement(By.id("customer.address.street"));
        addressE.clear();
        addressE.sendKeys(address);
        Thread.sleep(3000);

    }

    @DataProvider
    public static Object[][] getTestExcelData() {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Login.xlsx";
        Workbook book=null;
        Sheet sheet;
        FileInputStream file=null;
        try{
            file=new FileInputStream(path);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        try {
            book= WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet=book.getSheet("Sheet2");
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // System.out.println(sheet.getLastRowNum() + "--------" +
        // sheet.getRow(0).getLastCellNum());
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                System.out.println(data[i][k]);

            }
        }
        return data;

    }

}

