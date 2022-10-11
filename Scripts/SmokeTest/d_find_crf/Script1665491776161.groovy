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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://tds-edc.com/lc120/pages/login/login')

WebUI.setText(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/input_User Name_j_username'), 'root')

WebUI.setEncryptedText(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/input_Password_j_password'), '8vIdntyLY2Kb7BZA4HG/8A==')

WebUI.sendKeys(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/input_Password_j_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/a_CRFs'))

WebUI.setText(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/input_Page 1 of 1_ebl_filterKeyword'), 'CRF_1')

WebUI.click(findTestObject('Object Repository/ListCRFs/Page_LibreClinica/crf_list_find'))

WebUI.closeBrowser()

