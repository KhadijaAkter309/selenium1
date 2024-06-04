package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://qa-practice.netlify.app/radiobuttons");
        driver.manage().window().maximize();
       WebElement element= driver.findElement(By.cssSelector("#content > div:nth-child(4) > label"));
        Thread.sleep(3000);
       element.click();
       driver.navigate().to("https://qa-practice.netlify.app/tab");
       String originalWindow= driver.getWindowHandle();
        Thread.sleep(3000);
       driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://qa-practice.netlify.app/web-table");
        driver.switchTo().window(originalWindow);
       driver.quit();


    }
}
