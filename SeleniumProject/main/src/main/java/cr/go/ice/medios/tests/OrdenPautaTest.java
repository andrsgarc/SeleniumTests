package cr.go.ice.medios.tests;

import org.junit.Test;


import cr.go.ice.medios.pages.MainPage;

public class OrdenPautaTest extends TestSicome{

	@Test
	public void crearOrdenPautaTest() throws Exception {
		MainPage mainPage = new MainPage(driver);
		mainPage.login();
		mainPage.openOrdenPauta();
	}
}
