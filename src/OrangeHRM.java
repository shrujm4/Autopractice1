import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class OrangeHRM {

    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
        //Open the browser
        driver = new ChromeDriver();

        //Maximising Window
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Open website
        driver.get("https://opensource-demo.orangehrmlive.com");

        //Enter user name
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

        //Enter password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

        //Click Login Button
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        //To delay between login and logout
        Thread.sleep(10000);

        //Logout from dropdown menu
        driver.findElement(By.id("welcome")).click();
        //Select Logout button
        driver.findElement(By.partialLinkText("Logout")).click();



    }
}
