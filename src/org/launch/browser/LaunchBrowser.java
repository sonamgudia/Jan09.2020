package org.launch.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\my-pc\\eclipse-workspaceselenium1\\SeleniumDay2\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
