package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class Stepbizgurd {
	WebDriver driver;
	
	@Given("open url")
	public void open_url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\bets\\src\\Driver1\\chromedriver.exe" );
		driver=new ChromeDriver(); 
		driver.get("https://hourspark.com/hourspark");
		driver.manage().window().maximize();
		}
	@And("Enter username")
	public void enter_username() {
		WebElement Username=driver.findElement(By.name("username"));
		 Username.sendKeys("jeevitha1.c@toolfe.com");
	}
	@And("Enter Password")
	public void enter_password() {
		WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
	    Password.sendKeys("12345678");
	   
	}
	@And("Click submitButton")
	public void click_submitbutton() {
		WebElement Submit =driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		
	}
	@Given("Click Bizgurd Task")
	public void click_bizgurd_task() {
	   WebElement bizgurd=driver.findElement(By.linkText("HourSpark Tasks"));
	   bizgurd.click();
	}

	@And("Click CrateTask")
	public void click_crate_task() {
	  WebElement CTask=driver.findElement(By.xpath("//a[text()='Create New Task']"));
	  CTask.click();
	}
	@And("Enter TASK title String {string}")
	public void enter_task_title_string(String title) {
		driver.findElement(By.name("task_title")).sendKeys(title);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("Select The Priority")
	public void select_the_priority() {
		
	   Select priority=new Select(driver.findElement(By.name("priority")));
	    priority.selectByVisibleText("Medium");
	}

	@And("Select Department")
	public void select_department() {
	    Select Department=new Select(driver.findElement(By.name("department")));
	    Department.selectByVisibleText("RPA Developer");
	}

	@And("Enter The Description")
	public void enter_the_description() throws InterruptedException {
	    WebElement Des= driver.findElement(By.xpath("(//textarea[@name='description'])[1]"));
	    Des.sendKeys("Automation Testing");
	    Thread.sleep(2000);
	}

	@And("Upload the document")
	public void upload_the_document() throws InterruptedException {
		
	    WebElement Uploaddocument=driver.findElement(By.xpath("(//span[text()=' Settings']/following::input)[2]"));
        //Uploaddocument.click();
	    Uploaddocument.sendKeys("C:\\Users\\Admin\\Documents\\New folder\\Screenshot 2024-01-29 142352.png");
	    Thread.sleep(2000);
	}

	@And("Click the createtaskButton")
	
	public void click_the_createtask_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ctaskbutton=driver.findElement(By.xpath("//button[text()='Create Task']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ctaskbutton).perform();
	ctaskbutton.click();
		Thread.sleep(4000);;
		System.out.println("Task Created successfully");
		WebElement returnbizgurd=driver.findElement(By.xpath("//*[@id=\"createTaskForm\"]/div/div/div/div/div/div/div[2]/div[3]"));
		returnbizgurd.click();
	}
	@And("Open task")
	public void open_task() {
		WebElement bizgurd=driver.findElement(By.linkText("HourSpark Tasks"));
		   bizgurd.click();
		WebElement opentask=driver.findElement(By.linkText("Open Task"));
		opentask.click();
		
	    
	}
	@And("Click Task detail")
	public void click_task_detail() {
		WebElement tsdetail =driver.findElement(By.xpath("(//h5[text()='Test'])[2]"));
		tsdetail.click();
	    
	}
	@Given("Click CloseTask")
	public void click_close_task() {
	    WebElement closetask=driver.findElement(By.xpath("//button[text()[normalize-space()='Close Task']]"));
	    closetask.click();
	    System.out.println("Task Closed Successfully");
	}
	@Given("We clicked the Project enquiryTAB")
	public void we_clicked_the_project_enquiry_tab() throws InterruptedException {
		WebElement projectenquiry=driver.findElement(By.linkText("Project Inquiry"));
		projectenquiry.click();
		Thread.sleep(3000);
		}
	@Given("Click InitiateProject")
	public void click_initiate_project() throws InterruptedException {
		Thread.sleep(3000);
		WebElement inproject=driver.findElement(By.linkText("Initiate Project"));
		inproject.click();
	    
	}
	@Given("Enter Project Title")
	public void enter_project_title() {
	    WebElement Prtitle=driver.findElement(By.xpath("//input[@class='form-control']"));
	    Prtitle.sendKeys("Project task6");
	}
	@Given("Select the pPriority")
	public void select_the_ppriority() {
	   Select Ppriority=new Select(driver.findElement(By.xpath("(//select[@class='form-select'])[1]")));
	   Ppriority.selectByVisibleText("Medium");
	}
	@Given("Select the Category")
	public void select_the_category() {
	    	Select Cate= new Select(driver.findElement(By.xpath("(//select[@class='form-select'])[2]")));
	    	Cate.selectByVisibleText("Software Development");
	}
	@Given("Select the Budget range")
	public void select_the_budget_range() {
	   Select budget=new Select(driver.findElement(By.xpath("(//select[@class='form-select'])[3]")));
	   budget.selectByVisibleText("50K-3L");
	}
	@Given("choose Start Date")
	public void choose_start_date() {
	   WebElement sdate=driver.findElement(By.xpath("(//input[@class='datepicker-here form-control'])[1]"));
	   sdate.sendKeys("14.06.2024");
	}
	@Given("choose Ending date")
	public void choose_ending_date() {
	    WebElement edate=driver.findElement(By.xpath("(//div[@class='mb-3']//input)[3]"));
	    edate.sendKeys("20.06.2024");
	}
	@Given("Enter Description")
	public void enter_description() throws InterruptedException {
	    WebElement des=driver.findElement(By.xpath("(//textarea[@name='description'])[1]"));
	    des.sendKeys("test in automate");
	    Thread.sleep(5000);
	}
	@Given("Upload Document")
	public void upload_document() throws InterruptedException {
	   WebElement Updocument= driver.findElement(By.xpath("//input[@type='file']"));
	   Updocument.sendKeys("C:\\Users\\Admin\\Documents\\New folder\\Screenshot 2024-01-29 142352.png");
	   Thread.sleep(5000);
	}
	@Given("Click SubmitButton")
	public void click_submit_button() throws InterruptedException {
	    WebElement subutton=driver.findElement(By.xpath("//button[text()='Submit']"));
	    Actions ac1=new Actions(driver);
		ac1.moveToElement(subutton).perform();
	    subutton.click();
	    System.out.println("Project created Successfully");
	    
	}

	@Given("Cick strategy hub")
	public void cick_strategy_hub() {
	   WebElement Strategy=driver.findElement(By.linkText("Strategy Hub"));
	   Strategy.click();
	}
	@And("Click Taskdetails")
	public void click_taskdetails() {
	    WebElement taskdetails=driver.findElement(By.xpath("//div[@id='all-links']/div[1]/div[1]/div[1]"));
	    taskdetails.click();
	    System.out.println("Task open successfully");
	}



	
	



	
	




}
