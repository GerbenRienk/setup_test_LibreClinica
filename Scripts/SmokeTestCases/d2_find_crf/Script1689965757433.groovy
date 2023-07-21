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

def upload_crf_url = GlobalVariable.lc_url + '/ListCRF?module=manage'

WebUI.navigateToUrl(upload_crf_url)

WebUI.setText(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/input_Page 1 of 1_ebl_filterKeyword'), 'CRF_1')

WebUI.click(findTestObject('ListCRFs/Page_LibreClinica/crf_list_find'))

WebUI.verifyTextPresent('CRF_1_ST', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('ListCRFs/Page_LibreClinica/a_Clear Search Keywords'))

WebUI.verifyTextPresent('CRF_2_ST', false)

WebUI.takeScreenshot()

