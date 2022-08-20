package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "p.hello strong")
    private WebElement welcomeTextParagraph;

    @FindBy(css = ".skip-link.skip-cart")
    private WebElement cartLink;

    @FindBy(css = ".cart-link")
    private WebElement viewCart;

    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }

    public void clickCartLink(){
        cartLink.click();
    }

    public void clickViewCart(){
        viewCart.click();
    }

}
