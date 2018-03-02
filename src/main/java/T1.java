import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class T1 {
    private WebDriver driver;

    public void fbcss (String cssCelector){

        driver.findElement(By.cssSelector(cssCelector));

    }
}
