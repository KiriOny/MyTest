import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class NewOrder  extends T1{

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    String keyCombination = "Ctrl + Shift + Tab";

//**short information:
//This test imitation new user in the site
// 1 step - Enter email and autorization in the site
// 2 step - Create order (click all fild and select\ upload file to order)
// 3 step - go to the biddind, found bids, write message in the chat, declined bid, aproved bid
// 4 step - PAyment page - check payment system and add service

// in future - add best writer serves  **

    @Test


    public void setUp() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Robot robot = new Robot();
        Random rad = new Random();
        for (int j=1; j<=1; j++ )


//login
        driver.get("https://tutoriage.com/");
        driver.findElement(By.cssSelector("#registerform-email")).click();
        fbcss("#registerform-email");

        driver.findElement(By.cssSelector("#registerform-email")).sendKeys("usename"+rad.nextInt(100)+"@mailinator.com");

        driver.findElement(By.cssSelector("#register-form > div > div:nth-child(3) > button")).click();

       // driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        //Thread.sleep(1000);

        //driver.findElement(By.id("loginform-email")).click();
       // driver.findElement(By.id("loginform-email")).sendKeys("qalucy111111@mailinator.com");
        //driver.findElement(By.id("loginform-password")).sendKeys("111111");
       // driver.findElement(By.name("login-button")).click();

       // Thread.sleep(3000);

 //Click btn order now
       // driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/a[1]")).click();
        Thread.sleep(3000);
//   widjet
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#popup_timezone > div > div > div.uk-form.timezone-form > div > form > div.line.uk-text-center.btn_box_timezone > button > span")).click();
        Thread.sleep(3000);
  //placed order
        driver.findElement(By.xpath("//div[@id='orderform-work_type_id-styler']/div/div")).click();
        driver.findElement(By.xpath("//div[@id='orderform-work_type_id-styler']/div[2]/ul/li[3]")).click();
        driver.findElement(By.id("orderform-topic")).click();
        driver.findElement(By.id("orderform-topic")).click();
        driver.findElement(By.id("orderform-topic")).clear();
        driver.findElement(By.id("orderform-topic")).sendKeys("test");
        driver.findElement(By.xpath("//div[@id='orderform-subject_type_id-styler']/div/div")).click();
        driver.findElement(By.xpath("//div[@id='orderform-subject_type_id-styler']/div[2]/ul/li[7]")).click();
        driver.findElement(By.xpath("//div[@id='step-1']/div[2]/div/div[2]/div/div/div/div[2]/div")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@id='orderform-subject_type_id-styler']/div/div")).click();
        driver.findElement(By.xpath("//div[@id='orderform-subject_type_id-styler']/div[2]/ul/li[4]")).click();
        driver.findElement(By.xpath("//div[@id='number_pages']/div/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='number_pages']/div/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='number_pages']/div/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='number_pages']/div/div/div[2]")).click();
        driver.findElement(By.xpath("//div[@id='number_pages']/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@id='step-1']/div[2]/div/div[2]/div/div/div/div[2]/p[2]")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(800);

  //ddl
        driver.findElement(By.id("orderform-deadline")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("body > div.xdsoft_datetimepicker.xdsoft_noselect.xdsoft_ > div.xdsoft_datepicker.active > div.xdsoft_monthpicker > div.xdsoft_label.xdsoft_month")).click();
        driver.findElement(By.cssSelector(".xdsoft_monthselect > div:nth-child(1) > div:nth-child(4)")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector("body > div.xdsoft_datetimepicker.xdsoft_noselect.xdsoft_ > div.xdsoft_datepicker.active > div.xdsoft_monthpicker > div.xdsoft_label.xdsoft_year")).click();
        driver.findElement(By.cssSelector("div.xdsoft_option:nth-child(70)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".xdsoft_calendar > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(5)")).click();

 //page_2
        driver.findElement(By.xpath("//*[@id=\"step-1\"]/div[2]/div/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"orderform-service_type\"]/div[2]/label/i")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"step-2\"]/div/div[3]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"orderform-format_citation_id-styler\"]/div[1]")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[@id=\"orderform-format_citation_id-styler\"]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"step-2\"]/div/div[5]/button")).click();

 //page_3
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(500);
        driver.findElement(By.id("orderform-description")).sendKeys("test");
        Thread.sleep(500);
        driver.findElement(By.linkText("Click to upload")).click();
        driver.findElement(By.id("orderform-files")).sendKeys("C:\\Program Files (x86)\\Google\\Chrome\\Application\\64.0.3282.186\\1.2.docx");
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"step-3\"]/div/div[4]/button")).click();
        Thread.sleep(5000);


 //bidding
    //found bids
        
        Thread.sleep(500);
         driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/section/div[2]/div[2]/div/div/div/div[1]"));
         driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/section/div[2]/div[2]/div/div/div/div[2]"));
        Thread.sleep(1000);

     //send message

         driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/section/div[2]/div[2]/div/div/div/div[1]/div[3]/div/button")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[4]/textarea")).sendKeys("test");
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[4]/textarea")).sendKeys(Keys.ENTER);

         driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/span")).click();
         driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/span")).click();
         Thread.sleep(1000);

     //declined bid
         driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/section/div[2]/div[2]/div/div/div/div[2]/div[3]/button[2]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"modal-decline\"]/div/div/div[2]/button")).click();
         Thread.sleep(2000);

      // aprooved bid
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/section/div[2]/div[2]/div/div/div/div[1]/div[3]/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#modal-accept > div > div > a")).click();
        Thread.sleep(1000);

  //bidding
        driver.findElement(By.xpath("//div[@id='main']/div/div/div/div/section/div[2]/div[2]/div/div/div/div/div[3]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(3000);

     //payment page
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form[@id='w1']/div/div[2]/div[2]/div/label/i")).click();
        driver.findElement(By.xpath("//form[@id='w1']/div/div[2]/div[3]/div/label/i")).click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);

      //paypal
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cancelLink\"]/span")).click();


        System.out.println("New Order is ok");
        driver.quit();
      //credit card








    }
}
