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

WebUI.click(findTestObject('Page_LibreClinica/a_Add New Subject'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Study Subject ID_label'), 'ST_ID004')

WebUI.setText(findTestObject('Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_Pers004')

WebUI.selectOptionByValue(findTestObject('Page_LibreClinica/select_-Select-                            _ab37e3'), 'f', true)

WebUI.setText(findTestObject('Page_LibreClinica/input_Date of Birth_dob'), '02-Feb-1982')

WebUI.selectOptionByLabel(findTestObject('Page_LibreClinica/select_-Select-                            _f3bf58'), 'ST01V1', 
    true)

WebUI.click(findTestObject('Page_LibreClinica/input_Location_addSubject'))

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Page_LibreClinica/subject_matrix_filter'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Actions_filter'), 'ST_ID004')

WebUI.sendKeys(findTestObject('Page_LibreClinica/input_Actions_filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_Schedule_bt_Reassign1'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Site A_studyId'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Site B_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Site B_Submit'))

WebUI.verifyTextPresent('has been reassigned', false)

WebUI.navigateToUrl(subject_matrix_url)

WebUI.click(findTestObject('Page_LibreClinica/subject_matrix_filter'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Actions_filter'), 'ST_ID004')

WebUI.sendKeys(findTestObject('Page_LibreClinica/input_Actions_filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_LibreClinica/div_Show More'))

WebUI.verifyTextPresent('ST01_A', false)

