import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProfileWriter {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;

    //short information:
//This test check profine writer and hire him when you are not login.
// 1 step - go to the profile writer
// 2 step - Hire him and login
// 3 step - go to the placed order and check chosen writer

    @Test

    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
;




        driver.get("https://tutoriage.com");

        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div/div/div[1]/div[1]/div[1]/a")).click();
        Thread.sleep(1000);

        //profile
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div/div[3]/a/span")).click();
        Thread.sleep(500);
        driver.findElement(By.id("emailform-email")).click();
        driver.findElement(By.xpath("//*[@id=\"emailform-email\"]")).click();
        driver.findElement(By.id("emailform-email")).sendKeys("qalucy111111@mailinator.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='continue-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginform-password")).click();
        driver.findElement(By.id("loginform-password")).sendKeys("111111");
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"hire-writer-56\"]/div/div/div[2]/div/a")).click();
        Thread.sleep(3000);
     //placed order
        driver.findElement(By.xpath("//*[@id=\"step-1\"]/div[2]/div/div[2]/div/div/div[1]"));
        driver.findElement(By.xpath("//*[@id=\"append-writer-id\"]"));

        System.out.println("Profile writer and hire is ok");
        driver.quit();

    }
}





