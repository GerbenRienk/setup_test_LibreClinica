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

def subject_matrix_url = GlobalVariable.lc_url + '/ListStudySubjects'

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Add New Subject'))

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Study Subject ID_label'), 'ST_ID001')

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_Pers001')

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Enrollment Date_enrollmentDate'), '01-Feb-2020')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LibreClinica/select_-Select-                            _ab37e3'), 
    'm', true)

WebUI.setText(findTestObject('Page_LibreClinica/input_Date of Birth_dob'), '01-Jan-1981')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_LibreClinica/select_-Select-                            _f3bf58'), 
    'ST01V1', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Location_addSubject'))

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Page_LibreClinica/subject_matrix_filter'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Actions_filter'), 'ST_ID001')

WebUI.sendKeys(findTestObject('Page_LibreClinica/input_Actions_filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_Schedule_bt_Remove1'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_available_submit'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('has been removed', false)

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Page_LibreClinica/subject_matrix_filter'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Actions_filter'), 'ST_ID001')

WebUI.sendKeys(findTestObject('Page_LibreClinica/input_Actions_filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_ViewEnter Data_bt_Restore1'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_available_submit'))

WebUI.acceptAlert()

WebUI.verifyTextPresent('has been restored', false)

