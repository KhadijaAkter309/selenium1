package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class window {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        String originalWindow= driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        Set<String> windows=driver.getWindowHandles();
        System.out.println(windows.size());
        driver.close();
        driver.switchTo().window(originalWindow);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);
        driver.quit();

    }
}
