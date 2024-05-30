package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FirefoxBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://192.168.10.66/ems/login");
        WebElement element1=driver.findElement(By.id("email"));
        element1.clear();
        element1.sendKeys("1005");
        WebElement element2= driver.findElement(By.id("password"));
        element2.clear();
        element2.sendKeys("welcome2244");
       driver.findElement(By.cssSelector("button[class$='btn-primary btn-block']")).submit();

        driver.navigate().to("https://parabank.parasoft.com/parabank/about.htm");

        WebElement element5= driver.findElement(By.className("Solutions"));
        element5.click();
        WebElement element3= driver.findElement(By.name("username"));
        element3.sendKeys("samia");
        WebElement element4= driver.findElement(By.name("password"));
        element4.sendKeys("1234");
        Thread.sleep(2000);
        WebElement element7= driver.findElement(By.partialLinkText("min Pag"));
        element7.click();

        driver.navigate().to("https://parabank.parasoft.com/parabank/about.htm");
        WebElement element6= driver.findElement(By.linkText("About Us"));
        element6.click();
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement element8= driver.findElement(By.tagName("textarea"));
        element8.sendKeys("hi.how are you?");




        Thread.sleep(2000);



        driver.quit();
    }
}
