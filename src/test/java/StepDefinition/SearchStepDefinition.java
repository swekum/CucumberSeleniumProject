package StepDefinition;

import AmazonImplemention.Product;
import AmazonImplemention.Search;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SearchStepDefinition {

    Product product;
    Search search;

    @Before("@smoke")
    public void testsetup(Scenario scenario){
        System.out.println("testsetup");
    }

    @After
    public void aftertest(){
        System.out.println("aftertest");
    }

    @Given("I have a search field on amazon page")
    public void i_have_a_search_field_on_amazon_page( DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        List<Map<String,String>> datalist = dataTable.asMaps(String.class,String.class);
        System.out.println(datalist.get(0).get("col1"));
//        Iterator iterator = datamap.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String , String> cast = (Map.Entry<String, String>) iterator.next();
//            System.out.println(cast.getKey() + "            " + cast.getValue());
//        }

//        List<List<String>> lists = dataTable.asLists(String.class);
//        for (List<String> e:
//             lists) {
//            for (String y:
//                 e) {
//                System.out.println(y);
//            }
//
//        }

    }

    @When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        product = new Product(productName , price);
        System.out.println("i_search_for_a_product_with_name_and_price" + productName + price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("product_with_name_should_be_displayed");
        search = new Search();
        String actual = search.displayProduct(product);
        Assertions.assertEquals(productName , actual);
    }
}
