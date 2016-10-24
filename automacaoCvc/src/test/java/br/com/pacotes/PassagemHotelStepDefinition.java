package br.com.pacotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PassagemHotelStepDefinition {

	WebDriver driver;

	@Given("^Acessar endereco e navegador$")
	public void acessar_endereco_e_navegador() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://vendashom.cvc.com.br/index.aspx");
						
	}

	@When("^Executar venda de passagem mas hotel$")
	public void executar_venda_de_passagem_mas_hotel() throws Throwable {
		driver.findElement(By.id("txtOrigin")).sendKeys("São Paulo");
		driver.findElement(By.id("txtDestination")).sendKeys("Maceio");
		driver.findElement(By.id("btnSearch")).click();
	}

	@Then("^Fechar browser$")
	public void fechar_browser() throws Throwable {
	    
	}
}
