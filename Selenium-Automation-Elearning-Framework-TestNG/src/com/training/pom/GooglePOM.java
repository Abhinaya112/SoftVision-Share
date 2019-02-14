package com.training.pom;



	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class GooglePOM {
		private WebDriver driver; 
		
		public GooglePOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		// Locate and send maid ID
		@FindBy(id="identifierId")
		private WebElement mailId; 
	
		
		public void sendmailID(String mailId) {
			this.mailId.clear();
			this.mailId.sendKeys(mailId);
		}
		
		// Locate and click on Next
		@FindBy(xpath="//*[@id='identifierNext']/content")
		private WebElement next; 
	
		
		public void clickNext() {
			this.next.click();
		}
		
		// Locata and Send password
		@FindBy(xpath="//*[@id='password']/div[1]/div/div[1]/input")
		private WebElement password; 
	
		
		public void sendPassword( String password) {
			//this.password.click();
			this.password.sendKeys(password);
		}
		
		// Locate and Click on Next 
		@FindBy(xpath="//*[@id='passwordNext']/content/span")
		private WebElement nextpwd; 
	
		
		public void clickNextpwd() {
			this.nextpwd.click();
		}
		
		// Locate and Click on new Form
		
		@FindBy(xpath="//*[@id=':1d']/div[1]")
		private WebElement newForm; 
	
		
		public void clickNewForm() {
			this.newForm.click();
		}
		
		
		// Locate and Send title
		@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/content/div/div[1]/div[2]/textarea")
		
		
		private WebElement title; 
	
		
		public void sendTitle( String title) {
			this.title.sendKeys(Keys.CONTROL+"a");
			this.title.sendKeys(Keys.DELETE);
			this.title.clear();
			this.title.sendKeys(title);
		}
		
		// Locate and Send the Question via Excel
		@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/content/div/div/div[1]/div[2]/textarea")
		private WebElement desc; 
	
		
		public void senddesc( String desc) {
			this.desc.sendKeys(desc);
		}
		
		
		// Locate and Send the option1 via Excel Sheet
	
		
		@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/content/div/div/div[1]/input")
		private WebElement Options1; 
	
		
		public void sendOption1(String option1) throws InterruptedException {
			//this.title.sendKeys(Keys.CONTROL+"a");
			this.Options1.sendKeys(Keys.BACK_SPACE);
			this.Options1.clear();
			this.Options1.sendKeys(option1);
			Thread.sleep(1000);
		}
		
		// Locate and Send Options2 , 3 and 4 via Excel Sheet
		
		@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/input")
		private WebElement addOptions; 
	
		
		public void clickAddOptions(String option2, String option3, String option4) throws InterruptedException {
			
			this.addOptions.sendKeys(option2);
			Thread.sleep(1000);
			this.addOptions.sendKeys(option3);
			Thread.sleep(1000);
			this.addOptions.sendKeys(option4);
			Thread.sleep(1000);
		}
		
		// Locate and click on setting
		
		@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/div/div[4]/div/content/span")
		private WebElement setting; 
	
		
		public void clickSetting(){
			this.setting.click();
		}
		
	// Locate and click on quizzes
		
		@FindBy(xpath="//*[@id='wizViewportRootId']/div[7]/div/div[2]/content/div/div/div[1]/div[3]/content")
		private WebElement quiz; 
	
		
		public void clickquiz(){
			this.quiz.click();
		}
		
		// Locate and click on toogleQuiz
		
				@FindBy(xpath="/html/body/div[7]/div/div[2]/content/div/div/div[2]/content[3]/div/div/div[1]/label/div/div[1]")
				private WebElement toggleQuiz; 
			
				
				public void clicktoggleQuiz(){
					
					this.toggleQuiz.click();
				}
				
				// Locate and Click on later
				
				
				@FindBy(xpath="/html/body/div[7]/div/div[2]/content/div/div/div[2]/content[3]/div/div/div[2]/div[2]/div[2]/div/content/label[2]/div/div[1]/div[3]/div")
				private WebElement later; 
			
				
				public void clicklater(){
					
					this.later.click();
				}
				
// Locate and Click on checkbox1
				
				
				@FindBy(xpath="/html/body/div[7]/div/div[2]/content/div/div/div[2]/content[3]/div/div/div[2]/div[3]/div[2]/label[2]/div/div[1]/div[3]")
				private WebElement cb1; 
			
				
				public void clickcb1(){
					
					this.cb1.click();
				}
				
// Locate and Click on checkbox2
				
				
				@FindBy(xpath="/html/body/div[7]/div/div[2]/content/div/div/div[2]/content[3]/div/div/div[2]/div[3]/div[2]/label[3]/div/div[1]/div[3]")
				private WebElement cb2; 
			
				
				public void clickcb2(){
					
					this.cb2.click();
				}
		
// locate and click save
				

				
				
				@FindBy(xpath="//*[@id='wizViewportRootId']/div[7]/div/div[2]/div[3]/div[2]/content/span")
				private WebElement save; 
			
				
				public void clicksave(){
					
					this.save.click();
				}
				
// locate and click new question
				

				
				
				@FindBy(xpath="//*[@id='Tj9Y4e']/div[3]/div/div/div[1]/div")
				private WebElement newQuestion; 
			
				
				public void clickNewQuestion(){
					
					this.newQuestion.click();
				}
				
				
		
	}


