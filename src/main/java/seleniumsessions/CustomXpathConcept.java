package seleniumsessions;

import org.openqa.selenium.By;

public class CustomXpathConcept {
	
	public static void main(String[] args) {
		
		//xpath is not an attribute
		//xpath : address of the element 
		//1. absolute xpath: risky xpath
		//2. relative xpath: custom xpath
		
		//xpath with one attribute
		//tagname[@attr='value']
		//input[@name='email'
		
		//xpath with two attributes
		//tagname[@attr1='value' and @attr2='value']
		//input[@name='email' and @id='input-email']
		
		//xpath with three attributes
		//tagname[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@name='email' and @id='input-email' and @type='text']
		
		//OR - Either of them 
		//AND - Both of the xpath mentioned should satisfy
		
		//xpath with OR condition
		//input[@name='email' or @id='input-email']
		//input[@type='text' or @id='input-firstname']
		
		//xpath with text function
		//text is not an attribute
		//tag[text()='value']
		//h2[text()='Returning Customer']
		//By newCustomer = By.xpath("//h2[text()='Returning Customer']");
		
		//Text function with attribute
		//tag[@attr='value' and text()='value']
		//h1[@class='h0-80' and text()='Love your software']
		
		//contains with attribute
		//tag[contains (@attr,'value')]
		//input[contains (@placeholder,'E-Mail')]
		
		//contains() with one attribute and use another attribute without contains()
		//tag[contains(@attr1,'value') and @attr2='value']
		//input[contains (@placeholder,'E-Mail') and @name='email']
		//input[contains (@placeholder,'E-Mail') and @name='email' and @type='text']
		
		//dynamic id/attribute
		
		//<input id=firstname_123>
		//<input id=firstname_456>
		//<input id=firstname_123>
		
		//By.id("firstname_123");//not the right xpath 
		//input[contains(@id,'firstname_')] -- right
		
		//contains with text:
		//tag[contains ( text(),'value')]
		//p[contains ( text(),'marketing, sales, support')]
		//h2[contains ( text(),'50,000 companies')]
		//a[contains ( text(),'About Amazon')]
		
		//contains with text() and contains with attribute:
		//tag[contains (text(),'') and contains(@attr,'value')]
		//a[contains (@href,'aboutamazon') and contains ( text(),'About Amazon')]
		
		//contains with text and attribute without contains():
		//tag[contains (text(),'') and @attr='value')]
		//a[contains (@href,'science') and @class='nav_a']
		
		//starts-with():
		//tag[starts-with(text(),'value')]
		//a[starts-with(text(),'Amazon')]
		
		//ends-with() in xpath???  -NA 
		//It is deprecated and it is not supported in any of the browser
		
		//position index in xpath
		//(//input[@class='form-control'])[1]
		//(//input[@class='form-control'])[position()=1]
		//() - Brackets surrounding xpath is called capture group
		//(//input[@class='form-control'])[6]
		
		//(//input[@class='form-control'])[last()]
		//It will highlight last previous element
		//(//input[@class='form-control'])[last()-1]
		
		
		//((//div[contains (@class , 'navFooterLinkCol')])[last()]//a)[last()]
		//((//div[contains (@class , 'navFooterLinkCol')])[last()]//a)[last()-1]
		
		//class in locator: classname , xpath , css 
		//input[@class='form-control private-form__control login-email'] -- valid
		//We have to collect all the class name so that it will be considered
		//input[@class='login-email'] -- not valid
		
		//By.className("form-control private-form__control login-email"); -- not valid
		//Not valid only one class should be used
		//By.className("login-email"); -- valid now
		//input[contains ( @class , 'login-email')]
		
		//parent to child
		
		//parent/single slash /child -- > direct
		//parent //double slash// child -- > direct + indirect both
		
		//child to parent
		//input[@name='email']/../../../../../../.. -- Backward traversing
		
		//input[@name='email']/preceding-sibling::label
		//label[@for='input-email']/following-sibling::input[@name='email']
		
		//*[@name='firstname'] -- Performance -->low
		//input[@name='firstname'] -- Performance --> Faster
		
		
	
	}

}
