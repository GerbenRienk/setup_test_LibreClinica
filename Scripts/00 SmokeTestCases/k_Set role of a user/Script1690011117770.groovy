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

WebUI.navigateToUrl(GlobalVariable.lc_url + '/ListUserAccounts')

WebUI.setText(findTestObject('Page_LibreClinica/input_Page 1 of 1_ebl_filterKeyword'), ('st' + GlobalVariable.st_suffix) + 
    '_crc1')

WebUI.click(findTestObject('Page_LibreClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_available_bt_SetRole1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LibreClinica/select_Data Manager                        _37a806'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_Study User Role_Submit'))

WebUI.verifyTextPresent('has been granted the Role', false)

