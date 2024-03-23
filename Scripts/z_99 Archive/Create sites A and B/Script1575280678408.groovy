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

def substudy_url = GlobalVariable.lc_url + '/CreateSubStudy'

WebUI.navigateToUrl(substudy_url)

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Site Name_name'), 'Site A')

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Unique Protocol ID_uniqueProId'), 'LCTEST_A')

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Principal Investigator_prinInvestigator'), 
    'PI_A')

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Expected total enrollment_expectedTot_acb6fa'), 
    '100')

WebUI.click(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Source Data Verification_Submit'))

WebUI.click(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Source Data Verification_Submit'))

WebUI.navigateToUrl(substudy_url)

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Site Name_name'), 'Site B')

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Unique Protocol ID_uniqueProId'), 'LCTEST_B')

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Principal Investigator_prinInvestigator'), 
    'PI_B')

WebUI.setText(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Expected total enrollment_expectedTot_acb6fa'), 
    '100')

WebUI.click(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Source Data Verification_Submit'))

WebUI.click(findTestObject('Object Repository/AddSites/Page_OpenClinica/input_Source Data Verification_Submit'))

