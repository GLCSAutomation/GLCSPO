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

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'rahulm')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_WMSWarehouse Management System'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select WarehouseTest SKU Warehouse'), 'object:56', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Unloading'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Unloading_search'), 'GATEP0000001294')
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Unloading_fa fa-search'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_GATI_fa fa-share-square-o maven-icon selfAssign'))

Thread.sleep(1000)
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_InProcess'))
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Unloading_search'), 'GATEP0000001294')
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Unloading_fa fa-search_1'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_GATI_fa fa-play'))
  
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transaction Type'), 1, FailureHandling.STOP_ON_FAILURE)
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Select'))
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POList_value'), 'RegTest10')
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_selectPO'))
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_External Ref No_POInputField'), 'Ext_RegTest10')
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__LrNumber'), 'LR_RegTest10')
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__InvoiceNumber'), 'Inv_RegTest10')
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_EWB Number_ewbNumber'), 'Ewb_RegTest10')
  
CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Page_Maven by Glaucus/label_Add_InvoiceImage'), 'C:\\Users\\Rj\\Downloads\\New folder\\images.png')
  
Thread.sleep(2500)
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Count'), '1')
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Actual Weight'), '10')
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Action_add-to-list-icon'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Save'))
  
WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Unloading_search'), 'GATEP0000001294')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Unloading_fa fa-search_1'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_GATI_maven-icon fa fa-check-square-o'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Close'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))
  
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))
 
WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Document Validation'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Validation_search'), 'GATEP0000001294')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Validation_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_AssignValidation'))

Thread.sleep(2500)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Billing Address'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div__md-datepicker-expand-triangle ng-scope'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_28'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_RegTest7_fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_QC_search'), 'GATEP0000001294')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_QC_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Inv_RegTest7_fa fa-share-square-o selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_BOXOW00049886_fa fa-plus fa-lg'))

Thread.sleep(2500)

WebUI.selectOptionByIndex(findTestObject('Page_Maven by Glaucus/select_Select Grade'), 1)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'), 'BINOW00049912')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_SKU_SKU'), 'SKUALLCode')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_SKUALL_N_main-bottom-border font inpu_fe17e1'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Maven by Glaucus/input_SKUALL_N_main-bottom-border font inpu_fe17e1'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_QCBinFull'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_QCExit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Inv_RegTest7_fas fa-check-square'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_GRN'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Validation_search'), 'GATEP0000001294')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_GRN_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Validation_search'), 'GATEP0000001294')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Putaway_fas fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_RegTest7_fa fa-share-square-o maven-icon _859670_1'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 'BINOW00049912')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 'BINOW00049912')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 'DP-1-R2-A1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Proceed'))

