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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://85.214.197.142:8080/lcw071/pages/login/login')

WebUI.setText(findTestObject('Page_LibreClinica/input_User Name_j_username'), 'st_techadmin01')

WebUI.setEncryptedText(findTestObject('Page_LibreClinica/input_Password_j_password'), 'C1n+gVIkEM46+ew+Q7EB4w==')

WebUI.sendKeys(findTestObject('Page_LibreClinica/input_Password_j_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_LibreClinica/a_Tasks'))

WebUI.click(findTestObject('Page_LibreClinica/a_Subject Matrix'))

WebUI.click(findTestObject('Page_LibreClinica/a_Add New Subject'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Study Subject ID_label'), 'ST_ID002')

WebUI.setText(findTestObject('Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_Pers002')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Location_cancel'))

WebUI.click(findTestObject('Page_LibreClinica/a_Tasks'))

WebUI.click(findTestObject('Page_LibreClinica/a_Build Study'))

WebUI.click(findTestObject('Page_LibreClinica/img'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/span_Study Parameter Configuration'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_YesOnly Year of BirthNot Used_collectDob'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_RequiredOptionalNot Used_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Subject Matrix_1'))

WebUI.click(findTestObject('Page_LibreClinica/a_Add New Subject'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Study Subject ID_label'), 'ST_ID002')

WebUI.setText(findTestObject('Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_Pers002')

WebUI.selectOptionByValue(findTestObject('Page_LibreClinica/select_-Select-                            _ab37e3'), 'f', true)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Date of Birth_dob'), '01-Feb-1980')

WebUI.selectOptionByValue(findTestObject('Page_LibreClinica/select_-Select-                            _f3bf58'), '1', true)

WebUI.click(findTestObject('Page_LibreClinica/input_Location_addSubject'))

