package cr.go.ice.medios.pages;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdenPautaPage extends MainPage {

	public OrdenPautaPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void openFormPauOrdenPauta() throws InterruptedException{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		driver.findElement(By.id("listPauOrdenPauta:btnInsertarPauta")).click();
	    driver.findElement(By.id("formPauOrdenPauta:btnSearchMedio")).click();
	    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
	    
	    Thread.sleep(1000);
	    fluentWait(By.id("formPauOrdenPauta:cmbMedio"), "MedMedio[id=59100]");   //Tener un medio en donde la categoria tenga un presupuesto asi como el negocio
	    
	    Thread.sleep(1000);
	    fluentWait(By.id("formPauOrdenPauta:cmbNegNegocio"), "NegNegocio[id=5]");

	    Thread.sleep(1000);
	    fluentWait(By.id("formPauOrdenPauta:cmbMedVehiculo"), "MedVehiculo[id=54353]");

	    Thread.sleep(1000);
	    fluentWait(By.id("formPauOrdenPauta:cmbMedSoporte"), "MedSoporte[id=56201]");
	    
	    Thread.sleep(1000);
	    fluentWait(By.id("formPauOrdenPauta:cmbEjecutivoCuenta"), "OrgContacto[id=61351]");
	    
	    Thread.sleep(1000);
	    
	    String selBoxID = "formPauOrdenPauta:cmbSerOrdenServicio";
	    String partialText = Constants.ORDEN_SERVICIO_PAUTA_NUMERO;
	    driver.findElement(By.xpath("//select[@id='" + selBoxID + "']/option[contains(text(), '" + partialText + "')]")).click();
	    //fluentWait(By.id("formPauOrdenPauta:cmbSerOrdenServicio"), "SerOrdenServicio[id=95300]"); //Debe haber inicialmente una orden de servicio
	     
	    driver.findElement(By.id("formPauOrdenPauta:btnSearchCampana")).click();
	    driver.findElement(By.id("popupListCampCampana:txtNombreCampannia")).clear();
	    driver.findElement(By.id("popupListCampCampana:txtNombreCampannia")).sendKeys(INICIATIVA_PAUTA_NAME); //Codigo de la iniciativa
	    driver.findElement(By.id("popupListCampCampana:btnConsulta")).click();	    
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/addList.png']")));
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/addList.png']")).click();
	    
	    
	    
	    driver.findElement(By.id("formPauOrdenPauta:scbAplicaTarifa")).click();	
	    driver.findElement(By.id("formPauOrdenPauta:txtTarifaPau")).click();
	    driver.findElement(By.id("formPauOrdenPauta:txtTarifaPau")).clear();
	    Thread.sleep(500);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("javascript:document.getElementById(\"formPauOrdenPauta:txtTarifaPau\").value=150000.5;");
	    
	    driver.findElement(By.xpath("//span[text()='Multiplica tarifa']"));
	    Thread.sleep(500);
	    
	    
	    driver.findElement(By.id("formPauOrdenPauta:txt_fechaInicioCalendario_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formPauOrdenPauta:txt_fechaInicioCalendario_ct']//span[text()=10]")));
	    driver.findElement(By.xpath("//table[@id='formPauOrdenPauta:txt_fechaInicioCalendario_ct']//span[text()=10]")).click();
	    driver.findElement(By.id("formPauOrdenPauta:txt_fechaFinCalendario_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='formPauOrdenPauta:txt_fechaFinCalendario_ct']//span[text()=18]")));
	    driver.findElement(By.xpath("//table[@id='formPauOrdenPauta:txt_fechaFinCalendario_ct']//span[text()=18]")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='formPauOrdenPauta:txt_fechaFinCalendario' and contains(@value, '18')]")));   

	    
	    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:txt_cantidadDiaria")).click();
	    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:txt_cantidadDiaria")).clear();
	    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:txt_cantidadDiaria")).sendKeys("3");
	    driver.findElement(By.id("formPauOrdenPauta:dtCalendarioWrapper:0:scbAplicaTodoMes")).click();
	    
	    driver.findElement(By.id("formPauOrdenPauta:btnGuardarPauta")).click();
	    
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("formPauOrdenPauta:btnEnviarAprobar")));
	    driver.findElement(By.id("formPauOrdenPauta:btnEnviarAprobar")).click();

	}
	
	
	
	public void aprobarPauOrdenPauta() throws InterruptedException{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		
		Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
		int currentDay = localCalendar.get(Calendar.DATE);
		
		
		driver.findElement(By.id("listPauOrdenPauta:sidFechaCreacionInicio_cb")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='listPauOrdenPauta:sidFechaCreacionInicio_ct']//span[text()=" + currentDay + "]")));
	    driver.findElement(By.xpath("//table[@id='listPauOrdenPauta:sidFechaCreacionInicio_ct']//span[text()=" + currentDay + "]")).click();
	    Thread.sleep(500);
	    fluentWait(By.id("listPauOrdenPauta:cmbEstadoPauta"), "PauEstado[id=0]");
	    Thread.sleep(500);
	    
	    driver.findElement(By.id("listPauOrdenPauta:btnConsultarPauta")).click();
	    
	    
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_row.png']")));
	    driver.findElement(By.xpath("//input[@src='/ice-medios-web/imagenes/botones/editar_row.png']")).click();
	    
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("formPauOrdenPauta:btnAprobar")));

	    driver.findElement(By.id("formPauOrdenPauta:btnAprobar")).click();
	    
	}
}
