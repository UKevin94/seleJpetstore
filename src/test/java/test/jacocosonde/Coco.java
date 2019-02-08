package test.jacocosonde;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Coco {

	@Test
	public void coco1 () {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:8580/jpetstore");
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//a[@href='actions/Catalog.action']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'FISH')]")));
		driver.findElement(By.xpath("//a[contains(@href,'?viewCategory=&categoryId=FISH')]")).click();
		driver.findElement(By.xpath("//a[.='FI-FW-01']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'addItemToCart=&workingItemId=EST-4')]")).click();
		driver.findElement(By.xpath("//input[@name='EST-4'][@type='text']")).clear();
		driver.findElement(By.xpath("//input[@name='EST-4'][@type='text']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Update Cart']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'37')]")));
		driver.findElement(By.xpath("//a[@class='Button'][contains(@href,'?newOrderForm')]")).click();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("ACID");
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("ACID");
		driver.findElement(By.xpath("//input[@type='submit'][@name='signon']")).click();
		driver.quit();
	}
}
