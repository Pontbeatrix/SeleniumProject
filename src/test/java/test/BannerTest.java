package test;

import org.junit.After;
import org.junit.Test;


public class BannerTest extends BaseTest {
    @Test
    public void bannerTest() {
       wait(1);
       homePage. clickBannerLeftSideButton();
       wait(1);
       homePage. clickBannerLeftSideButton();
       wait( 1);
       homePage. clickBannerLeftSideButton();

       wait(2);

       homePage. clickBannerRightSideButton();
       wait(1);
       homePage. clickBannerRightSideButton();
       wait(1);
       homePage. clickBannerRightSideButton();

    }
@After
   public void clickBannerImage(){
        homePage.clickClickBannerImage();
   }

}
