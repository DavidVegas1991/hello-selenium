// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    // Test name: test2
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.google.es/");
    // 2 | setWindowSize | 858x855 | 
    driver.manage().window().setSize(new Dimension(858, 855));
    // 3 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 4 | click | css=#introAgreeButton .RveJvd | 
    driver.findElement(By.cssSelector("#introAgreeButton .RveJvd")).click();
    // 5 | selectFrame | relative=parent | 
    driver.switchTo().defaultContent();
    // 6 | click | name=q | 
    driver.findElement(By.name("q")).click();
    // 7 | type | name=q | devops
    driver.findElement(By.name("q")).sendKeys("devops");
    // 8 | sendKeys | name=q | ${KEY_ENTER}
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    // 9 | click | xpath=//div[@id='tads']/div/div/div/div/a/div | 
    driver.findElement(By.xpath("//div[@id=\'tads\']/div/div/div/div/a/div")).click();
  }
}
