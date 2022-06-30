import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class test {
    private static ChromeDriver chromeDriver = new ChromeDriver();
    private static CLASS8HOME.Firefoxdriver Firefoxdriver;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
    }

    @Test
    public void open_websites() {
        chromeDriver.get("https://www.walla.co.il/");
//        Firefoxdriver.Get("https://www.ynet.co.il/");
    }

    @Test
    public void google_translate() {
        CLASS8HOME.ChromeDriver Chromedriver = null;
        Chromedriver.toString();
        System.out.println(Chromedriver.findElement(By.id("source")));
        System.out.println(Chromedriver.findElement(By.tagName("textarea")));
    }

    @Test
    public void youtube() {
        Firefoxdriver.Get("https://www.youtube.com/");
        System.out.println(Firefoxdriver.findElement(By.id("logo-icon")));
    }

    @Test
    public void seleniumHQ() {
        Firefoxdriver.Get("https://www.seleniumHQ.com/");
        WebElement searchElement = Firefoxdriver.findElement(By.name("search"));
        System.out.println(searchElement);
        searchElement.sendKeys("Selenium");
    }

    @Test
    public void Amazon() {
        CLASS8HOME.ChromeDriver Chromedriver = new CLASS8HOME.ChromeDriver();
        Chromedriver.Get("https://www.Amazon.com/");
        String amazonTitle = "Amazon.com: shopping online for electronic equipment";
        Assert.assertEquals(Chromedriver.getClass(), amazonTitle);
        Chromedriver.findElement(By.id("searchintextbox"));
    }

    @Test
    public void google_translate1() {
        CLASS8HOME.ChromeDriver Chromedriver = null;
        Chromedriver.Get("https://www.googletranslate.com");
        Chromedriver.findElement(By.id("source")).sendKeys("חומוס");

    }

    @Test
    public void get_song() {
    chromeDriver.get("http://www.youtube.com");
    chromeDriver.findElement(By.id("search")).sendKeys("The real slim shady");
    chromeDriver.findElement(By.id("search in YOUTUBE field")).click();

    }

    @Test
    public void facebook(){
        chromeDriver.findElement(By.id("E-mail")).sendKeys("admin");
        chromeDriver.findElement(By.id("password")).sendKeys("admin");
    }
}

