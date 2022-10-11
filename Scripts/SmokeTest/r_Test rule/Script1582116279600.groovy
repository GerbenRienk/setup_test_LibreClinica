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

def manage_rules_url = GlobalVariable.lc_url + '/ViewRuleAssignment'

WebUI.navigateToUrl(manage_rules_url)

WebUI.click(findTestObject('Page_LibreClinica/div_Actions_dynFilter'))

WebUI.setText(findTestObject('Page_LibreClinica/input_Actions_filter'), 'single')

WebUI.sendKeys(findTestObject('Page_LibreClinica/input_Actions_filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/img_InitialDataEntry DoubleDataEntry Admini_1aacdb'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_concat(  Discrepancy message I_ST01___503616'))

WebUI.verifyTextPresent('The rule is valid for the given target.', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_concat(  Discrepancy message I_ST01___503616'))

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/tr_Rule Validation                    Valid'))

WebUI.verifyTextPresent('The actions below will be executed', false)

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/tr_spliceAndReturn(I_ST01__DISCR_EQ_SINGLE)_5dd6da'))

WebUI.setText(findTestObject('Object Repository/Page_LibreClinica/input_I_ST01__DISCR_EQ_SINGLE_I_ST01__DISCR_e3acf5'), 
    '2')

WebUI.click(findTestObject('Object Repository/Page_LibreClinica/input_concat(  Discrepancy message I_ST01___503616'))

WebUI.verifyTextPresent('No actions will be executed', false)

