package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest
{
    static String baserUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F" ; // Storing url into variable
    static WebDriver driver;
    public static void main(String[] args)
    {
        driver = new ChromeDriver(); //1.Launch the Chrome browser
        driver.get(baserUrl); // 2.open the  link into Chrome browser
        System.out.println("Page Title: " + driver.getTitle());//3.print the page title
        System.out.println("Current Url : " + driver.getCurrentUrl());//4.print current url
        System.out.println("Page source : " + driver.getPageSource());//5.Print page source
        driver.findElement(By.id("Email")).sendKeys("akta123@gmail.com");//Enter the email to email field
        driver.findElement(By.id("Password")).sendKeys("akta123"); // Enter the password to password field
        driver.close(); // Close the browser

    }
}
