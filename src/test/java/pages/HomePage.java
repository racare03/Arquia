package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class HomePage {
	
	AndroidDriver<MobileElement> driver;
	
	By solicitar = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Solicitar\"]/android.widget.TextView");
	By receptor = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout");
	By multiple = By.id("es.redsys.smm.arq.inte:id/selector_operativas");
	By usuario1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RadioButton");
	By usuario2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RadioButton");
	By usuario3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RadioButton");
	By noMostrar1 = By.id("es.redsys.smm.arq.inte:id/tv_alert_hide");
	By noMostrar2 = By.id("es.redsys.smm.arq.inte:id/tv_alert_hide");
	
	
	public HomePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	
	public void Solicitar() {
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(solicitar));
		driver.findElement(solicitar).click();
	}
	
	public void selectReceptor() {
		driver.findElement(receptor).click();
	}
	
	public void selectReceptorNoReg() {
		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"#\").instance(0))";
		driver.findElementByAndroidUIAutomator(scrollElement).click();
	}
	
	public void selectReceptoresNoReg() {
		String receptor1 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\")\").instance(0))";
		driver.findElementByAndroidUIAutomator(receptor1).click();
		String receptor2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\".\").instance(0))";
		driver.findElementByAndroidUIAutomator(receptor2).click();
	}
	
	public void noMostrarMas() {
		driver.findElement(noMostrar1).click();
		driver.findElement(noMostrar2).click();
	}
	
	public void selectMultiple() {
		driver.findElement(multiple).click();
	}
	
	public void selectUsuariosReg() {
		driver.findElement(usuario1).click();
		driver.findElement(usuario2).click();
		driver.findElement(usuario3).click();
	}
	
	public void selectSeguir(int x, int y) {
		new TouchAction(driver).tap(point(x,y)).waitAction(waitOptions(ofMillis(250))).perform();
		
	}
		
	
	}

