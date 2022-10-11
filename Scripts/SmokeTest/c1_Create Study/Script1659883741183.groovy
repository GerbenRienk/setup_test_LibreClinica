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

def create_new_study_url = GlobalVariable.lc_url + '/CreateStudy'

WebUI.navigateToUrl(create_new_study_url)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Unique Protocol ID_uniqueProId'), 'ST' + GlobalVariable.st_suffix)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Brief Title_name'), 'LibreClinica Smoke Test Study ' + 
    GlobalVariable.st_suffix)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Official Title_officialTitle'), 'LC Official Title')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Secondary IDs_secondProId'), 'LC Secondary IDs')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Principal Investigator_prinInvestigator'), 'LC Principal Investigator')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Brief Summary_description'), 'LC Brief Summary')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Detailed Description_protocolDescription'), 'LC Detailed Description')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/div_Sponsor      Collaborators(separate by commas)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Sponsor_sponsor'), 'LC Sponsor')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Collaborators(separate by commas)__2b0c49'), 'LC Collaborators')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Select User _Save'))

