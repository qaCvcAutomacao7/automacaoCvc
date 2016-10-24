package br.com.pacotes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PassagemHotel {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// home
		openHome(driver);

	}

	// Metodo Preencher Motor de Busca Carros
	private static void openHome(WebDriver driver) throws InterruptedException,
			IOException {
		driver.get("http://vendashom.cvc.com.br/index.aspx");
		driver.findElement(By.xpath(".//*[@id='searchEngine']/ul/li[3]/a")).click();

	}

}
