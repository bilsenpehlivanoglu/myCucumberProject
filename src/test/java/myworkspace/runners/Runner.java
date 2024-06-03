package myworkspace.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//cucumber ile junitin entegre olmasını saglayarak senaryolarımızı calıstırmaya yarar.
@CucumberOptions(//bu notasyon sayesinde hangi sce
// nariolari calistiracağımizi ve hangi raporlari alacağımızı ayarlariz
        plugin = {
                "pretty",//console da scenariolar ile ilgili ayrıntılı bilgiler verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml "
        },
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinitions", "techproed/hooks"},
        tags = "@US012" ,
        dryRun = false,
        monochrome = false //true kullanırsak consoledaki cıktıları renksiz gosterir
)
public class Runner {
}

/*
  Runner class is used to run the feature files
  And add some report plugins
  Runner class also connects the JAVA (step definitons)and NON-JAVA(feature files)parts
  @RunWith(Cucumber.class)is used for making the class Runnable
  @CucumberOptions is used for connecting features and step definitons.It is also used for configurations and cucumber reprot plugins
  features is used for path of the features folder
  glue is used to give the path of the step definitions folder
*/

/*
      dryRun parametresi eger true secilirse scenariolari calistirmadan feature file daki steplerin
       eksik stepDefinitioni olup olmadigini kontrol eder, (browseri calistirmaz)
 */
