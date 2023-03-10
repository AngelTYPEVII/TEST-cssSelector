package Steps.Xpath.Page.Forms;

import Steps.Xpath.tools.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class PageForms {
    File file =new File("jo.jpeg");
    private final SelenideElement forms = new Transition("Forms").getH5();
    private final SelenideElement registrationForm = new TransitionElement("Practice Form").getSpan();
    private final SelenideElement firstName = new Input("firstName").getId();
    private final SelenideElement lastName = new Input("lastName").getId();
    private final SelenideElement userEmail = new Input("userEmail").getId();
    private final SelenideElement genderMale = $(By.xpath("//label[.='Male']"));
    private final SelenideElement userNumber = new Input("userNumber").getId();
    private final SelenideElement dateOfBirth = new  Input("dateOfBirthInput").getId();
    private final SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    private final SelenideElement september = $(By.xpath("//option[@value='9']"));
    private final SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    private final SelenideElement year2002 = $(By.xpath("//option[@value='2002']"));
    private final SelenideElement date_26_09_2002 = $(By.xpath("//div[@aria-label='Choose Thursday, September 26th, 2002']"));
//    private final SelenideElement hobbiesMusic = $(By.xpath("//label[.='Music']"));
    private final SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private final SelenideElement btnSubmit = new Button("submit").getId();
    private final SelenideElement closeLargeModal =$(By.xpath("//button[@id='closeLargeModal']"));
    private final SelenideElement uploadPicture = new Input("uploadPicture").getId();
    private final SelenideElement element = $(By.xpath("//span[@class='pr-1']"));
    private final SelenideElement scroll = $(By.xpath("//div[@class='left-pannel']"));


    @Step("?????????????? ?? ???????????????? ???????????????? ???? ???????????????? \"Student Registration Form\"")
    public void transitionForms(){
        forms.should(Condition.visible).click();
        registrationForm.should(Condition.visible).click();
    }
    @Step("???????? ?????????? ?? ???????? \"First Name\"")
    public void inputFirstName(String first_name) {
        firstName.val(first_name);
    }
    @Step("???????? ?????????????? ?? ???????? \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.val(last_name);
    }
    @Step("???????? ?????????? ?? ???????? \"Email\"")
    public void inputEmail(String email) {
        userEmail.val(email);
    }
    @Step("?????????? ??????????????")
    public void inputGender(){
        genderMale.click();
    }
    @Step("???????? ???????????? ???????????????? ?? ???????? \"Mobile\"")
    public void inputNumber(String number){
        userNumber.val(number);
    }
    @Step("?????????? ???????? ???????????????? (18/11/2002)")
    public void inputDateOfBirth() {
        dateOfBirth.click();
        monthSelect.click();
        september.click();
        yearSelect.click();
        year2002.click();
        date_26_09_2002.click();
    }
    @Step("?????????? ??????????")
    public void inputHobbies(String arg, String arg1, String arg2) {
        new SwitcherHobbies(arg,arg1,arg2);
    }
    @Step("???????????????? ??????????????")
    public void avatarUpload(){
        uploadPicture.uploadFile(file);
    }
    @Step("???????? ???????????? ?? ???????? \"Address\"")
    public void inputAddress(String address ){
        currentAddress.val(address);
    }

    @Step("?????????????? ???????????? \"Submit\"")
    public void submit(){
        element.click();
        scroll.scrollTo();
        scroll.scrollIntoView(true);
        btnSubmit.should(Condition.visible).click();
    }
    @Step("?????????????? ???????????? \"Close\"")
    public void closeWidow(){
        closeLargeModal.click();
    }
}
