package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by a on 6/27/2016.
 */
public class CommonApi {

    public WebDriver driver=null;



    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void CleanUp(){
        driver.close();
    }


    public void clickById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void typeById(String locator,String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }


    public void clickByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

public void typeByCss(String locator , String value){
    driver.findElement(By.cssSelector(locator)).sendKeys(value);

}
public void clickByXpath(String locator){
    driver.findElement(By.xpath(locator)).click();
}
public void typeByXpath(String locator, String value){
    driver.findElement(By.xpath(locator)).sendKeys(value);
}
    //it will take id

    public void takeEnterKeys(String locator){
        driver.findElement(By.cssSelector(locator)).submit();
    }

}
