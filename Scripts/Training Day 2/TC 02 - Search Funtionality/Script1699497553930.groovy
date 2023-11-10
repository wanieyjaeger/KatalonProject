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

WebUI.callTestCase(findTestCase('Training Day 2/TC 01 - Login Functionality'), [('username') : 'customer', ('password') : 'fcttOx1e+dws0mP0AWb2uMRTnZbRfS0W\r\n'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Katalon Shop/Katalon Shop 02/Page_My account  Katalon Shop/a_Shop'))

WebUI.setText(findTestObject('Object Repository/Katalon Shop/Katalon Shop 02/Page_Katalon Shop  Katalon Ecommerce/input_Search for_s'), 
    search)

WebUI.click(findTestObject('Object Repository/Katalon Shop/Katalon Shop 02/Page_Katalon Shop  Katalon Ecommerce/i_Search_ellie-icon-search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Shop/Katalon Shop 02/Page_Search Results for flying ninja  Katalon Shop/a_Flying Ninja'), 
    0)

