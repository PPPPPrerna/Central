package quick.Sm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateTest {

	@Test
	public void display() {

		int num =3;
		
		for(int i=1 ;i<num; i++) {
			
			num = num*i;
			
			System.out.println("Yeah");
		}
		System.out.println(num);
	
	}
			
	}

