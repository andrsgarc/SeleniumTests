package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestOPago {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testOPago() throws Exception {
    driver.get(baseUrl + "/ice-medios-web/");
    driver.findElement(By.id("j_id25:j_id26:j_id27:pagRoot:out")).click();
    driver.findElement(By.id("j_id25:j_id26:j_id27:pagRoot:pagOrdenPago:out")).click();
    driver.findElement(By.id("formPagOrdenPago:j_id46")).click();
    driver.findElement(By.id("formPagOrdenPago:cbCentroFuncional")).click();
    new Select(driver.findElement(By.id("formPagOrdenPago:cmbCentroFuncional"))).selectByVisibleText("9012");
    driver.findElement(By.id("formPagOrdenPago:txtConceptoPago")).clear();
    driver.findElement(By.id("formPagOrdenPago:txtConceptoPago")).sendKeys("Pago Ordenes Testing");
    driver.findElement(By.id("formPagOrdenPago:j_id400")).click();
    driver.findElement(By.id("popupListSerOrdenServicio:j_id485")).clear();
    driver.findElement(By.id("popupListSerOrdenServicio:j_id485")).sendKeys("375199");
    driver.findElement(By.id("popupListSerOrdenServicio:j_id481")).click();
    driver.findElement(By.id("popupListSerOrdenServicio:dtSerOrdenServicio:0:j_id501")).click();
    driver.findElement(By.id("formPagOrdenPago:j_id403")).click();
    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
    driver.findElement(By.id("formPagOrdenPago:dtPauOrdenPauta:0:j_id412")).click();
    driver.findElement(By.id("formPagOrdenPago:dtPauOrdenPauta:0:j_id412")).click();
    driver.findElement(By.id("formPagOrdenPago:dtPauOrdenPauta:j_id411")).click();
    driver.findElement(By.id("formPagOrdenPago:j_id362")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
