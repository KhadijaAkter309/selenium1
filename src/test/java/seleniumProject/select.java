package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        WebElement country= driver.findElement(By.cssSelector("select[name='country']"));
       Select select=new Select(country);
       select.selectByValue("ANGOLA");
       select.selectByIndex(2);
       Thread.sleep(3000);
       select.selectByVisibleText("ARMENIA");


       for (WebElement option: select.getOptions()){
         System.out.println(option.getText());

      }
      driver.navigate().to("https://demoqa.com/select-menu");
       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(3000);
       driver.navigate().refresh();



       driver.quit();


    }
}
