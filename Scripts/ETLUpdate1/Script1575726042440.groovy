import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(findTestData('Login_Details').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_IMIcampaign/Username'), findTestData('Login_Details').getValue(2, 1))

WebUI.setText(findTestObject('Page_IMIcampaign/Password'), findTestData('Login_Details').getValue(3, 1))

WebUI.click(findTestObject('Page_IMIcampaign/Signin'))

WebUI.click(findTestObject('Page_IMIcampaign/DataManagementButton'))

WebUI.mouseOver(findTestObject('Page_IMIcampaign/DataIngestionButton'))

WebUI.click(findTestObject('Page_IMIcampaign/FeedETLButton'))

WebUI.setText(findTestObject('Page_IMIcampaign/SeachDataStoreTextbox'), findTestData('DataStoreInfo').getValue(1, 5))

WebUI.click(findTestObject('Page_IMIcampaign/SearchDataStoreButton'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIcampaign/ClickETLEdit'))

WebUI.click(findTestObject('Page_IMIcampaign/AddNewColumnButton'))

WebUI.setText(findTestObject('AddNewColumnPopup/Page_IMIcampaign/FileHeaderNameTextbox'), 'COST5')

WebUI.setText(findTestObject('AddNewColumnPopup/Page_IMIcampaign/TableColumnNameTextbox'), 'COST5')

WebUI.selectOptionByLabel(findTestObject('AddNewColumnPopup/Page_IMIcampaign/SelectDataType'), 'Decimal', false)

WebUI.click(findTestObject('AddNewColumnPopup/Page_IMIcampaign/AddNewColumnSaveProceedButton'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_IMIcampaign/UpdateETLButton'))

WebUI.closeBrowser()

