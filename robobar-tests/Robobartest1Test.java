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
public class Robobartest1Test {
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
  public void robobartest1() {
    // Test name: robobar-test1
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:3000/");
    // 2 | click | css=.ng-scope:nth-child(1) > .ng-binding:nth-child(1) | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .ng-binding:nth-child(1)")).click();
    // 3 | click | css=.ng-scope:nth-child(1) > .ng-binding:nth-child(2) | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .ng-binding:nth-child(2)")).click();
    // 4 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
    // 5 | click | css=tr:nth-child(4) > .ng-binding | 
    driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).click();
    // 6 | click | css=.ng-scope:nth-child(2) > .ng-binding:nth-child(1) | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > .ng-binding:nth-child(1)")).click();
    // 7 | click | css=.ng-scope:nth-child(2) > .ng-binding:nth-child(2) | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > .ng-binding:nth-child(2)")).click();
    // 8 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
    // 9 | click | css=tr:nth-child(4) > .ng-binding | 
    driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).click();
    // 10 | click | css=.ng-scope:nth-child(3) > .ng-binding:nth-child(1) | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(3) > .ng-binding:nth-child(1)")).click();
    // 11 | click | css=.ng-scope:nth-child(3) > .ng-binding:nth-child(2) | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(3) > .ng-binding:nth-child(2)")).click();
    // 12 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
    // 13 | click | css=tr:nth-child(4) > .ng-binding | 
    driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).click();
    // 14 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
    // 15 | click | id=ageInput | 
    driver.findElement(By.id("ageInput")).click();
    // 16 | type | id=ageInput | 21
    driver.findElement(By.id("ageInput")).sendKeys("21");
    // 17 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
  }
}
