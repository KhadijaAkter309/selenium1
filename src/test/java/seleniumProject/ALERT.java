package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ALERT {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
       driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[id^='confirmBut']")).click();
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
