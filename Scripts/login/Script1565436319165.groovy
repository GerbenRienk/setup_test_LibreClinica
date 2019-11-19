import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
// import for constructing the dat-time to use a as variable in the script
import groovy.time.TimeCategory as TimeCategory

// def Today1String as String
use(groovy.time.TimeCategory, { 
        def Today1 = new Date()

        GlobalVariable.Today1String = Today1.format('yyyyMMddHHmm')
    })

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tds-edc.com/lcw020/pages/login/login')

WebUI.setText(findTestObject('Object Repository/input_User Name_j_username'), 'grvisser')

WebUI.sendKeys(findTestObject('Object Repository/input_Password_j_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/a_Subject Matrix'))

WebUI.click(findTestObject('Object Repository/a_Add New Subject'))

WebUI.setText(findTestObject('Object Repository/input_Study Subject ID_label'), GlobalVariable.Today1String)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_-Select-                                                                                                                                Male                                    Female'), 
    'f', true)

WebUI.setText(findTestObject('Object Repository/input_Location_location'), GlobalVariable.Today1String)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_-Select-                                                            NonRep_NoNull                                                                                            NonRep_Null'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/input_Location_addSubject'))

WebUI.verifyTextPresent(GlobalVariable.Today1String, false)

WebUI.closeBrowser()

