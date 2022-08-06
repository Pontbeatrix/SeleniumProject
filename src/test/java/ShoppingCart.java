import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {
    // Tema Poza 1. LAB 17
    @Test
    public void validShoppingCart(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        driver.quit();

    }
    // Poza 2
    @Test
    public void validDeleteFromCart(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("pontebeatrix@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".level0.nav-6")).click();
        driver.findElement(By.id("product-collection-image-412")).click();
        driver.findElement(By.id("option26")).click();
        driver.findElement(By.id("swatch77")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        driver.findElement(By.cssSelector("td.a-center .btn-remove ")).click();


        //driver.quit();
    }
    //Poza 3
    @Test
    public void validCheckOut(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("pontebeatrix@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".level0.nav-6")).click();
        driver.findElement(By.id("product-collection-image-412")).click();
        driver.findElement(By.id("option26")).click();
        driver.findElement(By.id("swatch77")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        driver.findElement(By.cssSelector("[title='Proceed to Checkout']")).click();


    }

//Poza 4
    @Test
    public void validPosition(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("pontebeatrix@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456789");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".level0.nav-6")).click();
        driver.findElement(By.cssSelector("[title='Sort By']")).click();


    }



}
