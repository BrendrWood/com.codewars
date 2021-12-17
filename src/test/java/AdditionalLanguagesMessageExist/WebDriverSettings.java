package AdditionalLanguagesMessageExist;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WebDriverSettings {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;
    public WebElement element;
    public JavascriptExecutor js = (JavascriptExecutor)driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);

        driver.get("https://www.codewars.com/");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flex flex-col lg:flex-row flex-nowrap items-center lg:w-10/12 mx-auto']")));


    }

    @AfterTest
    public void getDown() {
        driver.quit();
    }
}
