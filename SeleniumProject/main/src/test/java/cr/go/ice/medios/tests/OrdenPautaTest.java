package cr.go.ice.medios.tests;

import org.junit.Test;

import cr.go.ice.medios.pages.MainPage;
import cr.go.ice.medios.pages.OrdenPautaPage;

public class OrdenPautaTest extends TestSicome{

	@Test
	public void openOrdenPautaListTest() throws Exception {
		MainPage mainPage = new MainPage(driver);
		mainPage.login();
		mainPage.openOrdenPauta();
	}

	
	@Test
	public void ordenPautaFullTest() throws Exception {
		OrdenPautaPage pautaPage = new OrdenPautaPage(driver);
		pautaPage.login();
		pautaPage.openFormPauOrdenPauta();
		pautaPage.aprobarPauOrdenPauta();
	}
}
