import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    //9.În pachetul test, creați o clasă LoginTest în care veți adăuga teste referitoare la logarea utilizatorilor.
    public void validLoginTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("pontebeatrix@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        driver.findElement(By.id("send2")).click();

        //driver.quit();
    }
}
