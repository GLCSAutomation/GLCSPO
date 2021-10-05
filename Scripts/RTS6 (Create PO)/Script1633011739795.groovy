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

WebUI.navigateToUrl('http://testsku.gscmaven.in/#/login//')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'rahulm')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_No                                     _c818dc'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_No'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Ref. No_OrderNo'), '2SKUTest1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _a59290'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _8b4de0'), 
    '1', true)


WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'nike1')
WebUI.click(findTestObject('Page_Maven by Glaucus/div_SelectSKU'))
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Qty'))
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__quantity'), '10')
WebUI.sendKeys(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '1000')
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Add to list'))
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'nike2')
WebUI.click(findTestObject('Page_Maven by Glaucus/div_SelectSKU'))
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Qty'))
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__quantity'), '20')
WebUI.sendKeys(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '2000')
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Add to list'))
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))



WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _756207'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_7'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.closeBrowser()

