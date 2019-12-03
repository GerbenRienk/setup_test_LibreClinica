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

def importrule_url = GlobalVariable.lc_url + '/ImportRule'

WebUI.navigateToUrl(importrule_url)

WebUI.uploadFile(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input_Upload an XML file here_button_long'), 
    'D:\\OC\\Libre\\RuleFiles\\LCDiscrepancyNoteAction_20190604.xml')

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(importrule_url)

WebUI.uploadFile(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input_Upload an XML file here_button_long'), 
    'D:\\OC\\Libre\\RuleFiles\\LCEMailAction_20190604.xml')

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(importrule_url)

WebUI.uploadFile(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input_Upload an XML file here_button_long'), 
    'D:\\OC\\Libre\\RuleFiles\\LCEventAction_20190604.xml')

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(importrule_url)

WebUI.uploadFile(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input_Upload an XML file here_button_long'), 
    'D:\\OC\\Libre\\RuleFiles\\LCInsertAction_20190604.xml')

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(importrule_url)

WebUI.uploadFile(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input_Upload an XML file here_button_long'), 
    'D:\\OC\\Libre\\RuleFiles\\LCShowHideAction_20191203.xml')

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.click(findTestObject('Object Repository/UploadRules/Page_OpenClinica/input__button_long'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

