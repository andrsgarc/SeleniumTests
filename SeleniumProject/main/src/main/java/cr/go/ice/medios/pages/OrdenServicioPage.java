package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdenServicioPage {
	private final WebDriver driver;
	private final Wait<WebDriver> wait;

	public OrdenServicioPage(WebDriver driver) {
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
	
	public void openOrdenPauta(){
		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("j_id43")));
	}
	
	public void openFormSerOrdenServicio(){		
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
}
