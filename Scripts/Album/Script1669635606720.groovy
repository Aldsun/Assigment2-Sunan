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

response = WS.sendRequest(findTestObject('Album/Get- Album'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].userId', '1')

WS.verifyElementPropertyValue(response, '[0].id', '1')

WS.verifyElementPropertyValue(response, '[0].title', 'quidem molestiae enim')

response = WS.sendRequest(findTestObject('Album/Post - Album', [('UserId') : '123', ('Tittle') : 'Assigment', ('Body') : 'Sunan']))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'userId', '123')

WS.verifyElementPropertyValue(response, 'id', '101')

WS.verifyElementPropertyValue(response, 'title', 'Assigment')

WS.verifyElementPropertyValue(response, 'body', 'Sunan')

response = WS.sendRequest(findTestObject('Album/Post - Album 2', [('UserId') : '123', ('Tittle') : 'Assigment', ('Body') : 'Sunan']))

WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Album/Put - Album', [('UserId') : '321', ('Tittle') : 'Yuk Bisa']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'userId', '321')

WS.verifyElementPropertyValue(response, 'tittle', 'Yuk Bisa')

WS.verifyElementPropertyValue(response, 'id', '1')

response = WS.sendRequest(findTestObject('Album/Patch - Album', [('UserId') : '777', ('Tittle') : 'Zeus']))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'userId', '777')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'title', 'Zeus')

response = WS.sendRequest(findTestObject('Album/Delete - Album'))
WS.verifyResponseStatusCode(response, 200)

