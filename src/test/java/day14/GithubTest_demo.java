package day14;

import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://automationbookstore.dev/");
}
}