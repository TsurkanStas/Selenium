//package Example;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class SeleniumTest {
//    WebDriver driver;
//
//    @BeforeClass
//    public void beforeMethod(){
//        System.setProperty("webdriver.chrome.driver", "D:\\HILLEL.QA\\chromedriver_win32");
//        driver = new ChromeDriver();
//        driver.get("Http://google.com");
//    }
//
//    @Test
//    public void checkPage() {
//        driver.findElement(By.name("q")).click();
//        driver.findElement(By.name("q")).sendKeys("Dog");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        List<WebElement> elements = driver.findElements(By.className("rc"));
//        for (WebElement el: elements) {
//            Assert.assertTrue(el.getText().toLowerCase().contains("Dog"));
//        }
//    }
//
//    @AfterClass
//    public void afterMethod (){driver.quit();
//    }
//}
