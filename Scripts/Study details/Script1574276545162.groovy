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

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Studies'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Create a New Study'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Unique Protocol ID_uniqueProId'), 'LCTEST')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Brief Title_name'), 'LibreClinica Test Study')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Official Title_officialTitle'), 'LC Official Title')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Secondary IDs_secondProId'), 'LC Secondary IDs')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Principal Investigator_prinInvestigator'), 'LC Principal Investigator')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Brief Summary_description'), 'LC Brief Summary')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Detailed Description_protocolDescription'), 'LC Detailed Description')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/div_Sponsor      Collaborators(separate by commas)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Sponsor_sponsor'), 'LC Sponsor')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Collaborators(separate by commas)__2b0c49'), 'LC Collaborators')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Select User _Save'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Change StudySite'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Default Study (Data Manager)_studyId'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_LibreClinica Test Study (Data Manager_046002'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_LibreClinica Test Study (Data Manager_046002'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/img'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Protocol VerificationIRB Approval Dat_68d9db'), '01-Nov-2019')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Study Start Date_startDate'), '02-Nov-2019')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Study Completion Date_endDate'), '03-Nov-2019')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _31eb25'), 
    'randomized', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _78ca45'), 
    'double_blind', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _74f527'), 
    'placebo', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _0605f9'), 
    'parallel', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_-Select-                            _5c021a'), 
    'pharmacokinetics', true)

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/span_Conditions and Eligibility'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Conditions_conditions'), 'LC Conditions')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Keywords(separate by commas)_keywords'), 'LC Keywords')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/textarea_Eligibility Criteria_eligibility'), 'LC Eligibity Criteria')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Minimum Age_ageMin'), '0')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Maximum Age_ageMax'), '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_Yes          No'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Expected total enrollment_expectedTot_acb6fa'), '1000')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/span_Facility Information'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility Name_facName'), 'LC Facility Name')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility City_facCity'), 'LC Facility City')

'This field is limited to 20 characters'
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility StateProvince_facState'), 'LC Fac State')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Postal Code_facZip'), 'LC Postal Code')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility Country_facCountry'), 'LC Facility Country')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility Contact Name_facConName'), 'LC Facility Contact Name')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility Contact Degree_facConDegree'), 'LC Facility Contact Degree')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility Contact Phone_facConPhone'), 'LC Facility Contact Phone')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Facility Contact Email_facConEmail'), 'LC.Facility@lc.org')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/span_Related Information'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_MEDLINE Identifier_medlineIdentifier'), 'LC Medline Identifier')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenClinica/select_Yes          No_1'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_URL Reference_url'), 'LC Url Reference')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_URL Description_urlDescription'), 'LC Url Description')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/span_Study Parameter Configuration'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_RequiredOptionalNot Used_subjectPerso_cf04bc'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_YesNoNot Used_interviewerNameRequired'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_YesNoNot Used_interviewDateRequired'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_RequiredOptionalNot Used_eventLocatio_a6fb54'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_LibreClinica Test Study (Data Manager_046002'))

