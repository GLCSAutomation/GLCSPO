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

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_PO'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select                              _28b39f'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__tableSkuName'), 'kite 01')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__quantity'), '10')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__price'), '010')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__price'), '010')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_Add to list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.doubleClick(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.rightClick(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_Test Solutions Ltd_fas fa-archive'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'object:56', true)

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Gatepass'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select ClientTest Solutions'), 
    '231', true)

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__Quantity (1)'), '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Transporter Name             _6abde4'), 
    'string:ANIRUDHMMM', true)

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__gatepassVehicleNumber'), 'fhjgkjhj')

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Vehicle TypeAcePickupTata 407_eedf82'), 
    'number:3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Vehicle ConditionGoodBad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__gatepassDriverName'), 'bnkj')

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select DockDefault DockDOCK 1DOCK 2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Unloading'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-share-square-o maven-ico_985acc'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Transaction Type             _f215e7'), 
    'number:1', true)

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__vendors_value'), 'sha')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_Shahidk'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__POList_value'), '258210000EQ')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_258210000EQ'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__LrNumber'), 'gkjhkj')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__InvoiceNumber'), 'fhjjh')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_Invoice Image'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_Close                                  _9a252d'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_No Image Selected'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Action_Box Count'), '1')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Action_Box Actual Weight'), '1')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Save'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_ANIRUDHMMM_maven-icon fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_Document Validation'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o maven-icon selfAssign'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    'object:5181', true)

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__POInvSGross0Price'), '100.00')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span__POInv8TG0DIC'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Close_1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_fhjjh_fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_QC'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o selfAssign'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_BOXMW00016994_fa fa-plus fa-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Bin_bin'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/a_Settings'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_Warehouse Setup'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_BINs'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Add Bin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/select_Select Bin type                     _6bb045'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__lengthinput'), '1')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__widthinput'), '1')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__heightinput'), '1')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input__totalBins'), '1')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Submit'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Bin_bin'), 'BINMW00016995')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/img_SKU_gl-icon-data-hover'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/td_Kite 01'))

WebUI.rightClick(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/td_Kite 01'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_Kite 01_main-bottom-border font input_c8bc84'), 
    '10')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_Box No.  BOXMW00016994                 _b7fe99'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Bin Full'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Exit'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_fhjjh_fas fa-check-square'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Finish QC'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_Inbound_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_GRN'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Finish'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_Inbound'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_Good_fa fa-share-square-o maven-icon selfAssign'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_Good_fas fa-eye'))

WebUI.doubleClick(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/td_BINMW00016995'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/i_Good_fas fa-play'))

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 'BINMW00016995')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 'BINMW00016995')

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Locations'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_KT                                     _9e6764'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/h5_L2'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/li_L1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/div_L1'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_R1_col-lg-2 col-md-2 col-sm-12 col-xs-12'))

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/span_KT-1-R1-A3'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 'KT-1-R1-A3')

WebUI.click(findTestObject('Object Repository/NF1/Page_Maven by Glaucus/button_Proceed'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _28b39f'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'kite 01')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '010')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '010')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.rightClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Test Solutions Ltd_fas fa-archive'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'object:56', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Gatepass'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select ClientTest Solutions'), 
    '231', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity (1)'), '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transporter Name             _6abde4'), 
    'string:ANIRUDHMMM', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__gatepassVehicleNumber'), 'fhjgkjhj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Vehicle TypeAcePickupTata 407_eedf82'), 
    'number:3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Vehicle ConditionGoodBad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__gatepassDriverName'), 'bnkj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select DockDefault DockDOCK 1DOCK 2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Unloading'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-share-square-o maven-ico_985acc'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transaction Type             _f215e7'), 
    'number:1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__vendors_value'), 'sha')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Shahidk'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POList_value'), '258210000EQ')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_258210000EQ'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__LrNumber'), 'gkjhkj')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__InvoiceNumber'), 'fhjjh')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Invoice Image'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Close                                  _9a252d'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_No Image Selected'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Count'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Actual Weight'), '1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_maven-icon fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Document Validation'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o maven-icon selfAssign'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    'object:5181', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POInvSGross0Price'), '100.00')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span__POInv8TG0DIC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_BOXMW00016994_fa fa-plus fa-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Warehouse Setup'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_BINs'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add Bin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Bin type                     _6bb045'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__lengthinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__widthinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__heightinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__totalBins'), '1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Submit'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'), 'BINMW00016995')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/img_SKU_gl-icon-data-hover'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/td_Kite 01'))

