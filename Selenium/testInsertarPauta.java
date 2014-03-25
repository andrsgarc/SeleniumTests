package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestInsertarPauta {
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
  public void testInsertarPauta() throws Exception {
    driver.get(baseUrl + "/ice-medios-web/");
    driver.findElement(By.id("j_id25:j_id26:j_id27:pauRoot:out")).click();
    driver.findElement(By.id("j_id25:j_id26:j_id27:pauRoot:out")).click();
    driver.findElement(By.id("listPauOrdenPauta:j_id47")).click();
    driver.findElement(By.id("formPauOrdenPauta:btnSearchMedio")).click();
    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
    driver.findElement(By.id("formPauOrdenPauta:cbMedMedio")).click();
    new Select(driver.findElement(By.id("formPauOrdenPauta:cmbMedio"))).selectByVisibleText("MEDIO ALIVEBOX");
    new Select(driver.findElement(By.id("formPauOrdenPauta:cmbNegNegocio"))).selectByVisibleText("Comunicación");
    driver.findElement(By.id("formPauOrdenPauta:cbMedVehiculo")).click();
    new Select(driver.findElement(By.id("formPauOrdenPauta:cmbMedVehiculo"))).selectByVisibleText("VEHICULO_ALIVEBOX 01");
    new Select(driver.findElement(By.id("formPauOrdenPauta:cmbMedSoporte"))).selectByVisibleText("Soporte01");
    new Select(driver.findElement(By.id("formPauOrdenPauta:cmbEjecutivoCuenta"))).selectByVisibleText("jorge clare clare");
    driver.findElement(By.id("formPauOrdenPauta:cbSerOrdenServicio")).click();
    new Select(driver.findElement(By.id("formPauOrdenPauta:cmbSerOrdenServicio"))).selectByVisibleText("375199 ¢ 1,000,000");
    driver.findElement(By.id("formPauOrdenPauta:j_id376")).click();
    driver.findElement(By.id("popupListCampCampana:j_id547")).clear();
    driver.findElement(By.id("popupListCampCampana:j_id547")).sendKeys("IniSel2014M65");
    driver.findElement(By.id("popupListCampCampana:btnConsulta")).click();
    driver.findElement(By.id("popupListCampCampana:dtCampCampana:0:j_id561")).click();
    driver.findElement(By.id("formPauOrdenPauta:scbAplicaTarifa")).click();
    driver.findElement(By.id("formPauOrdenPauta:cbActualizarCheckBox")).click();
    driver.findElement(By.id("formPauOrdenPauta:cbActualizaMontos")).click();
    driver.findElement(By.id("formPauOrdenPauta:j_id396")).clear();
    driver.findElement(By.id("formPauOrdenPauta:j_id396")).sendKeys("100000.00");
    driver.findElement(By.id("formPauOrdenPauta:txt_fechaInicioCalendario_cb")).click();
    driver.findElement(By.id("formPauOrdenPauta:txt_fechaInicioCalendario_text_52")).click();
    driver.findElement(By.id("formPauOrdenPauta:txt_fechaFinCalendario_cb")).click();
    driver.findElement(By.id("formPauOrdenPauta:txt_fechaFinCalendario_text_1570")).click();
    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:scbAplicaTodoMes")).click();
    driver.findElement(By.id("formPauOrdenPauta:cbAplicarTodoMesCalendario")).click();
    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:txt_cantidadDiaria")).click();
    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:txt_cantidadDiaria")).clear();
    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:txt_cantidadDiaria")).sendKeys("3");
    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:scbAplicaTodoMes")).click();
    driver.findElement(By.id("formPauOrdenPauta:cbAplicarTodoMesCalendario")).click();
    driver.findElement(By.id("formPauOrdenPauta:j_id300")).click();
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
