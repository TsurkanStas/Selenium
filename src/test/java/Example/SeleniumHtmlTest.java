//package example;
//
//import com.google.inject.internal.util.SourceProvider;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class SeleniumHtmlTest {
//    private WebDriver driver;
//    @BeforeClass
//    public void beforedriver() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.youtube.com/");
//    }
//    @Test
//    public void jsimported() {
//        Assert.assertEquals(driver.findElements(By.cssSelector("script:not([src])")).size(), 0);
//    }
//    @Test
//    public void jsSingl() {
//        Assert.assertEquals(driver.findElements(By.cssSelector("script[src]")).size(), 1);
//    }
//    @Test
//    public void cssImported() {
//        try{
//            Assert.assertEquals(driver.findElements(By.tagName("style")).size(), 0);
//            Assert.assertEquals(driver.findElements(By.cssSelector("*[style]")).size(), 0);
//        } catch (AssertionError e){
//            System.out.println(e.getMessage());
//        }
//    }
//    @Test
//    public void cssSingl() {
//        Assert.assertEquals(driver.findElements(By.cssSelector("link[rel='stylesheet']")).size(), 1);
//    }
//    @Test
//    public void h1Singl() {
//        Assert.assertEquals(driver.findElements(By.tagName("h1")).size(), 1);
//    }
//    @Test
//    public void uniqueID() {
//        List<WebElement> elements = driver.findElements(By.cssSelector("*[id]"));
//        List<String> ids = new ArrayList<>();
//        for (WebElement el: elements) {
//            ids.add(el.getAttribute("id"));
//        }
//        Set<String> uniqueIds = new HashSet<>(ids);
//        Assert.assertEquals(ids.size(), uniqueIds.size());
//    }
//
//    @AfterClass
//    public void afterdriver(){
//        driver.quit();
//    }
//}
