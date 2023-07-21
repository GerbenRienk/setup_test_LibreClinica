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

def add_event_url = GlobalVariable.lc_url + '/DefineStudyEvent'

def list_event_url = GlobalVariable.lc_url + '/ListEventDefinition'

WebUI.navigateToUrl(add_event_url)

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'ST01V1')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Smoketest visit 1')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Password_submit'))

WebUI.navigateToUrl(list_event_url)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Found 3 Definitions_ebl_filterKeyword'), 'ST01V1')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Found 3 Definitions_button_search'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_No_bt_Edit1'))

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/textarea_STV3def'), 'Smoketest visit 1 changed')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Password_submit'))

WebUI.navigateToUrl(add_event_url)

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'ST01V2')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Smoketest visit 2, to be deleted and restored')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Password_submit'))

WebUI.navigateToUrl(add_event_url)

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'ST01V3')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Smoketest visit 3, for double data entry')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Password_submit'))

WebUI.navigateToUrl(add_event_url)

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Rules')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'To test rules')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Password_submit'))

