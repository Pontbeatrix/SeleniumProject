import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

 //5. Adăugati un test(o noua metoda) prin care să deschideți homepage-ul site-ului, apoi să navigați la categoria "Sale",
    // apoi să deschideți pagina de detalii a primului produs și să încercați să îl adăugați în WishList, apăsând butonul
    // Add to Wishlist. Pe viitor, după ce veți învăța să faceți și verificări, veți putea reveni pentru a vă asigura că
    // adăugarea în wishlist poate fi realizată doar de utilizatorii autentificați. Apelati metoda aceasta in metoda main
    // pentru a rula testul.
@Test
public void validWhisListTest(){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://testfasttrackit.info/selenium-test");
            driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
            driver.findElement(By.cssSelector("[title='Log In']")).click();
            driver.findElement(By.id("email")).sendKeys("pontebeatrix@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("123456789");
            driver.findElement(By.id("send2")).click();
            wait(3);
            driver.get("http://testfasttrackit.info/selenium-test/sale.html");
            driver.findElement(By.cssSelector("[title='View Details']")).click();
            driver.findElement(By.cssSelector(".link-wishlist")).click();
            wait(3);
            WebElement notSame= driver.findElement(By.cssSelector(".wishlist-sku"));
            Assert.assertNotSame("DUMBO BOYFRIEND JEAN",notSame,"SLIM FIT DOBBY OXFORD SHIRT");
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
























