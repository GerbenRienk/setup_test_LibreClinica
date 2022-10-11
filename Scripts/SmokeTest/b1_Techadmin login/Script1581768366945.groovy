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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

// def Today1String as String
use(groovy.time.TimeCategory, { 
        def Today1 = new Date()

        GlobalVariable.Today1String = Today1.format('yyyyMMddHHmm')
    })

def login_url = GlobalVariable.lc_url + '/pages/login/login'

def smoketest_user = GlobalVariable.st_techadmin + GlobalVariable.st_suffix

WebUI.openBrowser(login_url)

WebUI.setText(findTestObject('Object Repository/input_User Name_j_username'), GlobalVariable.tech_admin)

WebUI.setEncryptedText(findTestObject('input_Password_j_password'), GlobalVariable.tech_admin_pw)

WebUI.sendKeys(findTestObject('Object Repository/input_Password_j_password'), Keys.chord(Keys.ENTER))

