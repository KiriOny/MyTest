import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class Balance extends Base {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;


//short information:
//This test go in to the my balance
// 1 step - login in site
// 2 step - go in to the my balance
// 3 step - Upload money anf check payment system




    @Test

    public void setUp() throws InterruptedException  {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://tutoriage.com");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav/ul/li[7]/a")).click();
        Thread.sleep(500);
        driver.findElement(By.id("loginform-email")).sendKeys("qalucy111111@mailinator.com");
        Thread.sleep(500);
        driver.findElement(By.id("loginform-password")).sendKeys("111111");
        driver.findElement(By.name("login-button")).click();


   //go to Balance

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav[2]/ul/li[3]/a")).click();

    //in my balance

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/section/div/div[1]/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"js-add-balance-form\"]/div[1]/input")).sendKeys("1");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"js-add-balance-form\"]/div[6]/button")).click();

        Thread.sleep(3000);

//in PatPAl



        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/xo-footer/footer/div[1]/p/a/span")).click();
        Thread.sleep(3000);

        //in my balance
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/section/div/div[1]/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"js-add-balance-form\"]/div[1]/input")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='js-add-balance-form']/div[4]/div/label[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"js-add-balance-form\"]/div[6]/button")).click();
        Thread.sleep(3000);

     //credit card
        driver.findElement(By.id("back_url")).click();
        Thread.sleep(3000);

        System.out.println("Balance is ok");
        driver.quit();
        }


    }





