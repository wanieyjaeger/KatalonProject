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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Katalon Shop  Katalon Ecommerce/img_Sale_attachment-woocommerce_thumbnail s_432ea2'))

WebUI.click(findTestObject('Object Repository/Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Flying Ninja  Katalon Shop/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Flying Ninja  Katalon Shop/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    'angry')

WebUI.setText(findTestObject('Object Repository/Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    'jaeger')

WebUI.click(findTestObject('Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Checkout  Katalon Shop/country_dropdown'))

WebUI.setText(findTestObject('Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Checkout  Katalon Shop/country_dropdown_search'), 
    country)

WebUI.click(findTestObject('Katalon Shop/Katalon Shop 04/Kat Shop new/Page_Checkout  Katalon Shop/country_dropdown_choose', 
        [('country') : 'country']))

