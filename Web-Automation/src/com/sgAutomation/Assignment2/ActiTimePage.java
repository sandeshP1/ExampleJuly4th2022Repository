package com.sgAutomation.Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage 
{
	public ActiTimePage(WebDriver  oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}

	//webElemnts for USername TextField
	private WebElement username;
	public WebElement getUsername() 
	{
		return username;
	}


	private WebElement pwd;
	public WebElement getpwd()
	{
		return pwd;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstNameInUser()
	{
		return userDataLightBox_firstNameField;

	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastNameinUser()
	{
		return userDataLightBox_lastNameField;
	}


	private WebElement userDataLightBox_emailField;
	public WebElement getemailFieldinUser()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusernameFieldinUsername()
	{
		return userDataLightBox_usernameField;
	}


	private WebElement userDataLightBox_passwordField;
	public WebElement getpswrdinUser()
	{
		return userDataLightBox_passwordField;
	}

	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getcopypswrdinUser()
	{
		return userDataLightBox_passwordCopyField;
	}
	private WebElement userDataLightBox_commitBtn;
	public WebElement getaddUserbtn()
	{
		return userDataLightBox_commitBtn;

	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteBtn()
	{
		return userDataLightBox_deleteBtn;

	}
	//iddddddcustomer Related
	private WebElement customerLightBox_nameField;
	public WebElement getcustmernametextField()
	{
		return customerLightBox_nameField;
	}
	private WebElement customerLightBox_descriptionField;
	public WebElement getCstmrdescriFie()
	{
		return customerLightBox_descriptionField;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getcreateProjectName()
	{
		return projectPopup_projectNameField;
	}

	private WebElement projectPopup_projectDescriptionField;
	public WebElement getprojectDesc()
	{
		return projectPopup_projectDescriptionField;

	}



	///////////////////////////////////////////////////////
	//modifyUser xpaths                 
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickonModifiedUsername;
	public WebElement getclickonModifiedUsername() 
	{
		return clickonModifiedUsername;
	}

	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement ClickforDeletingModifiedUSername;
	public WebElement getmodifiedUSerNAmeForDelting()
	{
		return ClickforDeletingModifiedUSername;
	}

	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement clickonmodifiedAddUsername;
	public WebElement getclickmodifiedSaveChanges()
	{
		return clickonmodifiedAddUsername;
	}

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement ologin;
	public WebElement getologin() 
	{
		return ologin;
	}
	@FindBy(linkText="Logout")
	private WebElement ologout;
	public WebElement getologout() 
	{
		return ologout;

	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement Usersclick;
	public WebElement getUsersclick() {
		return Usersclick;
	}

	@FindBy(xpath="//div[text()='Add User']")
	private WebElement AddUserClick;
	public WebElement getAddUserClick() {
		return AddUserClick;
	}
	//////////////////////
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement TasksClick;
	public WebElement getTasksClick()
	{
		return TasksClick;

	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
	private WebElement clickonAddnewinTasks;
	public WebElement getclickonAddnewinTasks()
	{
		return clickonAddnewinTasks;
	}
	//////////////////////////////customer
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement ClickOnNewCustomerBtn;
	public WebElement getClickOnNewCustomerBtn()
	{
		return ClickOnNewCustomerBtn;
	}

	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement clickOnCreateCustomer;
	public WebElement getclickOnCreateCustomer()
	{
		return clickOnCreateCustomer;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement customerremodified;
	public WebElement getcustomerremodified()
	{
		return customerremodified;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement customerremodifiedclose;
	public WebElement getcustomerremodifiedclose()
	{
		return customerremodifiedclose;
	}
	
	
	////////////////////////////////////
	@FindBy(xpath="/html/body/div[12]/div[2]")
	private WebElement clickonNewProject;
	public WebElement getclickonNewProject()
	{
		return clickonNewProject;
	}
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement clickonCretprjctbtn;
	public WebElement  getclickonCretprjctbtn()
	{
		return clickonCretprjctbtn;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")
	private WebElement clickOnAddnewTaskbtn;
	public WebElement getclickOnAddnewTaskbtn()
	{
		return clickOnAddnewTaskbtn;
	}
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement clickonCreateNewTasks;
	public WebElement getclickonCreateNewTasks()
	{
		return clickonCreateNewTasks;
	}

	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement clickonTAskdescription;
	public WebElement getclickonTAskdescription()
	{
		return clickonTAskdescription;
	}

	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement clickonCreteTAskbtn;
	public WebElement getclickonCreteTAskbtn()
	{
		return clickonCreteTAskbtn;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")
	private WebElement clickonSelecttaskbtntoDelete;
	public WebElement getSelecttaskcheckboxbtntoDelete()
	{
		return clickonSelecttaskbtntoDelete;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")
	private WebElement clickondeleteTaskbtn;
	public WebElement getclickondeleteTaskbtn()
	{
		return clickondeleteTaskbtn;
	}
	@FindBy(xpath="//*[@id=\'deleteTaskPopup_deleteConfirm_submitTitle\']")
	private WebElement clickondeletepermenabtn;
	public WebElement getclickondeletepermenabtn()
	{
		return clickondeletepermenabtn;
	}
	////////////////////DeleteProject/////
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projetcSetingicon;
	public WebElement getprojetcSetingicon()
	{
		return projetcSetingicon;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement ProjectSectimeCloicon;
	public WebElement getProjectSectimeCloicon()
	{
	 return ProjectSectimeCloicon;	
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement projectActionsclickbtn;
	public WebElement getprojectActionsclickbtn()
	{
		return projectActionsclickbtn;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement projectdeleteicon;
	public WebElement getprojectdeleteicon()
	{
		return projectdeleteicon;
	}
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement projectpermanentdeleteicon;
	public WebElement getprojectpermanentdeleteicon()
	{
		return projectpermanentdeleteicon;

	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyprojectDesc;
	public WebElement getmodifyprojectDesc()
	{
		return modifyprojectDesc;

	}
	
	/////////////////////////customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customersettingicon;
	public WebElement getcustomersettingicon()
	{
		return customersettingicon;

	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement customerActionicon;
	public WebElement getcustomerActionicon()
	{
		return  customerActionicon;

	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement customerDeletebtn;
	public WebElement getcustomerDeletebtn()
	{
		return customerDeletebtn;

	}
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement deleteCustomerpermanently;
	public WebElement getdeleteCustomerpermanently()
	{
		return deleteCustomerpermanently;

	}
	


}