package Steps.css.cssPage;

import Steps.css.cssTools.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class PageWebTables {
    private final SelenideElement elements = new cssTransition(1).getNClass();
    private final SelenideElement webTable = new cssTransitionElement(1,3).getItemId();
    private final SelenideElement btnAdd = new cssButton("addNewRecordButton").getIdButton();
    private final SelenideElement firstName = new cssInput("firstName").getId();
    private final SelenideElement lastName = new cssInput("lastName").getId();
    private final SelenideElement eMail = new cssInput("userEmail").getId();
    private final SelenideElement age = new cssInput("age").getId();
    private final SelenideElement salary = new cssInput("salary").getId();
    private final SelenideElement department = new cssInput("department").getId();
    private final SelenideElement submit= new cssButton("submit").getIdButton();
    @Step("Переход на страницу \"Web Tables\"")
    public void transitionElements(){
        elements.should(Condition.visible).click();
        webTable.should(Condition.visible).click();
    }
    @Step("Нажатие кнопки \"Add\"")
    public void addUser(){
        btnAdd.should(Condition.visible).click();
    }
    @Step("Ввод имени")
    public void inputFirstUserName(String userFirstName){
        firstName.should(Condition.visible).val(userFirstName);
    }
    @Step("Ввод фамилии")
    public void inputLastUserName(String userLastName){
        lastName.should(Condition.visible).val(userLastName);
    }
    @Step("Ввод почты")
    public void inputUserEmail(String userEmail){
        eMail.should(Condition.visible).val(userEmail);
    }
    @Step("Ввод возраста")
    public void inputUserAge(int  userAge){
        age.should(Condition.visible).val(String.valueOf(userAge));
    }
    @Step("Ввод зарплаты")
    public void inputSalary(int userSalary){
        salary.should(Condition.visible).val(String.valueOf(userSalary));
    }
    @Step("Ввод департамента")
    public void inputDepartment(String userDepartment){
        department.should(Condition.visible).val(String.valueOf(userDepartment));
    }
    @Step("Нажатие кнопки\"submit\"")
    public void submit(){
        submit.should(Condition.visible).click();
    }

}

