package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.common.value.qual.EnsuresMinLenIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class xpath {
    public static <List> void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/about.htm");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.cssSelector("img[src^='images/logo']")).getAttribute("src"));
        WebElement element1= driver.findElement(By.xpath("//input[@name='username']"));
        element1.sendKeys("sss");
        System.out.println(element1.getTagName());
        System.out.println(element1.getRect().x+" "+element1.getRect().y);
        System.out.println(element1.getRect().height+" "+element1.getRect().width);
        System.out.println(element1.getSize());
        WebElement element2= driver.findElement(By.xpath("//*[contains (@name,'passwo')]"));
        element2.sendKeys("sss");
        System.out.println(element2.isDisplayed());
        System.out.println(element2.getCssValue("font-size").trim());
        WebElement element3=driver.findElement(By.cssSelector(".login input[class='button']"));
        element3.submit();
        System.out.println(driver.findElement(By.cssSelector("a[href^='lookup.h']")).getText());

        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        if (links.size() != 0){
            for (WebElement webElement:links) {
                String link = webElement.getAttribute("href").trim();
                if (link != null && !link.isEmpty()){
                    System.out.println(link);

                }
            }
        }

        driver.quit();

    }
}
