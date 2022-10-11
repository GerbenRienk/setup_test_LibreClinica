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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def list_crfs_url = GlobalVariable.lc_url + '/ListCRF?module=manage'

WebUI.navigateToUrl(list_crfs_url)

WebUI.setText(findTestObject('Object Repository/ViewCRF/input_Page 1 of 1_ebl_filterKeyword'), 'CRF_1')

WebUI.click(findTestObject('Object Repository/ViewCRF/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/ViewCRF/img_available_bt_View1'))

WebUI.click(findTestObject('Object Repository/ViewCRF/img_available_bt_View1'))

WebUI.verifyTextPresent('CRF_1_ST01 v.1', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/ViewCRF/input_Not Applicable_exit'))

