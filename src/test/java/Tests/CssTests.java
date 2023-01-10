package Tests;

import Persons.Person;
import Steps.css.cssElement.ElementDroppable;
import Steps.css.cssPage.PageWebTables;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CssTests {
    private static final String baseUrl ="https://demoqa.com/";
    ElementDroppable elementDroppable =new ElementDroppable();
    PageWebTables webTables= new PageWebTables();


    Person person =new Person("Тимур","Карпинский",
            "Angel-TYPEVII","Кострома",
            "Кострома","timurka2609@yandex.ru",
            "89621845293",20);
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
    @Test
    public void testWebTables(){
        webTables.transitionElements();
        webTables.addUser();
        webTables.inputFirstUserName(person.getName());
        webTables.inputLastUserName(person.getLastName());
        webTables.inputUserEmail(person.getEmail());
        webTables.inputUserAge(person.getAge());
        webTables.inputSalary(30000);
        webTables.inputDepartment("SsSSSSsssQQQqq");
        webTables.submit();
    }
    @Test
    public void testDrop(){
        elementDroppable.transitionDroppable();
        elementDroppable.drop();
    }

}
