package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ResultadoPage {
	
	AndroidDriver<MobileElement> driver;
	
	By resultado = By.id("es.redsys.smm.arq.inte:id/tv_resultado");
	
	
	public ResultadoPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public String getTextoResultado() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(resultado));
		return driver.findElement(resultado).getText();
		
	}
	
	

}