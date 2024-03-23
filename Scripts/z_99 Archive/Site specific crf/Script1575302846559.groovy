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

def site_url = GlobalVariable.lc_url + '/ListSite'

WebUI.navigateToUrl(site_url)

WebUI.setText(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'A')

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/img_available_bt_Edit1'))

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/a_Site'))

WebUI.selectOptionByValue(findTestObject('SiteSpecificCRF/Page_OpenClinica/default version for site A'), '8', true)

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Source Data Verification_Submit'))

def events_url = GlobalVariable.lc_url + '/ListEventDefinition'

WebUI.navigateToUrl(events_url)

WebUI.setText(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Site')

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/img_available_bt_Edit1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/select_Site B                              _48aa27_1'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Source Data Verification_Submit'))

WebUI.click(findTestObject('Object Repository/SiteSpecificCRF/Page_OpenClinica/input_Not Required_submit'))

