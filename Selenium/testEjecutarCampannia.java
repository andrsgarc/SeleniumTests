package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestEjecutarCampannia {
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
  public void testEjecutarCampannia() throws Exception {
    driver.get(baseUrl + "/ice-medios-web/");
    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).clear();
    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).sendKeys("IniSel2014M43");
    driver.findElement(By.id("listCampCampana:btnConsultarIniciativa")).click();
    driver.findElement(By.id("listCampCampana:dtIniciativas:0:j_id989")).click();
    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']/div/table/tbody/tr/td")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id1645")).click();
    driver.findElement(By.id("confirmationPopup:btnAcepptConfirmation")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id1647")).click();
    driver.findElement(By.id("confirmationPopup:btnAcepptConfirmation")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id1649")).click();
    driver.findElement(By.id("confirmationPopup:btnAcepptConfirmation")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:btnGuardarCampannia")).click();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Guardar campaña ejecucion");
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
