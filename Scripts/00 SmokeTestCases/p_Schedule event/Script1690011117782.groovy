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

WebUI.setText(findTestObject('Page_LibreClinica/input_Study Subject ID_label'), 'ST_ID003')

WebUI.setText(findTestObject('Page_LibreClinica/input_Person ID_uniqueIdentifier'), 'ST_Pers003')

WebUI.selectOptionByValue(findTestObject('Page_LibreClinica/select_-Select-                            _ab37e3'), 'f', true)

WebUI.setText(findTestObject('Page_LibreClinica/input_Date of Birth_dob'), '02-Feb-1980')

WebUI.selectOptionByLabel(findTestObject('Page_LibreClinica/select_-Select-                            _f3bf58'), 'ST01V1', 
    true)

WebUI.click(findTestObject('Page_LibreClinica/input_Location_addSubject'))

WebUI.click(findTestObject('Page_LibreClinica/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/a_Schedule Event'))

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Study Subject ID_studySubjectLabel'), 'ST_ID003')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LibreClinica/select_-Select-ST01V1 (Non-repeating)ST01V2_128886'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Leave this field blank if the end dat_70d45c'))

WebUI.verifyTextPresent('The study event with definition', false)

WebUI.verifyTextPresent('scheduled', false)

