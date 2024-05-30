package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("");
        WebElement element1=driver.findElement(By.id("email"));
        element1.clear();
        element1.sendKeys("1005");
        WebElement element2= driver.findElement(By.id("password"));
        element2.clear();
        element2.sendKeys("welcome2244");
        driver.findElement(By.cssSelector("button[class$='btn-primary btn-block']")).submit();

    }
}
