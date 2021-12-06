package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ConfirmacionPage {
	
	AndroidDriver<MobileElement> driver;
	
	By finalizar = By.id("es.redsys.smm.arq.inte:id/boton_confirmacion_solicitud_continuar");
	
	public ConfirmacionPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void finalizar() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(finalizar));
		driver.findElement(finalizar).click();
		
	}

}
