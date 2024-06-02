package seleniumProject;

import com.sun.jdi.PathSearchingVirtualMachine;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class actionAPI {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement element= driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a:nth-child(1)"));
        WebElement element1=driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        WebElement element2= driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
       Actions action=new Actions(driver);
       action.moveToElement(element).moveToElement(element1).perform();
       action.doubleClick(element2).perform();

       driver.navigate().to("https://demoqa.com/droppable");
       WebElement drageable= driver.findElement(By.id("draggable"));
       WebElement dropable=driver.findElement(By.id("droppable"));
       action.dragAndDrop(drageable,dropable).perform();

       Thread.sleep(200);


       Thread.sleep(2000);
       driver.quit();


    }
}
