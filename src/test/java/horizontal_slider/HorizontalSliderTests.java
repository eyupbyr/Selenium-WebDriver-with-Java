package horizontal_slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSetSlider() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue("4");
        assertEquals(horizontalSliderPage.getSliderValue(), "4", "Values are not equal!");
    }
}
