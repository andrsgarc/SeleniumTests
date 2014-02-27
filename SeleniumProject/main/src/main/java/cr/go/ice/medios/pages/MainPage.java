package cr.go.ice.medios.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class MainPage {
	private final WebDriver driver;
	private final Wait<WebDriver> wait;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		wait = fluentWait
					.withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS);
	}
	
	public void login(){
		wait.until(ExpectedConditions.titleIs("Sistema gestión de medios"));
	}
	
	public void openOrdenPauta(){
		driver.findElement(By.xpath("//span[text()='Orden de pauta']")).click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j_id43")));
	}
}
