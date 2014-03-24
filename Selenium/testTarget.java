package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTarget {
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
  public void testTarget() throws Exception {
    driver.get(baseUrl + "/ice-medios-web/");
    driver.findElement(By.id("j_id25:j_id26:j_id27:campRoot:out")).click();
    driver.findElement(By.id("j_id25:j_id26:j_id27:campRoot:out")).click();
    driver.findElement(By.id("listCampCampana:btnEnterEvent")).click();
    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).clear();
    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).sendKeys("IniSel2014M34");
    driver.findElement(By.id("listCampCampana:dtIniciativas:0:j_id82")).click();
    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']/div/table/tbody/tr/td")).click();
    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0.1']/div/table/tbody/tr/td")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id585")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id585")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id585")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id598")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id598")).sendKeys("10");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id600")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id600")).sendKeys("20");
    new Select(driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id610"))).selectByVisibleText("Padres de familia usuarios de internet");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id618")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id620")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id627")).click();
    driver.findElement(By.id("popupFormOrgProvincia:cambiarCriterio")).click();
    new Select(driver.findElement(By.id("popupFormOrgProvincia:j_id884"))).selectByVisibleText("Regiones & Distribución provincial");
    driver.findElement(By.id("popupFormOrgProvincia:dtOrgRegion:0:j_id891")).click();
    driver.findElement(By.id("popupFormOrgProvincia:j_id926")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id577")).click();
    driver.findElement(By.id("formIniIniciativa:btnInsertarIniciativa")).click();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Guardar target de campannia");
    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();
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
