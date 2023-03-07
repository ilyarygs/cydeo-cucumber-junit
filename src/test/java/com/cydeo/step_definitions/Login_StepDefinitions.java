package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("user enters librarians username")
    public void user_enters_librarians_username() {
        System.out.println("user enter librarian username");
    }
    @When("user enters librarians password")
    public void user_enters_librarians_password() {
        System.out.println("user enter librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enter student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enter student password");
    }


    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enter admin password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enter admin username");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("user is on the library login page");
    }
}
