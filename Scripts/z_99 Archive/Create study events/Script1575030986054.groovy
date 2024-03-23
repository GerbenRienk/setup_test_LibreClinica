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

def event_url = GlobalVariable.lc_url + '/DefineStudyEvent'

WebUI.navigateToUrl(event_url)

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'NonRep_NoNull')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Non repeating event, with no null values ')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Combinations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'NonRep_Null')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Non repeating event, with null values ')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Combinations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Rep_NoNull')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Repeating event, with no null values ')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_YesNo_repeating'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Combinations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Rep_Null')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_YesNo_repeating'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Repeating event with null values ')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Combinations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/td_NA'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'DDE')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Double data entry')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Combinations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/td_NA'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Double Data Entry_doubleEntry0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Calc')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Calulations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Calculations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/td_NA'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Val')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Validations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Validations')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/td_NA'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Site')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Site specific CRF versions')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Site')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/td_NA'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Name_name'), 'Rules')

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/textarea_Description_description'), 'Rules and Actions')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.setText(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), 
    'Rules')

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_lctest_techadmin_selected0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/td_NA'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_NA_na0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_UNK_unk0'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Category_Submit'))

WebUI.click(findTestObject('Object Repository/CreateStudyEvents/Page_OpenClinica/input_Not Required_submit'))

