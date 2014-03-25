package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class OrdenPautaPage {
	private final WebDriver driver;
	private final Wait<WebDriver> wait;

	public OrdenPautaPage(WebDriver driver) {
		this.driver = driver;
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		wait = fluentWait
					.withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS);
	}
	
	public void login(){
		String tmpTitle = "Sistema gesti\u00f3n de medios";
		wait.until(ExpectedConditions.titleIs(tmpTitle));
		
	}
	
	public void fluentWait(final By locator, final String argText) {
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(60, TimeUnit.SECONDS)
	            .pollingEvery(5, TimeUnit.SECONDS)
	            .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	        	
	        	WebElement tmpElement = driver.findElement(locator);
	        	new Select(tmpElement).selectByValue(argText);
	            return tmpElement;
	        }
	    });

	};
	
	
	public void openFormPauOrdenPauta() throws InterruptedException{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		driver.findElement(By.id("listPauOrdenPauta:btnInsertarPauta")).click();
	    driver.findElement(By.id("formPauOrdenPauta:btnSearchMedio")).click();
	    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
	    
	    Thread.sleep(500);
	    fluentWait(By.id("formPauOrdenPauta:cmbMedio"), "MedMedio[id=59100]");   //Tener un medio en donde la categoria tenga un presupuesto asi como el negocio
	    
	    Thread.sleep(500);
	    fluentWait(By.id("formPauOrdenPauta:cmbNegNegocio"), "NegNegocio[id=5]");

	    Thread.sleep(500);
	    fluentWait(By.id("formPauOrdenPauta:cmbMedVehiculo"), "MedVehiculo[id=54353]");

	    Thread.sleep(500);
	    fluentWait(By.id("formPauOrdenPauta:cmbMedSoporte"), "MedSoporte[id=56201]");
	    
	    Thread.sleep(500);
	    fluentWait(By.id("formPauOrdenPauta:cmbEjecutivoCuenta"), "OrgContacto[id=61351]");
	    
	    Thread.sleep(500);
	    fluentWait(By.id("formPauOrdenPauta:cmbSerOrdenServicio"), "SerOrdenServicio[id=95300]"); //Debe haber inicialmente una orden de servicio
	     
	    driver.findElement(By.id("formPauOrdenPauta:btnSearchCampana")).click();
	    driver.findElement(By.id("popupListCampCampana:txtNombreCampannia")).clear();
	    driver.findElement(By.id("popupListCampCampana:txtNombreCampannia")).sendKeys("IniSel2014M80"); //Codigo de la iniciativa
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
	}
}
