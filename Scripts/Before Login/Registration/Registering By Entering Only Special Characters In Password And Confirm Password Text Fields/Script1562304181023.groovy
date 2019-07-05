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

WebUI.click(findTestObject('Object Repository/Before Login/Login Page/Register Button'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject('Object Repository/Before Login/Registration Page/First Name Text Field'), FirstName)

WebUI.sendKeys(findTestObject('Object Repository/Before Login/Registration Page/Last Name Text Field'), LastName)

WebUI.sendKeys(findTestObject('Object Repository/Before Login/Registration Page/Company Name Text Field'), CompanyName)

WebUI.click(findTestObject('Object Repository/Before Login/Registration Page/Edition Dropdown Field'))

WebUI.click(findTestObject('Object Repository/Before Login/Registration Page/Multi Brand Edition Option'))

WebUI.sendKeys(findTestObject('Object Repository/Before Login/Registration Page/Email Address Text Field'), EmailAddress)

WebUI.sendKeys(findTestObject('Object Repository/Before Login/Registration Page/Password Text Field'), Password)

WebUI.sendKeys(findTestObject('Object Repository/Before Login/Registration Page/Confirm Password Text Field'), ConfirmPassword)

WebUI.click(findTestObject('Object Repository/Before Login/Registration Page/Submit Button'))

String Windowtitle = WebUI.getWindowTitle()

println Windowtitle