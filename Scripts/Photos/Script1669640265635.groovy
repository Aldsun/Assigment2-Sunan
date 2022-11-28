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

response = WS.sendRequest(findTestObject('Photos/Get- Photos'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].albumId', '1')

WS.verifyElementPropertyValue(response, '[0].id', '1')

WS.verifyElementPropertyValue(response, '[0].title', 'accusamus beatae ad facilis cum similique qui sunt')

WS.verifyElementPropertyValue(response, '[0].url', 'https://via.placeholder.com/600/92c952')

WS.verifyElementPropertyValue(response, '[0].thumbnailUrl', 'https://via.placeholder.com/150/92c952')

response = WS.sendRequest(findTestObject('Photos/Post - Photos', [('Url') : 'https://www.instagram.com/', ('Tittle') : 'Assigment'
            , ('Turl') : 'https://www.instagram.com/aldsunan_/']))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'id', '5001')

WS.verifyElementPropertyValue(response, 'title', 'Assigment')

WS.verifyElementPropertyValue(response, 'url', 'https://www.instagram.com/')

WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'https://www.instagram.com/aldsunan_/')

response = WS.sendRequest(findTestObject('Photos/Post - Photos2', [('Url') : 'https://www.instagram.com/', ('Tittle') : 'Assigment'
            , ('Turl') : 'https://www.instagram.com/aldsunan_/']))

WS.verifyResponseStatusCode(response, 201)

response = WS.sendRequest(findTestObject('Photos/Put - Photos', [('UserId') : '321', ('Tittle') : 'Yuk Bisa']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'userId', '321')

WS.verifyElementPropertyValue(response, 'tittle', 'Yuk Bisa')

WS.verifyElementPropertyValue(response, 'id', '1')

WS.sendRequest(findTestObject('Photos/Put - Photos2', [('UserId') : '321', ('Tittle') : 'Yuk Bisa']))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Photos/Patch - Photos', [('TUrl') : 'twitter.com', ('Tittle') : 'Zeus', ('Url') : 'youtube.com']))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'url', 'youtube.com')

WS.verifyElementPropertyValue(response, 'id', '1')

WS.verifyElementPropertyValue(response, 'title', 'Zeus')

WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'twitter.com')

WS.verifyElementPropertyValue(response, 'albumId', '1')

WS.sendRequest(findTestObject('Photos/Patch - Photos2', [('TUrl') : 'twitter.com', ('Tittle') : 'Zeus', ('Url') : 'youtube.com']))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Photos/Delete - Photos'))

WS.verifyResponseStatusCode(response, 200)

