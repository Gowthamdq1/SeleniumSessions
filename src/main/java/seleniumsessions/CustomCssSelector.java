package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//id 
		// #id
		// #input-firstname -- css selector for id
		//input[@id='firstname'];
		By  fn = By.cssSelector("#input-firstname");
		
		//tag#id -- We can mention tagname also before the id css selector
		//input#input-firstname
		
		//class
		// .classname
		// tag.classname
		//.c1.c2.c3...cn
		//tag.c1.c2.c3...cn
		
		//.form-control
		//input.form-control
		//Input.form-control.private-form__control.login-email
		//button.login-submit
		
		//tag#id.class
		//input#username.form-control
		//tag.class#id
		//input.form-control#username
		//#id.class
		//#username.formcontrol
		//.class#id
		//.formcontrol#username
		
		//tag.c1.c2.c3...cn#id
		//input#username.form-control.private-form__control
		//input.form-control.private-form__control#username
		
		//othr attr:
		//tag[attr='value']
		// input[type='text'] -- css
		//input[@type='text'] -- xpath
		// input[id='input-firstname']
		
		// input[class='login-email'] -- css - 0 
		//since it is in form of xpath it will not consider one class
		
		//input[@class='login-email'] -- xpath -- 0
		
		//input[contains(@class,'login-email')] -- 1  -- xpath
		
		//multiple attr for css:
		//tag[attr1='value'][attr2='value'][attr3='value']
		//input[type='text'][placeholder='First Name'][id='input-firstname']
		
		// tag#id[attr='value'] -- css
		// input#input-firstname[placeholder='First Name']
		
		//input#input-firstname[placeholder='First Name'][type='text'][class='form-control']
		
		//h1[text()='Register Account']
		//text is not supported in CSS as like the xpath written above
		
		//contains in CSS
		// tag[attr*='value']
		// input[id*='firstname'] -- css
		// input[class*='login-email']
		
		//starts-with in css
		// tag[attr^='value']
		// input[placeholder^='First'] -- starts-with css
		// input[id^='naveen_']
		
		//ends-with
		// tag[attr$='value']
		// input[id$='firstname'] ends-with css
		// input[placeholder$='Name'] ends-with css
		
		// Parent to child in css
		// parent tag child tag
		// parent tag > child tag > child tag
		
		// div.private-form__input-wrapper input#username
		
		
		// form#Form_getForm > select -- 0 -- direct child element 
		// form#Form_getForm select -- 1 - Indirect + direct child elements
		
		// form#hs-login > div -- 8 -- direct elements 
		// form#hs-login div -- 20 -- direct + indirect elements
		
		//child to parent: Backward traversing ? -- not available
		// It is not possible with CSS
		
		//or comma in CSS
		// input#username,button#loginBtn,input#password,button#ssoBtn
		// (FEs) css size -- 4
		
		int imtFieldsCount = driver.findElements(By.cssSelector("input#username,button#loginBtn,input#password,button#ssoBtn")).size();
		
		if(imtFieldsCount==4) {
			
		}
		
		// img[title='naveenopencart'],input[name='search'],button[data-toggle='dropdown']
		// Using above css we can check multiple fields present or not 
		
		//Indexing : not in CSS
		
		// input.form-control.private-form__control:not(#password)
		
		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search'],input[name='firstname'])
		// We can include multiple elements for excluding 
		// Here we are excluding the elements which is not required using not keyword
		
		// select#Form_getForm_Country > option:first-child
		// select#Form_getForm_Country > option:last-child
		
		// select#Form_getForm_Country > option:first-of-type
		// select#Form_getForm_Country > option:last-of-type
		
		// select#Form_getForm_Country > option:nth-of-type(3)
		// select#Form_getForm_Country > :nth-of-type(3)
		
		// footer ul
		
		                      // xpath          vs           CSS
		// 1.Syntax          Complex                         Simple
		// 2.text()          Yes                             NO
		// 3.AND:            Yes                             Yes
		// 4.OR:             Yes                             Yes,Comma
		// 5.Forwards        Yes                             Yes
		// 6.Backwards       Yes                              No
		// 7.fwd sibling     Yes                             Yes
		// 8.Back sibling	 Yes                              No
		// 9. not:           NO                               Yes
		// 10. index:        Yes                              Yes
		// 11. caputre grp   Yes                              No
		// 12.performance:   good                             good
		// 13. starts-with   yes                              yes
		// 14. contains      yes                              yes
		// 15. ends-with     no                               yes
		// 16. webtable      yes                              limited
		
		//sibling in css:
		// label[for='input-email'] + input[name='email'] -- 1 immediate sibling
		// div.private-form__label-wrapper~div ~ -- > All forward sibilings
		
	}
	
}
