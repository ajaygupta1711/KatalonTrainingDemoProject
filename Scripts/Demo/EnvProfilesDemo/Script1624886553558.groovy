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

not_run: WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.verifyTextPresent('Welcome', false)

not_run: WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_User Management'))

not_run: WebUI.waitForAlert(3)

not_run: WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Users'))

not_run: WebUI.verifyTextPresent('Username', false)

not_run: WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_searchSystemUseruserName'), 'Admin')

not_run: WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Status__search'))

not_run: WebUI.waitForAlert(3)

WebUI.closeBrowser()

