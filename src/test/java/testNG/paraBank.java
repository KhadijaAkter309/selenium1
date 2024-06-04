package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class paraBank extends BaseParaBank{
    @Test(priority = 0)

    public  void verifyTitle(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle().trim(),"ParaBank | Welcome | Online Banking");
    }

    @Test(priority = 1)

    public  void verifyLoginText(){
        String loginText=driver.findElement(By.cssSelector("#leftPanel > h2:nth-child(1)")).getText().trim();
        System.out.println(loginText);
        Assert.assertEquals(loginText,"Customer Login");
    }
    @Test(priority = 2)

    public void verifyLogin(){
        WebElement element1= driver.findElement(By.name("username"));
        element1.clear();
        element1.sendKeys("sqa");

        WebElement element2= driver.findElement(By.name("password"));
        element2.clear();
        element2.sendKeys("sqa");
        driver.findElement(By.cssSelector("input[class^='button']")).click();

        String logOut=driver.findElement(By.linkText("Log Out")).getText().trim();
        Assert.assertEquals(logOut,"Log Out");

    }

}
