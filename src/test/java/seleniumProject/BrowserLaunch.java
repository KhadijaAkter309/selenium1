package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement element5= driver.findElement(By.cssSelector(".userForm input[type='text']"));
        element5.sendKeys("samia");
       /* WebElement element1= driver.findElement(By.cssSelector("a[href*='services']"));
        element1.click();
        WebElement element2= driver.findElement(By.cssSelector(".leftmenu a[href='http://www.parasoft.com/jsp/products.jsp']"));
        element2.click();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        WebElement element3= driver.findElement(By.cssSelector("input[name^='usern']"));
        element3.sendKeys("shoshe");
        WebElement element4= driver.findElement(By.cssSelector("input[name$='sword']"));
        element4.sendKeys("1222");


        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");




        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        */
        driver.quit();


    }
}
