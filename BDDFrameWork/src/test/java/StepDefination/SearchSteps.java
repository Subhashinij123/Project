package StepDefination;

import AmazonImplemaentation.Product;
import AmazonImplemaentation.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	Product product;
	Search search;
	@Given("^I have a search field on Amazon Page$")
    public void i_have_a_search_field_on_amazon_page() throws Throwable {
		System.out.println("I have a search field on Amazon Page$");
    }

    @When("^I search for a product with name \"([^\"]*)\" and price 1000$")
    public void i_search_for_a_product_with_name_something_and_price_1000(String  productName,int price) throws Throwable {
    	System.out.println("search the product with name: "+ productName + "price" +price);
    product = new Product(productName,price);
    }
    
    

    @Then("^Product with name \"([^\"]*)\" should be displayed$")
    public void product_with_name_something_should_be_displayed(String productName) throws Throwable {
    	System.out.println("product "+ productName + " is displayed");
    	search = new Search();
    	String name = search.displayProduct(product);
    	System.out.println("searched product is :"+name);
    	Assert.assertEquals(product.getProductName(), name);
    }
    

}
