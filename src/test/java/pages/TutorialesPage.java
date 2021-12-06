package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TutorialesPage {
	
	AndroidDriver<MobileElement> driver;
	
	By saltar = By.id("es.redsys.smm.arq.inte:id/boton_tutorial_saltar");
	By tutorial = By.id("es.redsys.smm.arq.inte:id/tv_tutorial_inicial");
	
	public TutorialesPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void saltar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(saltar));
		driver.findElement(saltar).click();
	}
	
	public void scroll(){
		
		final int PRESS_TIME = 200;
		
		int edgeBorder = 10;
		PointOption pointOptionStart, pointOptionEnd;
		
		Dimension dims = driver.manage().window().getSize();
		
		pointOptionStart = PointOption.point(dims.width /2, dims.height /2);
		pointOptionEnd = PointOption.point(edgeBorder, dims.height /2);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(tutorial));
		
		for(int i=0; i<2; i++) {
			new TouchAction(driver)
			.press(pointOptionStart)
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
			.moveTo(pointOptionEnd)
			.release().perform();
		}
	}

}
