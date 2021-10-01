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

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.doubleClick(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/div_WMS'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'Test Solutions Warehouse', true)

WebUI.click(findTestObject('ORGatePass/Page_Maven by Glaucus/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/a_Gatepass'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select ClientTest Solutions'), 
    '231', true)

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__Quantity'), '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select Transporter Name             _6abde4'), 
    'string:                     spce', true)

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__gatepassVehicleNumber'), '678687')

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select Vehicle TypeAcePickupTata 407_eedf82'), 
    'number:3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select Vehicle ConditionGoodBad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__gatepassDriverName'), 'mlk')

WebUI.selectOptionByValue(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select DockDefault DockDOCK 1DOCK 2'), 
    '1', true)

WebUI.click(findTestObject('ORGatePass/Page_Maven by Glaucus/Page_Maven by Glaucus/input__wms-btn primary'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_Gatepass List'))

GatepassNO = WebUI.getText(findTestObject('ORInboundProcess/Page_Maven by Glaucus/td_GATEP0000001853'))

WebUI.closeBrowser()

