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

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_userName'), GlobalVariable.st_techadmin)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_First Name_firstName'), 'ST Test')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Last Name_lastName'), 'Technical Administrator')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Email_email'), 'gerbenrienk@trialdatasolutions.com')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Institutional Affiliation_institution_116f0c'), 'LC')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _54e6e5'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-Data ManagerStudy DirectorDa_47481c'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_userbusiness administratortechnical _1e2dd4'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Send User Password via EmailShow User_3c8377'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input__submit'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Email_email_1'), 'st_techadmin@lc.org')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Send User Password via EmailShow User_3c8377'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input__submit'))

