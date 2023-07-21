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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

def subject_matrix_url = GlobalVariable.lc_url + '/ListStudySubjects'

seq_nr = '007'

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Add New Subject'))

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Study Subject ID_label'), 'ST_ID' + seq_nr)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_Pers' + seq_nr)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Enrollment Date_enrollmentDate'), '01-Feb-2020')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LibreClinica/select_-Select-                            _ab37e3'), 
    'm', true)

WebUI.setText(findTestObject('Page_LibreClinica/input_Date of Birth_dob'), '01-Jan-1981')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_LibreClinica/select_-Select-                            _f3bf58'), 
    'ST01V1', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Location_addSubject'))

WebUI.verifyTextPresent('The Subject with unique identifier', false)

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Page_LibreClinica/subject_matrix_filter'))

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Actions_filter'), 'ST_ID' + seq_nr)

WebUI.sendKeys(findTestObject('Object Repository/Page_LibreClinica/input_Actions_filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_Schedule_bt_View1'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Study Subject Record'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Edit Record'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Enrollment Date_enrollmentDate'), '03-Feb-2020')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Enrollment Date_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Enrollment Date_Submit'))

WebUI.verifyTextPresent('The Study Subject has been updated', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Global Subject Record'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Edit Record_1'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_B_Pers' + seq_nr)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Enrollment Date_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Enrollment Date_Submit'))

WebUI.verifyTextPresent('The Subject has been updated', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Study Subject Record'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Global Subject Record'))

WebUI.verifyTextPresent('03-Feb-2020', false)

WebUI.verifyTextPresent('ST_B_Pers' + seq_nr, false)

