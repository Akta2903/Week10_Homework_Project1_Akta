package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F"; // Storing url into variable
    static WebDriver driver;
    static String browser = "Firefox";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver(); // launch the Chrome browser

        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver(); // launch the Firefox browser
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver(); // launch Edge browser
        } else {
            System.out.println("Enter browser from Chrome or FireFox or Edge");
        }

        driver.get(baseUrl); // it will open the nop commerce url
        System.out.println("Page Title : " + driver.getTitle()); // 1. Print the page title
        System.out.println("Current URL : " + driver.getCurrentUrl()); // 2. Print the current Url
        System.out.println("Page Source : " + driver.getPageSource()); // 3. Print the page source
        driver.findElement(By.id("Email")).sendKeys("akta123@gmail.com");//4.Enter the emailid into emailid field
        driver.findElement(By.id("Password")).sendKeys("Akta123"); // 5. Enter the password into password field
        driver.close(); // close the browser


    }


}
