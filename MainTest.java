package SpiceJet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("kol");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("ban");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']")).click();
		////div[contains(@class, 'r-y47klf')]
		//css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu
		driver.findElement(By.xpath("//div[contains(@class, 'r-y47klf')]")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		for(int i=0;i<5;i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		//driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		WebElement targetElement = driver.findElement(By.xpath("//div[text()='LKR']"));
		/*List<WebElement> currencyList = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-8fdsdq']/div[2]/div"));
		System.out.println(currencyList.get(0).getText());
		for(int i=0; i<currencyList.size(); i++) {
			System.out.println(currencyList.get(i).getText());
			if(currencyList.get(i).getText().equals("LKR")){
				targetElement = currencyList.get(i);
				System.out.println(targetElement.getText());
				break;
			}
		}*/
		Actions actns = new Actions(driver);
		
		actns.scrollToElement(targetElement).perform();
		targetElement.click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n'] /div[text()='Govt. Employee']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
																																																																																						

	}

}
	
