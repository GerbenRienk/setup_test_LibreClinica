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

WebUI.navigateToUrl(list_event_url)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Found 3 Definitions_ebl_filterKeyword'), 'ST01V2')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Found 3 Definitions_button_search'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_No_bt_Remove1'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Category_Submit'))

WebUI.acceptAlert()

WebUI.navigateToUrl(list_event_url)

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_Found 3 Definitions_ebl_filterKeyword'), 'ST01V2')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Found 3 Definitions_button_search'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_No_bt_Restore3'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Password_submit'))

WebUI.acceptAlert()

