package br.com.configureCucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/" }, features = { "src/test/resource/PassagemHotel.feature" })
public class RunnerTest {

}
