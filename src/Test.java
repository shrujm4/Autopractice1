import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Test {

protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        //Maximise the browser window screen
        driver.manage().window().fullscreen();
        //implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open website
//        driver.get("http://demo.nopcommers.com/");
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //select radio button
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        //First Name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ramakant");
        //Last name
        driver.findElement(By.id("LastName")).sendKeys("Sahay");
        //Dropdown box
        //Day drop box select
        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByVisibleText("1");

        //Month drop box select
        Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Month.selectByVisibleText("April");

        //Birth year drop box select
        Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        Year.selectByVisibleText("1965");

         //Email
        driver.findElement(By.xpath("//input[@id=\"Email\"] ")).sendKeys("rsahay849@gmail.com");

        //Company Name
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("ABC Online Ltd");

        //Password Entry
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Champa12");

        //Confirm Password
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Champa12");

        //Click Register button
        driver.findElement(By.name("register-button")).click();

        //Click on Continue
        driver.findElement(By.name("register-continue")).click();

    }

}
