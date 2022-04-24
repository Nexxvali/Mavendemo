package seleniumwebdriver.mavendemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demomaven {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		File f=new File("D:\\selenium_q&A\\mavendemo\\config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
			System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
				driver=new ChromeDriver();
				driver.get(prop.getProperty("url"));
		
		
			driver.findElement(By.name(prop.getProperty("username"))).sendKeys("Admin");
			driver.findElement(By.name(prop.getProperty("password"))).sendKeys("admin123");
			
			}
		
			
			
	}

