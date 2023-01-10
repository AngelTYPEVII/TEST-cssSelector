package Steps.css.cssTools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class cssTransition {
    SelenideElement nClass;
    public cssTransition(int number){
        this.nClass=$(By.cssSelector("div.category-cards > div:nth-of-type("+number+")"));
    }
}
