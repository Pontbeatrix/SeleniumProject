package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".success-msg span")
    private WebElement successMessageSpan;

    @FindBy(css = ".qty[name*='cart']")
    private WebElement qtyField;

    @FindBy(css = "td.a-center .btn-remove")
    private WebElement removeFromCart;

    public String getSuccessMessageSpan(){
        return successMessageSpan.getText();
    }

    public String getQtyField(){
        return qtyField.getAttribute("value");
    }

    public void clickRemoveFromCart(){ removeFromCart.click();
    }

}
