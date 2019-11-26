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

def upload_crf_url = GlobalVariable.lc_url + '/CreateCRFVersion?module=admin'

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lccalc.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lccombinations.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lcrules.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lcvalidations.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\t008_rulemanagement.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\t014_dde.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.navigateToUrl(upload_crf_url)

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lcsite_common.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Page_OpenClinica/a_Tasks'))

WebUI.click(findTestObject('Page_OpenClinica/a_CRFs'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 'Site')

WebUI.sendKeys(findTestObject('Object Repository/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/img_available_bt_NewVersion1'))

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lcsite_site_a.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Page_OpenClinica/a_Tasks'))

WebUI.click(findTestObject('Page_OpenClinica/a_CRFs'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 'Site')

WebUI.sendKeys(findTestObject('Object Repository/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/img_available_bt_NewVersion1'))

WebUI.uploadFile(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_excel_file'), 'D:\\\\OC\\\\Libre\\\\SmokeTestCRFS\\\\lcsite_site_b.xls')

WebUI.click(findTestObject('Page_OpenClinica/input_MS Excel File To Upload_button_long'))

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

