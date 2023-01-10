package Steps.css.cssTools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class cssInput {
    private final SelenideElement id;
    public cssInput(String id){
         this.id = $(By.cssSelector("input#"+id));
    }
}