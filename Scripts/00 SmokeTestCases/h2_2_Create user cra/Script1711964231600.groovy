import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def create_new_user_url = GlobalVariable.lc_url + '/CreateUserAccount'

WebUI.navigateToUrl(create_new_user_url)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_User Name_userName'), ('st' + GlobalVariable.st_suffix) + 
    '_cra')

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_First Name_firstName'), 'ST')

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Last Name_lastName'), 'CRA')

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Email_email'), 'gerbenrienk@trialdatasolutions.com')

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Institutional Affiliation_institution_116f0c'), 
    'Smoketest')

WebUI.selectOptionByValue(findTestObject('CreateUserAccount/selectStudyForUser'), GlobalVariable.smoketest_study_id, false)

WebUI.selectOptionByValue(findTestObject('Page_LibreClinica/select_role'), '6', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Send User Password via EmailShow User_3c8377'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_LibreClinica Smoke Test Study 01 - Da_1ba508'))

WebUI.setText(findTestObject('EditUserAccount/UserMail'), 'st_cra@lc.org')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Show User Password to Admin_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_No_submit'))

