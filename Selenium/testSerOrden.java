package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSerOrden {
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
  public void testSerOrden() throws Exception {
    driver.findElement(By.id("listSerOrdenServicio:btnInsertarSerOrdenServicio")).click();
    driver.findElement(By.id("formSerOrdenServicio:txt_numeroOrden")).clear();
    driver.findElement(By.id("formSerOrdenServicio:txt_numeroOrden")).sendKeys("345098");
    driver.findElement(By.id("formSerOrdenServicio:txt_contratacion")).clear();
    driver.findElement(By.id("formSerOrdenServicio:txt_contratacion")).sendKeys("45996801");
    driver.findElement(By.id("formSerOrdenServicio:txt_compromiso")).clear();
    driver.findElement(By.id("formSerOrdenServicio:txt_compromiso")).sendKeys("2009-8877-5999");
    driver.findElement(By.id("formSerOrdenServicio:btnInsertarRazonSocial")).click();
    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
    driver.findElement(By.id("formSerOrdenServicio:cbOrgSector")).click();
    new Select(driver.findElement(By.id("formSerOrdenServicio:cmbSector"))).selectByVisibleText("TELECOMUNICACIONES");
    driver.findElement(By.id("formSerOrdenServicio:cbOrgDireccion")).click();
    new Select(driver.findElement(By.id("formSerOrdenServicio:cmbDireccion"))).selectByVisibleText("Negocio Comunicación");
    driver.findElement(By.id("formSerOrdenServicio:cbNegocio")).click();
    new Select(driver.findElement(By.id("formSerOrdenServicio:cmbNegocio"))).selectByVisibleText("Comunicación");
    new Select(driver.findElement(By.id("formSerOrdenServicio:cmbProceso"))).selectByVisibleText("Negocio Comunicación");
    new Select(driver.findElement(By.id("formSerOrdenServicio:cmbTipoContrato"))).selectByVisibleText("Agencias de publicidad y producción");
    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).click();
    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).clear();
    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).sendKeys("1000000");
    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).click();
    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).clear();
    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).sendKeys("1000000");
    driver.findElement(By.id("formSerOrdenServicio:btnGuardarSerOrdenServicio")).click();
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
