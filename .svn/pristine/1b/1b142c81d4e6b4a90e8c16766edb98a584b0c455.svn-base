package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class IdiomaPage {
	
	AndroidDriver<MobileElement> driver;
	
	By radioButton = By.className("android.widget.RadioButton");
	By continuar = By.id("es.redsys.smm.arq.inte:id/boton_continuar_idioma");

	
	public IdiomaPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void elegirIdioma() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(radioButton));
		driver.findElement(radioButton).click();
	}
	
	public void continuar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(continuar));
		driver.findElement(continuar).click();
		
	}
	
	
	

}
