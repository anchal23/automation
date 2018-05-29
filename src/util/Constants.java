package util;

public class Constants {

	public static final String URL="http://54.213.233.2/nurses-online-frontend-super-admin";
	public static final String userName="//*[@ng-model='account.email']";
	public static final String Password="//*[@ng-model='account.password']";
	
	public static final String Login="//*[@ng-click='loginAdmin2()']";
	public static final String RegNurse="//*[@ng-click='goToNurses()']";
	public static final String Image="//*[@src='app/img/image-placeholder.svg']";
	public static final String Fname= "//*[@ng-model='firstStep.fname']";
	public static final String Lname="//*[@ng-model='firstStep.surname']";
	public static final String CallName="//*[@ng-model='firstStep.callingname']";
	public static final String Mobile="//*[@ng-model='firstStep.mobileno']";
	public static final String Rpassword="//*[@ng-model='firstStep.password']";
	public static final String Rcpassword="//*[@ng-model='firstStep.confirmpass']";
	public static final String Next="(//button[normalize-space(text())='Next'])[1]";
	
	public static final String Passport="//*[@ng-model='secondStep.passPort']";
	public static final String Image2="//*[@src='app/img/image-placeholder.svg']";
	public static final String Address="//*[@ng-model='data.streetAddress']";
	public static final String City="//*[@ng-model='secondStep.address.city']";
	public static final String StreetAdd="//*[@ng-model='secondStep.address.streetAddress']";
	public static final String Postal="//*[@ng-model='secondStep.address.postCode']";
	public static final String DOB="//*[@ng-model='secondStep.dateOfBirth']";
	public static final String Month="//*[@class=\"datepicker dropdown-menu\"][contains(@style,'blocka fin')]/div/table/thead/tr/th/following-sibling::th[contains(text(),'May')]";
	public static final String Year="//*[@class=\"datepicker dropdown-menu\"][contains(@style,'block')]/div/table/thead/tr/th/following-sibling::th[normalize-space(text())='2018']";
	public static final String selectYear="//*[@class=\"datepicker dropdown-menu\"][contains(@style,'block')]/div[3]/table/tbody/tr//span[.='2012']";
	public static final String selectMonth="//*[@class=\"datepicker dropdown-menu\"][contains(@style,'block')]/div[2]/table/tbody/tr//span[.='Feb']";
	public static final String selectDay="//*[@class=\"datepicker dropdown-menu\"][contains(@style,'block')]/div/table/tbody//td[.='12']";
	public static final String Closest="//*[@ng-model='secondStep.closestCity ']";
	public static final String Email="//*[@ng-model='secondStep.emailId']";
	public static final String Emergency="//*[@ng-model='secondStep.emergencyContact']";
	public static final String Next2="(//button[normalize-space(text())='Next'])[2]";
	
	public static final String IncomeTax="//*[@ng-model='nurseDocs.incomeTaxNumber']";
	public static final String RegTax="//input[@ng-model='nurseDocs.incomeTaxSatus']";
	public static final String SancRecipt="//*[@id='sancNumber']";
	public static final String ReciptNo="//*[@src='app/img/image-placeholder.svg']";
	public static final String Sancyear="//*[@ng-model='nurseDocs.sancYear']";
	public static final String Sancno="//*[@ng-model='nurseDocs.sancNumber']";
	public static final String Nursty="//*[@ng-model='nurseDocs.nurseType']";
	//public static final String Transport="//input[@ng-model='nurseDocs.transport']";
	public static final String RegWithOther ="//input[@ng-model='nurseDocs.registeredWithOtherAgency']";
	public static final String Back1="(//button[normalize-space(text())='Back'])[1]";
	public static final String Next3="(//button[normalize-space(text())='Next'])[3]";
	
	public static final String EmpName="//*[@ng-model='steps.nameOfEmployer']";
	public static final String Position="//*[@ng-model='steps.position']";
	public static final String Work="//*[@ng-model='steps.wardsWorked']";
	public static final String Duration="//*[@ng-model='steps.durationOfEmployement']";
	public static final String Instituion="//*[@ng-model='steps.referenceInstitute']";
	public static final String Nursing="//*[@src='app/img/image-placeholder.svg']";
	public static final String Proof="//*[@src='app/img/image-placeholder.svg']";
	public static final String Telno="//*[@ng-model='steps.referenceTelephoneNumber']";
	public static final String ContactPerson="//*[@ng-model='steps.referenceContactPerson']";
	public static final String Employed="//*[@id=\"formHospitalReg_5\"]/div";
	public static final String Back2="(//button[normalize-space(text())='Back'])[2]";
	public static final String Next4="(//button[normalize-space(text())='Next'])[4]";
	
	public static final String hepatitis="//*[@id=\"formHospitalReg_7\"]/div[1]/div/div/div[2]/input[1]";
	public static final String hepatitisNo="//*[@id=\"formHospitalReg_7\"]/div[1]/div/div/div[2]/input[2]";
	public static final String errorMsg="//div[normalize-space(text())='Uploading Hepatities Document Is Mandatory']";
	public static final String crimRecordNo="/*[@name='criminal1'][@value='FALSE']";
	public static final String Back3="(//button[normalize-space(text())='Back'])[3]";
	public static final String Next5="(//button[normalize-space(text())='Next'])[5]";
	
	public static final String AccholderName="(//*[@ng-model='laststep.accountHoldrName'])";
	public static final String BankName="(//*[@ng-model='laststep.branchName'])";
	public static final String BranchName="(//*[@ng-model='laststep.bankName'])";
	public static final String Branchcode="(//*[@ng-model='laststep.branchCode'])";
	public static final String AccountType="(//*[@ng-model='laststep.accountType'])";
	public static final String AccNo="(//*[@ng-model='laststep.accountNumber'])";
	public static final String Back4="(//button[normalize-space(text())='Back'])[4]";
	public static final String Submit="//*[@id=\"formHospitalReg_6\"]/div[3]/div/input";
	
}