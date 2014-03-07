package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestIniciativa {
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
  public void testIniciativa() throws Exception {
    driver.findElement(By.id("listCampCampana:btnInsertar")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:txt_nombreCampana")).sendKeys("iniciativaTestSeleniumB");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_cb")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaInicio_text_51")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaFin_cb")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:fechaFin_text_1607")).click();
    driver.findElement(By.id("formIniIniciativa:btnContinuar")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:cambiarSector")).click();
    new Select(driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgSector"))).selectByVisibleText("TELECOMUNICACIONES");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:cambiarDireccion")).click();
    new Select(driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgDireccion"))).selectByVisibleText("Negocio Comunicación");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:btnCambiarNegocio")).click();
    new Select(driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:somNegocio"))).selectByVisibleText("Comunicación");
    new Select(driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:orgProceso"))).selectByVisibleText("Negocio Comunicación");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:inputTextCampCampanaPresupuestoEstimado")).sendKeys("100000000");
    driver.findElement(By.id("formIniIniciativa:btnInsertarIniciativa")).click();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("Iniciativa nueva Selenium IDE testing");
    driver.findElement(By.id("popupFormAudit:btnAcepptConfirmation")).click();
    try {
      assertEquals("", driver.findElement(By.id("listCampCampana:btnInsertar")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
