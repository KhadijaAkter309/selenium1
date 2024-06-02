package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ALERT {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       WebElement element=driver.findElement(By.id("alertButton"));
       wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        wait.until(ExpectedConditions.alertIsPresent());
        //Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //Thread.sleep(2000);

        WebElement element2= driver.findElement(By.cssSelector("button[id^='confirmBut']"));
        wait.until(ExpectedConditions.elementToBeClickable(element2));
        element2.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        Thread.sleep(200);
        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(200);


     //promot
       driver.findElement(By.id("promtButton")).click();
        Alert alert1=driver.switchTo().alert();
        alert1.sendKeys("HLW.HOW R YOU");
        Thread.sleep(2000);
        System.out.println(alert1.getText());
        Thread.sleep(2000);
        alert1.dismiss();


        driver.quit();

    }
}
