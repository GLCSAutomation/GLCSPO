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

not_run: WebUI.callTestCase(findTestCase('Data-driven samples/PO_2_SKU'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Data-driven samples/CreateGatepass'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 
    'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_WMS'))

WebUI.selectOptionByLabel(findTestObject('ORInboundProcess/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'Test Solutions Warehouse', true)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.comment('FIrst time Unloading with New buton access')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Unloading'))

WebUI.setText(findTestObject('ORInboundProcess/Page_Maven by Glaucus/input_Unloading_search'), this.PONO)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Unloading_fa fa-search'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Unloading_search'), this.GatepassNO)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Unloading_fa fa-search_1'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_spce_fa fa-share-square-o maven-icon selfAssign'))

WebUI.comment('Unloading start from Inprocess')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_In Process'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Unloading_search'), 
    GatePassNo)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Unloading_fa fa-search_1'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_spce_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Transaction Type             _f215e7'), 
    'number:1', true)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__vendors_value'), 'sha')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_858000001'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__POList_value'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__POList_value'), this.PONO)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_258210000ET'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__LrNumber'), 'hjkl')

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__InvoiceNumber'), '878jkhj')

WebUI.uploadFile(findTestObject('ORGatePass/Page_Maven by Glaucus/span_Add'), 'C:\\Users\\91750\\Desktop\\Glaucus Office Work\\Qty.png')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_Transaction Type                       _cf55fb'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Action_Box Count'), '1')

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Action_Box Actual Weight'), 
    '1')

WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_Action_add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Save'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.comment('Validation start from New')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Document Validation'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    GatePassNo)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Validation_fa fa-search'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fa fa-share-square-o maven-icon selfAssign'))

WebUI.comment('Validation from Inprocess')

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_In Process (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    GatePassNo)

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_nssd_fa fa-play'))

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    '29/05 Basantra line, Delhi Cantt., New Delhi - 110018', false)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_26'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input__POInvSGross0Price'), 
    '100.00')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/td__POInv8TG0'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Save_1'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Validation_btn btn-default search-btn'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fa fa-check-square-o'))

WebUI.comment('QC begins')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_QC'))

WebUI.comment('New QC')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New_1'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_QC_search'), GatePassNo)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_QC_fa fa-search'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fa fa-share-square-o selfAssign'))

WebUI.comment('In process QC')

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_In Process (2)'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_QC_search'), GatePassNo)

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/i_nssd_fas fa-play'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_BOXMW00016996_fa fa-plus fa-lg'))

not_run: WebUI.click(findTestObject('ORInboundProcess/Page_Maven by Glaucus/button_Close (1)'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Bin_bin'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Bin_bin'), 'BINMW00017022')

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Bin Full'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Exit'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_gkhkj_fas fa-check-square'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Finish QC'))

WebUI.comment('GRN begins')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_GRN'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_In Process                             _50eae9'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New_1'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    'Kite 01')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_GRN'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    '')

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/td_GATEP0000001845_1'))

not_run: WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), 
    GatePassNo)

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_GRN_btn btn-default search-btn ng-scope'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

not_run: WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Finish'))

WebUI.comment('Putaway begins')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/div_In Process                             _b8d0af'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_New'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_Validation_search'), GatePassNo)

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Validation_btn btn-default search-btn'))

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/i_Good_fa fa-share-square-o maven-icon selfAssign'))

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 
    EmptyBinForQC)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 
    EmptyBinForQC)

WebUI.setText(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 
    'KT-1-R1-B1')

WebUI.click(findTestObject('Object Repository/ORInboundProcess/Page_Maven by Glaucus/button_Proceed'))

