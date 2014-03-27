package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrdenServicioPage extends MainPage {

	public OrdenServicioPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void openFormSerOrdenServicio() throws InterruptedException{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Orden de servicio']")).click();
		driver.findElement(By.xpath("//span[text()='Orden de servicio']")).click();
		driver.findElement(By.id("listSerOrdenServicio:btnInsertarSerOrdenServicio")).click();
	    driver.findElement(By.id("formSerOrdenServicio:txt_numeroOrden")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_numeroOrden")).sendKeys(ORDEN_SERVICIO_NUMERO);
	    driver.findElement(By.id("formSerOrdenServicio:txt_contratacion")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_contratacion")).sendKeys(ORDEN_SERVICIO_CONTRATACION);
	    driver.findElement(By.id("formSerOrdenServicio:txt_compromiso")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_compromiso")).sendKeys(ORDEN_SERVICIO_COMPROMISO);
	    driver.findElement(By.id("formSerOrdenServicio:btnInsertarRazonSocial")).click();
	    
	    driver.findElement(By.id("popupListMedRazonSocial:dtMedRazonSocial:0:btnSelect")).click();
	    Thread.sleep(1000);
	    fluentWait(By.id("formSerOrdenServicio:cmbSector"), "OrgSector[id=50050]");
	    Thread.sleep(1000);
	    fluentWait(By.id("formSerOrdenServicio:cmbDireccion"), "OrgDireccion[id=52152]");
	    Thread.sleep(1000);
	    fluentWait(By.id("formSerOrdenServicio:cmbNegocio"), "NegNegocio[id=5]");
	    Thread.sleep(1000);
	    fluentWait(By.id("formSerOrdenServicio:cmbProceso"), "OrgProceso[id=51353]");

	    
	    Thread.sleep(1000);
	    fluentWait(By.id("formSerOrdenServicio:cmbTipoContrato"), "NegTipoContrato[id=1]");
	    
	    
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).click();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoTotal")).sendKeys("10000000");
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).click();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).clear();
	    driver.findElement(By.id("formSerOrdenServicio:txt_montoSaldo")).sendKeys("10000000");
	    driver.findElement(By.id("formSerOrdenServicio:btnActivarOrdenServicio")).click();		
	    driver.findElement(By.id("formSerOrdenServicio:btnGuardarSerOrdenServicio")).click();		
	}
}
