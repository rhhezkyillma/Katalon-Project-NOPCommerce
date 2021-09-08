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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.nopcommerce.com/')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_nopCommerce demo store. Shopping Cart/a_Log in'))

WebUI.setText(findTestObject('Page_nopCommerce demo store. Login/input_Email_Email'), email_login)

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Login/input_Password_Password'), password_login)

WebUI.click(findTestObject('Page_nopCommerce demo store. Login/input_Password_RememberMe'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Login/button_Log in'))

CustomKeywords.'com.nopcommerce.PublicKeyword.Menu'('Books')

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

CustomKeywords.'com.nopcommerce.PublicKeyword.SelectItem'(title_item)

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.setText(findTestObject('Page_nopCommerce demo store/input_Qty'), total_item)

WebUI.click(findTestObject('Page_nopCommerce demo store. Fahrenheit 451 by Ray Bradbury/a_Add your review'))

WebUI.setText(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/input_Review title_AddProductReview.Title'), 
    review_title)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/textarea_Review text_AddProductReview.ReviewText'), 
    review_text)

switch (rating) {
    case '1':
        WebUI.check(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/review1'))

        break
    case '2':
        WebUI.check(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/review2'))

        break
    case '3':
        WebUI.check(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/review3'))

        break
    case '4':
        WebUI.check(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/review4'))

        break
    case '5':
        WebUI.check(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/review5'))

        break
}

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Product Reviews. Fahrenheit 451 by Ray Bradbury/button_Submit review'))

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

Thread.sleep(2000)

