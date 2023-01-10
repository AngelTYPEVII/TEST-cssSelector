package Steps.Xpath.tools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class Input {
    private final SelenideElement id;
    public Input(String id){
        this.id = $(By.xpath("//input[@id='"+id+"']"));
    }
}