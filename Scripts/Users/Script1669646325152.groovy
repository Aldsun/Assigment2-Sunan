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

response = WS.sendRequest(findTestObject('Users/Get- Users'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].name', 'Leanne Graham')
WS.verifyElementPropertyValue(response, '[0].username', 'Bret')
WS.verifyElementPropertyValue(response, '[0].email', 'Sincere@april.biz')

response = WS.sendRequest(findTestObject('Users/Post - Users', [('N') : 'Aldo Sunan', ('UN') : 'Sunan', ('M') : 'nans@mailsac.com']))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'id', '11')
WS.verifyElementPropertyValue(response, 'name', 'Aldo Sunan')
WS.verifyElementPropertyValue(response, 'username', 'Sunan')
WS.verifyElementPropertyValue(response, 'email', 'nans@mailsac.com')

response = WS.sendRequest(findTestObject('Users/Put - Users', [('UserId') : '321', ('Tittle') : 'Yuk Bisa']))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'userId', '321')
WS.verifyElementPropertyValue(response, 'tittle', 'Yuk Bisa')
WS.verifyElementPropertyValue(response, 'id', '1')

response = WS.sendRequest(findTestObject('Users/Patch - Users', [('N') : 'Aldo Sunan', ('UN') : 'Sunan', ('M') : 'nans@mailsac.com']))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'name', 'Aldo Sunan')
WS.verifyElementPropertyValue(response, 'username', 'Sunan')
WS.verifyElementPropertyValue(response, 'email', 'nans@mailsac.com')

response = WS.sendRequest(findTestObject('Users/Delete - Users'))
WS.verifyResponseStatusCode(response, 200)

