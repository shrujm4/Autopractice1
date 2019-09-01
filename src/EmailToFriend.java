import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class EmailToFriend {

    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //open the browser
        driver = new ChromeDriver();
        //maximise the window
        driver.manage().window().fullscreen();

        //Manage timeout
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Open website
        driver.get("https://demo.nopcommerce.com/");

        //Click on login Link
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //Enter user email
        driver.findElement(By.xpath(" //input[@id ='Email'] ")).sendKeys("nehal.dama27@gmail.com");

        //Enter Password
        driver.findElement(By.xpath(" //input[@id ='Password'] ")).sendKeys("abconline12");

        Thread.sleep(2000);

        //Click login
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

        Thread.sleep(2000);

        //click on macbook
        driver.findElement(By.xpath("//div/a[@title=\"Show details for Apple MacBook Pro 13-inch\"]")).click();

        Thread.sleep(2000);

        //Email a friend
        driver.findElement(By.xpath("//div[@class='email-a-friend']")).click();
        Thread.sleep(2000);

        //Enter Friends email
        driver.findElement(By.xpath("//input[@class='friend-email'] ")).sendKeys("shrujm4@gmail.com");
        Thread.sleep(2000);


        //Enter your email
       // driver.findElement(By.xpath("//input[@class='your-email']")).sendKeys("nehal.dama27@gmail.com");

        //Personal Message
        driver.findElement(By.xpath(" //textarea[@placeholder='Enter personal message (optional).'] ")).sendKeys("Hey check this out a very good deal I found buy this has great features");

                Thread.sleep(2000);
        //Click send email
        driver.findElement(By.name("send-email")).click();

        //delay in close
            Thread.sleep(5000);

         //Close
         driver.close();
    }

}
