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

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button_Next'))

WebUI.doubleClick(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginEmail'))

WebUI.setText(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur')

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.sendKeys(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginPassword'), Keys.chord(
        Keys.ENTER))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/div_WMS'))

WebUI.delay(6)

WebUI.selectOptionByLabel(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'Test Solutions Warehouse', true)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/a_Inbound'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/a_Document Validation'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/i_vfn4gb0nz0_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    'object:1507', true)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span_1'))

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.setText(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input__POInvSGross0Price'), '100,000.00')

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span__POInv8TG0DIC'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button_Next'))

WebUI.doubleClick(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginEmail'))

WebUI.setText(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur')

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.sendKeys(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input_Forgot password_loginPassword'), Keys.chord(
        Keys.ENTER))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/div_WMS'))

WebUI.delay(6)

WebUI.selectOptionByLabel(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'Test Solutions Warehouse', true)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/a_Inbound'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/a_Document Validation'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/i_vfn4gb0nz0_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    'object:1507', true)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span_1'))

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.setText(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/input__POInvSGross0Price'), '100,000.00')

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span__POInv8TG0DIC'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur')

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/span_PO'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select                              _07e9b9'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__tableSkuName'))

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__tableSkuName'), 'kite')

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__quantity'), '10')

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__price'), '01000')

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/span_Add to list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span_28'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

