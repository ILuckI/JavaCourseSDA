import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    private static WebDriver driver;

    @BeforeClass
    public static void before() throws InterruptedException {
        //Driver is in resource
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
        //Open a page
        driver.get("http://www.kubamaterac.pl");

        // Show succes informations
        System.out.println("Successfully opened the website");

        //Sleep 5 sec
        Thread.sleep(2000);

    }

    @Test
    public void checkIfHelloScreenHaveCorrectText() {
        WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'bubble table__cell')]"));
        String napis = element.getText();
        assertEquals("Jestem Kuba,\ndeveloper c#, javy,\nphp i androida.", napis);

    }

    @Test
    public void checkIfThingsILike() throws InterruptedException {
        // 1. Find menu by Id
        WebElement menu = driver.findElement(By.id("parallax"));
        // 2. Click a link
        menu.findElement(By.id("omnie")).click();
        // 3. Find element by xpath
        WebElement interests = driver.findElement(By.xpath("//div[contains(@class, 'interests')]"));
        // 4. Scroling page in to element ( execut javascript code )
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", interests);
        // 5. Sleep 2 sec (throws exception!)
        Thread.sleep(2000);
        // 6. Search all figcaptions by xpath ( create a list of elements )
        List<WebElement> figcaptions = interests.findElements(By.xpath(".//figcaption"));
        // 7. Cheack list size
        assertEquals(4, figcaptions.size());
        // 8.
        assertEquals("Programowanie", figcaptions.get(0).getText());
        assertEquals("Motocykle", figcaptions.get(1).getText());
        assertEquals("Piwo", figcaptions.get(2).getText());
        assertEquals("Dobra muzyka", figcaptions.get(3).getText());
    }

    @Test
    public void checkLink() {
        WebElement menu = driver.findElement(By.id("parallax"));
        menu.findElement(By.id("omnie")).click();
        WebElement element = driver.findElement(By.xpath("//div[(@id = 'mCSB_1')]"));

        // Search a target on 3 diferents ways
        // 1) Search by xpath
        // WebElement link = driver.findElement(By.xpath(".//a[contains(@class,'company-link')]"));
        // 2) Search by class
        // WebElement link = driver.findElement(By.className("company-link"));
        // 3) Search by text
        WebElement link = driver.findElement(By.xpath(".//a[contains(text(),'Wydziale')]"));

        assertEquals("http://cs.pwr.edu.pl/", link.getAttribute("href"));
    }

    @Test
    public void checkH(){
        WebElement menu = driver.findElement(By.id("parallax"));
        menu.findElement(By.id("omnie")).click();
        WebElement element = driver.findElement(By.xpath("//div[(@id = 'mCSB_1')]"));
        List<WebElement> h3List = element.findElements(By.xpath(".//h3"));
        assertEquals(3, h3List.size());
        assertEquals("Jestem", h3List.get(0).getText());
        assertEquals("Znam się na", h3List.get(1).getText());
        WebElement interests = driver.findElement(By.xpath("//div[contains(@class, 'interests')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", interests);
        assertEquals("Rzeczy, które lubię:", h3List.get(2).getText());
    }
    @Test
    public void checkCommingSoon(){
        WebElement menu = driver.findElement(By.id("parallax"));
        menu.findElement(By.id("projekty")).click();

    }

    @AfterClass
    public static void after() {
        // Close driver
        driver.quit();

    }
}
