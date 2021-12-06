package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormularioPage {
	
	AndroidDriver<MobileElement> driver;
	
	By importe = By.id("es.redsys.smm.arq.inte:id/edittext_importe_solicitud");
	By continuar = By.id("es.redsys.smm.arq.inte:id/boton_importe_solicitud_continuar");
	
	public FormularioPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void selectImporte(String importeSol) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(importe));
		driver.findElement(importe).sendKeys(importeSol);
	}
	
	public void continuarSolicitud() {
		driver.findElement(continuar).click();
	}
	
}
