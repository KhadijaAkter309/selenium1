package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class cookie {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().addCookie(new Cookie("qaSession","sqaCookies"));
        System.out.println(driver.manage().getCookieNamed("qaSession"));
        driver.manage().deleteCookieNamed("qaSession");
        Set<Cookie> cookies=driver.manage().getCookies();
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName()+" "+cookie.getExpiry());
        }
        driver.manage().deleteAllCookies();

        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());

        driver.quit();
    }
}
