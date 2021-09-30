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
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager
import org.openqa.selenium.Keys as Keys
import com.katalon.cdp.CdpUtils as CdpUtils
import com.kms.katalon.core.util.internal.Base64 as Base64

WebUI.openBrowser('')

WebUI.navigateToUrl('http://testsol.gscmaven.in/#/login//')

WebUI.setText(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input_Forgot password_loginEmail'), 'ankur.poonia@glaucuslogistics.com')

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input_Forgot password_loginPassword'), 
    'yWWnjn0zM30cuEjD7ZsPhQ==')

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/button_Log In'))

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/span'))

WebUI.selectOptionByLabel(findTestObject('ORInboundProcess/Page_Maven by Glaucus/select_Select WarehouseTest Solutions Warehouse'), 
    'Test Solutions Warehouse', true)

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input__login-submit gl-form-action-submit'))

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/a_Settings'))

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/span_Warehouse Setup'))

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/button_BINs'))

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/button_Add Bin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/select_Select Bin type                     _6bb045'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input__lengthinput'), '1')

WebUI.setText(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input__widthinput'), '1')

WebUI.setText(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input__heightinput'), '1')

WebUI.setText(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/input__totalBins'), '1')

WebUI.click(findTestObject('Object Repository/OREmptyBin/Page_Maven by Glaucus/button_Submit'))

not_run: WS.getResponseStatusCode('')

not_run: WS.getElementText('', '')

not_run: WebUI.delay(1)

//ChromeDevToolsService cdts = CdpUtils.getService()
//Page page = cdts.getPage()
//Runtime runtime = Runtime.getRuntime()
//def map = [:]
//Network network = cdts.getNetwork()
//Log log = cdts.getLog()
//'ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()'
//EmptyqcBin = WS.getElementPropertyValue(this.response, 'tableStorageBinBarcode')
not_run: WS.verifyElementPropertyValue('', '', null)

not_run: BinNo = WebUI.getText(findTestObject('OREmptyBin/Page_Maven by Glaucus/BinNO'))

