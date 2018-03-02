import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
    private WebDriver driver;
    public void cssselector(String cssSelector){
        driver.findElement(By.cssSelector(cssSelector)).click();
        driver.findElement(By.cssSelector(cssSelector)).sendKeys();
    }
    public void xpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.xpath(xpath)).sendKeys();
    }
    public void idelement (String id){
        driver.findElement(By.id(id));
    }

}
