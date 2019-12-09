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

WebUI.click(findTestObject('Page_IMIcampaign/AddNewETLButton'))

WebUI.delay(10)

WebUI.setText(findTestObject('Page_IMIcampaign/DataStoreName'), findTestData('DataStoreInfo').getValue(1, 3))

WebUI.setText(findTestObject('Page_IMIcampaign/ETLSchedule'), 'Every 60 Minutes')

WebUI.setText(findTestObject('Page_IMIcampaign/DataStoreLocation'), findTestData('DataStoreInfo').getValue(2, 3))

WebUI.click(findTestObject('Page_IMIcampaign/BrowseSampleFileAccordion'))

WebUI.uploadFile(findTestObject('Page_IMIcampaign/UploadComputerFile'), findTestData('DataStoreInfo').getValue(3, 3))

WebUI.click(findTestObject('Page_IMIcampaign/SaveETL'))

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Page_IMIcampaign/DataIngestionButton'))

WebUI.click(findTestObject('Page_IMIcampaign/FeedETLButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_IMIcampaign/AddNewETLButton'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_IMIcampaign/DataStoreName'), findTestData('DataStoreInfo').getValue(1, 3))

WebUI.setText(findTestObject('Page_IMIcampaign/DataStoreLocation'), findTestData('DataStoreInfo').getValue(2, 3))

WebUI.click(findTestObject('Page_IMIcampaign/BrowseSampleFileAccordion'))

WebUI.uploadFile(findTestObject('Page_IMIcampaign/UploadComputerFile'), findTestData('DataStoreInfo').getValue(3, 3))

WebUI.click(findTestObject('Page_IMIcampaign/SaveETL'))

not_run: WebUI.delay(3)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_IMIcampaign/CancelETL'))

WebUI.closeBrowser()

