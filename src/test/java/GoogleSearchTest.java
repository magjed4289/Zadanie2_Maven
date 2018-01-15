import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GoogleSearchTest {
    @Test
    public void SearchTest() {

        //open the chrome browser and maximize the window
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.mac");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        }

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to google.com

        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        String cssOfInputField = "input[name='q']";

        WebElement inputFieldQ = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfInputField)));

        //search for "intive"

        inputFieldQ.sendKeys("intive");
        inputFieldQ.submit();

        WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
        List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));


        //Get the url of first link

        String result_link_url = findElements.get(0).getAttribute("href");
        driver.navigate().to(result_link_url);
        result_link_url = driver.getCurrentUrl();

        //check what url https://intive.com gives

        Set s = driver.getWindowHandles();
        Iterator ite = s.iterator();

        String expected_link_url = new String();
        while (ite.hasNext()) {
            String popupHandle = ite.next().toString();
            if (!popupHandle.contains(result_link_url)) {
                driver.switchTo().window(popupHandle);
                driver.navigate().to("https://intive.com");
                expected_link_url = driver.getCurrentUrl();
            }
        }

        //Check if both Urls are the same

        assertEquals(result_link_url, expected_link_url);

        System.out.println("Succes!");

        driver.close();
        driver.quit();
    }
}
