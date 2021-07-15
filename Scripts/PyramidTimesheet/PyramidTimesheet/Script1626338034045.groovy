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

WebUI.navigateToUrl('https://pyramidcore.pyramidci.com/security/PCILoginNew.aspx')

WebUI.setText(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore-Login/input_User ID_pydLogintxtUserid'), 
    'ajay.gupta')

WebUI.setEncryptedText(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore-Login/input_Password_pydLogintxtUserPwd'), 
    'WKnduguxBWKoZ20trn7mfw==')

WebUI.click(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore-Login/input_Password_pydLoginbtnLogin'))

WebUI.click(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore-Login/a_Home'))

WebUI.click(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore Home Page/img'))

WebUI.click(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore Home Page/a_My Weekly TS'))

WebUI.click(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore Home Page/div_Thu'))

WebUI.verifyElementText(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore Home Page/div_Thu'), 'Thu')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore Home Page/select_0                                   _4165cd'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Pyramid Timesheet/Page_PyramidCore Home Page/button_Save'))

WebUI.closeBrowser()

