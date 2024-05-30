package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        System.out.println( driver.findElement(By.id("frame1Wrapper")).getText());
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        System.out.println( driver.findElement(By.id("frame1Wrapper")).getText());
        driver.switchTo().frame("frame2");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();

        driver.quit();


    }
}
