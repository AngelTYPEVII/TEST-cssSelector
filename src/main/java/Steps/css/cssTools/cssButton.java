package Steps.css.cssTools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class cssButton {
    SelenideElement idButton;
    public cssButton(String id){
        this.idButton=$(By.cssSelector("button#"+id));
    }
}
