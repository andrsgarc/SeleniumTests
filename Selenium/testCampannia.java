package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCampannia {
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
  public void testCampannia() throws Exception {
    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).clear();
    driver.findElement(By.id("listCampCampana:txtNombreIniciativa")).sendKeys("iniciativaseleniuB4");
    driver.findElement(By.id("listCampCampana:btnConsultarIniciativa")).click();
    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_campana.gif']")).click();
    driver.findElement(By.id("formIniIniciativa:btnCrearCampanna")).click();
    driver.findElement(By.xpath("//a[@id='formIniIniciativa:tabSetIniIniciativa:0.2']")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaInicio_cb")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaInicio_text_1569")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaFin_cb")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:fechaFin_text_1605")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_alcance")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_alcance")).sendKeys("Alcance descripcion");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcion")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcion")).sendKeys("Descripcion de campannia de prueba");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionRiesgo")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionRiesgo")).sendKeys("10");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id435")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_objetivoEstrategico")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_objetivoEstrategico")).sendKeys("Objetivo estrategico1");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id457")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionIndicador")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionIndicador")).sendKeys("IndicadorA");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeIndicador")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeIndicador")).sendKeys("10");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionMeta")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_descripcionMeta")).sendKeys("Metas cuantitativas1");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeMeta")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeMeta")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:txt_porcentajeMeta")).sendKeys("10");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id483")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:j_id510")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:scbPorcentaje")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:1:j_id535")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:actualizarListaPresupuestoCampanna")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:1:j_id535")).clear();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:1:j_id535")).sendKeys("100");
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:tabSetCampanna:0:dtPresupuestos:j_id534")).click();
    driver.findElement(By.id("formIniIniciativa:tabSetIniIniciativa:0:j_id393")).click();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).clear();
    driver.findElement(By.id("popupFormAudit:txt_observacion")).sendKeys("campannia inicial test Andres");
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
