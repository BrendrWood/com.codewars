package AdditionalLanguagesMessageExist;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageExistTest extends WebDriverSettings {

    @Test
    public void changeColorTest() throws Exception{

        final byte a = 27;
        for (byte b=0;b<a;b++){
            element = driver.findElement(By.xpath(LanguageNames.languageNames[b]));
            action.moveToElement(element).moveToElement(element).pause(500).build().perform();
            String actualValue = element.getAttribute("aria-describedby");
            String expectedValue = MessageValues.messageValues[b];
            Assert.assertEquals(actualValue, expectedValue);
        }
    }
}
