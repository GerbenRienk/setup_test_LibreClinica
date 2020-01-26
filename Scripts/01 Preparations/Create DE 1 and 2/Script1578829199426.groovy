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

WebUI.openBrowser('https://tds-edc.com')

WebUI.navigateToUrl(GlobalVariable.lc_url)

WebUI.setText(findTestObject('Object Repository/input_User Name_j_username'), GlobalVariable.tech_admin)

WebUI.setEncryptedText(findTestObject('input_Password_j_password'), GlobalVariable.tech_admin_pw)

WebUI.sendKeys(findTestObject('Object Repository/input_Password_j_password'), Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('https://tds-edc.com/lcw050/ListUserAccounts')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Create New User'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_userName'), GlobalVariable.de_1)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_First Name_firstName'), 'Data Entry')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Last Name_lastName'), 'One')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Email_email'), 'gerbenrienk@trialdatasolutions.com')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Institutional Affiliation_institution_116f0c'), 'LC')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _54e6e5'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-Data ManagerStudy DirectorDa_47481c'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_userbusiness administratortechnical _1e2dd4'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Send User Password via EmailShow User_3c8377'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input__submit'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Email_email_1'), 'lctest_dataentry_1@lc.org')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Send User Password via EmailShow User_3c8377'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input__submit'))

WebUI.closeBrowser()

