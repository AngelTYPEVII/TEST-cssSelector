package Steps.css.cssTools;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class cssTransitionElement {
    SelenideElement itemId;
    public cssTransitionElement(int childNumber,int id){
        this.itemId= $(By.cssSelector("div.accordion > div:nth-child("+childNumber+") li#item-"+id));
    }
}
