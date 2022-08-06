import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
// 6. În pachetul test, creați o clasă RegisterTest în care veți adăuga teste referitoare la înregistrarea utilizatorilor noi.

    public void validRegisterTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Maria");
        driver.findElement(By.id("middlename")).sendKeys("Viktoria");
        driver.findElement(By.id("lastname")).sendKeys("Branzas");
        driver.findElement(By.id("email_address")).sendKeys("pontebeatrix@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.id("confirmation")).sendKeys("123456789");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        wait(5);
        //driver.quit();
    }
        public static void wait(int seconds) {
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }








