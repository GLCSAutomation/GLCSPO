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

String chars = 'abcdefghijklmnopqrstuvwxyz0123456789'

int r = Integer.parseInt(SKUQty)

InvoiceNO = randomString(chars, 10)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.delay(5)

WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/input_Forgot password_loginEmail'), Username)

WebUI.delay(5)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/button_Next'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.delay(5)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/button_Log In'))

WebUI.delay(6)

WebUI.waitForElementClickable(findTestObject('PO_2_SKU/Page_Maven by Glaucus/div_OMS'), 2000)

WebUI.waitForElementPresent(findTestObject('PO_2_SKU/Page_Maven by Glaucus/div_OMS'), 5000)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/div_OMS'))

WebUI.delay(5)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/a_Purchases'))

WebUI.delay(5)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('PO_2_SKU/Page_Maven by Glaucus/a_PO'), 2000)

WebUI.delay(5)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/a_PO'))

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('PO_2_SKU/Page_Maven by Glaucus/select_Select                              _28b39f'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('PO_2_SKU/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/input__tableSkuName'), SKUName)

WebUI.delay(2)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/input__quantity'), SKUQty)

WebUI.delay(2)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/input__price'))

WebUI.delay(4)

WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/input__price'), '10000')

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/span_Add to list'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), SKUName2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_sanitizer'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity'), SKUQty)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('PO_2_SKU/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('PO_2_SKU/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span_28'))

PONO = WebUI.getText(findTestObject('ORInboundProcess/Page_Maven by Glaucus/td_258210000EX'))

not_run: WebUI.acceptAlert()

WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('Data-driven samples/DoInboundProcess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.doubleClick(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/button_Log In'))

WebUI.waitForElementPresent(findTestObject('ORGatePass/Page_Maven by Glaucus/div_WMS'), 45)

WebUI.waitForElementVisible(findTestObject('ORGatePass/Page_Maven by Glaucus/div_WMS'), 45)

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

WebUI.setText(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/input__gatepassVehicleNumber'), Vehicle_no)

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

not_run: WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('Data-driven samples/CreatePO'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Data-driven samples/CreateGatepass'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur')

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.delay(6)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.delay(6)

WebUI.click(findTestObject('ORGatePass/Page_Maven by Glaucus/div_WMS'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ORGatePass/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'Test Solutions Warehouse', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.delay(6)

WebUI.comment('FIrst time Unloading with New buton access')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Unloading'))

WebUI.setText(findTestObject('ORInboundProcess/Page_Maven by Glaucus/input_Unloading_search'), this.PONO)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Unloading_fa fa-search'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Unloading_search'), this.GatepassNO)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Unloading_fa fa-search_1'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_spce_fa fa-share-square-o maven-icon selfAssign'))

WebUI.comment('Unloading start from Inprocess')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_In Process'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Unloading_search'), 
    GatePassNo)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Unloading_fa fa-search_1'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_spce_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Transaction Type             _f215e7'), 
    'number:1', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__vendors_value'), VendorName)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('ORInboundProcess/Page_Maven by Glaucus/div_858000001'), 45)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_858000001'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__POList_value'))

WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__POList_value'), this.PONO)

WebUI.delay(6)

WebUI.waitForElementPresent(findTestObject('ORInboundProcess/Page_Maven by Glaucus/div_258210000ET'), 45)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_258210000ET'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__LrNumber'), 'hjkl')

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__InvoiceNumber'), this.InvoiceNO)

WebUI.uploadFile(findTestObject('ORInboundProcess/Page_Maven by Glaucus/Element_1630056240099'), 'C:\\Users\\shahi\\Downloads\\new.png')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_Transaction Type                       _cf55fb'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Action_Box Count'), '1')

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Action_Box Actual Weight'), 
    '1')

WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_Action_add-to-list-icon (1)'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_spce_maven-icon fa fa-check-square-o (1)'))

WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_Close (2)'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.comment('Validation start from New')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Document Validation'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), this.GatepassNO)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Validation_fa fa-search'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fa fa-share-square-o maven-icon selfAssign'))

WebUI.comment('Validation from Inprocess')

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_In Process (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    GatePassNo)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_nssd_fa fa-play'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    '29/05 Basantra line, Delhi Cantt., New Delhi - 110018', false)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/NewObj/Page_Maven by Glaucus/span_1'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

//def y = 1000
//Amount = (SKUQty*y)
//WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_26'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_sku0'), 'Kite 01')
//
//WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Kite 01'))
//
//WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku1qty'), '10')
WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku1price'), 45)

WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku1price'), '10,000.00')

//
//WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__sku1'), 'sanitizer')
//
//WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_sanitizer'))
//
//WebUI.waitForElementClickable(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku2qty'), 45)
//
//WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku2qty'), '10')
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku2price'), 45)

WebUI.setText(findTestObject('PO_2_SKU/Page_Maven by Glaucus/sku2price'), '50,000.00')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/td__POInv8TG0'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Save_1'))

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/button_Save Anyways'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Validation_btn btn-default search-btn'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fa fa-check-square-o'))

WebUI.delay(5)

WebUI.comment('QC begins')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_QC'))

WebUI.comment('New QC')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New_1'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_QC_search'), this.GatepassNO)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_QC_fa fa-search'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fa fa-share-square-o selfAssign'))

WebUI.comment('In process QC')

WebUI.delay(5)

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_In Process (2)'))

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_QC_search'), GatePassNo)

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_nssd_fas fa-play'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_BOXMW00016996_fa fa-plus fa-lg'))

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_Close (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Bin_bin'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Bin_bin'), EmptyBinForQC)

for (int i = 0; i < r; i++) {
    WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')
}

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Bin Full'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_BOXMW00016996_fa fa-plus fa-lg'))

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_Close (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Bin_bin'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Bin_bin'), EmptyBinForQC2)

for (int i = 0; i < r; i++) {
    WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'sanitizer')
}

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Bin Full'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Exit'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fas fa-check-square'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Finish QC'))

WebUI.comment('GRN begins')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_GRN'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_In Process                             _50eae9'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New_1'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    'Kite 01')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_GRN'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    '')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/td_GATEP0000001845_1'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), this.GatepassNO)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_GRN_btn btn-default search-btn ng-scope'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_Finish'), 45)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Finish'))

WebUI.comment('Putaway begins')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_In Process                             _b8d0af'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), this.GatepassNO)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Validation_btn btn-default search-btn'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Good_fa fa-share-square-o maven-icon selfAssign'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 
    EmptyBinForQC)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 
    Storage_bin)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 
    Storage_bin_location)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Proceed'))

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/putaway_binwise_SKU'))

for (int i = 0; i < r; i++) {
    WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')
}

WebUI.delay(5)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/Start_putaway_button'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 
    EmptyBinForQC2)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 
    Storage_bin)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 
    Storage_bin_location)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Proceed'))

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/putaway_binwise_SKU'))

for (int i = 0; i < r; i++) {
    WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'sanitizer')
}

WebUI.delay(2)

WebUI.click(findTestObject('PO_2_SKU/Page_Maven by Glaucus/Start_putaway_button') //WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 
    ) //   'KT-1-R2-A1')
//WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Proceed'))

static String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