WebUI.rightClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_Kite 01'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Kite 01_main-bottom-border font input_c8bc84'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Box No.  BOXMW00016994                 _b7fe99'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Bin Full'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Exit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fas fa-check-square'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Inbound_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_GRN'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fa fa-share-square-o maven-icon selfAssign'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fas fa-eye'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_BINMW00016995'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fas fa-play'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 'BINMW00016995')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 'BINMW00016995')

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Locations'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_KT                                     _9e6764'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/h5_L2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/li_L1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_L1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_R1_col-lg-2 col-md-2 col-sm-12 col-xs-12'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_KT-1-R1-A3'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 'KT-1-R1-A3')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Proceed'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'shahid')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _07e9b9'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'kite 01')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '01000')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'sanitizer')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_sanitizer'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '01000')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Pick Up Date_md-datepicker-button md_42e8d2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_22'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Pick Up Date_md-datepicker-button md_42e8d2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_22'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _28b39f'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'kite 01')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '010')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '010')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.rightClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Test Solutions Ltd_fas fa-archive'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'object:56', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Gatepass'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select ClientTest Solutions'), 
    '231', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity (1)'), '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transporter Name             _6abde4'), 
    'string:ANIRUDHMMM', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__gatepassVehicleNumber'), 'fhjgkjhj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Vehicle TypeAcePickupTata 407_eedf82'), 
    'number:3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Vehicle ConditionGoodBad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__gatepassDriverName'), 'bnkj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select DockDefault DockDOCK 1DOCK 2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Unloading'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-share-square-o maven-ico_985acc'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transaction Type             _f215e7'), 
    'number:1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__vendors_value'), 'sha')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Shahidk'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POList_value'), '258210000EQ')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_258210000EQ'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__LrNumber'), 'gkjhkj')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__InvoiceNumber'), 'fhjjh')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Invoice Image'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Close                                  _9a252d'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_No Image Selected'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Count'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Actual Weight'), '1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_maven-icon fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Document Validation'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o maven-icon selfAssign'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    'object:5181', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POInvSGross0Price'), '100.00')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span__POInv8TG0DIC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_BOXMW00016994_fa fa-plus fa-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Warehouse Setup'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_BINs'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add Bin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Bin type                     _6bb045'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__lengthinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__widthinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__heightinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__totalBins'), '1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Submit'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'), 'BINMW00016995')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/img_SKU_gl-icon-data-hover'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/td_Kite 01'))

WebUI.rightClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_Kite 01'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Kite 01_main-bottom-border font input_c8bc84'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Box No.  BOXMW00016994                 _b7fe99'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Bin Full'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Exit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fas fa-check-square'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Inbound_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_GRN'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fa fa-share-square-o maven-icon selfAssign'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fas fa-eye'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_BINMW00016995'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fas fa-play'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 'BINMW00016995')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 'BINMW00016995')

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Locations'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_KT                                     _9e6764'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/h5_L2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/li_L1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_L1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_R1_col-lg-2 col-md-2 col-sm-12 col-xs-12'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_KT-1-R1-A3'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 'KT-1-R1-A3')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Proceed'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _28b39f'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'kite 01')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '010')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '010')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.rightClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_258210000EQ'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Test Solutions Ltd_fas fa-archive'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'object:56', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Gatepass'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select ClientTest Solutions'), 
    '231', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__quantity (1)'), '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transporter Name             _6abde4'), 
    'string:ANIRUDHMMM', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__gatepassVehicleNumber'), 'fhjgkjhj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Vehicle TypeAcePickupTata 407_eedf82'), 
    'number:3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Vehicle ConditionGoodBad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__gatepassDriverName'), 'bnkj')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select DockDefault DockDOCK 1DOCK 2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Unloading'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-share-square-o maven-ico_985acc'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_fa fa-play'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Transaction Type             _f215e7'), 
    'number:1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__vendors_value'), 'sha')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Shahidk'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POList_value'), '258210000EQ')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_258210000EQ'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__LrNumber'), 'gkjhkj')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__InvoiceNumber'), 'fhjjh')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Invoice Image'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Close                                  _9a252d'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_No Image Selected'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Count'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Action_Box Actual Weight'), '1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i__add-to-list-icon'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_ANIRUDHMMM_maven-icon fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Document Validation'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o maven-icon selfAssign'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Billing                      _93e34f'), 
    'object:5181', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button__md-datepicker-button md-icon-button_4f517b'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_26'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Autofill_md-container md-ink-ripple'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__POInvSGross0Price'), '100.00')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span__POInv8TG0DIC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Close_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-check-square-o'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fa fa-share-square-o selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_BOXMW00016994_fa fa-plus fa-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Grade                        _60fc72'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Warehouse Setup'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_BINs'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add Bin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select Bin type                     _6bb045'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__lengthinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__widthinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__heightinput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__totalBins'), '1')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Submit'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Bin_bin'), 'BINMW00016995')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/img_SKU_gl-icon-data-hover'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/td_Kite 01'))

WebUI.rightClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_Kite 01'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_SKU_SKU'), 'Kite 01')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Kite 01_main-bottom-border font input_c8bc84'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Box No.  BOXMW00016994                 _b7fe99'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Bin Full'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Exit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_fhjjh_fas fa-check-square'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish QC'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Inbound_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_GRN'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New_1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_PO_fa fa-share-square-o maven-icon selfAssign'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Inbound'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Putaway'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fa fa-share-square-o maven-icon selfAssign'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fas fa-eye'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Maven by Glaucus/td_BINMW00016995'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Good_fas fa-play'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_From Bin_putawayFromBinInput'), 'BINMW00016995')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Bin_putawayToBinInput'), 'BINMW00016995')

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Locations'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_KT                                     _9e6764'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/h5_L2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/li_L1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_L1'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_R1_col-lg-2 col-md-2 col-sm-12 col-xs-12'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_KT-1-R1-A3'))

WebUI.switchToWindowTitle('Maven by Glaucus')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_To Location_putawayToLocationInput'), 'KT-1-R1-A3')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Proceed'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'shahid')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_OMS'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/a_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Add PO'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_No'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _07e9b9'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _79269e'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'kite 01')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_Kite 01'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '01000')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__tableSkuName'), 'sanitizer')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/div_sanitizer'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__Quantity'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input__price'), '01000')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_Add to list'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Pick Up Date_md-datepicker-button md_42e8d2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_22'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _01ca08'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select                              _feaaf8'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Pick Up Date_md-datepicker-button md_42e8d2'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/span_22'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input_Cancel_POAddSubmit'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/form_Forgot password                       _f102d3'))

WebUI.setText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/i_Order Management System_fa fa-archive'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'object:56', true)

WebUI.click(findTestObject('Object Repository/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

