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

CustomKeywords.'com.nopcommerce.PublicKeyword.Menu'('Books')

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

CustomKeywords.'com.nopcommerce.PublicKeyword.SelectItem'(title_item)

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.setText(findTestObject('Page_nopCommerce demo store/input_Qty'), 
        total_item)


if (status_cart.equals('Add to cart')) {
    WebUI.click(findTestObject('Page_nopCommerce demo store/button_Add to cart'))
} else if (status_cart.equals('Add to wishlist')) {
    WebUI.click(findTestObject('Page_nopCommerce demo store/button_Add to wishlist'))
} else if (status_cart.equals('Add to compared')) {
    WebUI.click(findTestObject('Page_nopCommerce demo store/button_Add to compare list'))
} else {
    WebUI.click(findTestObject('Page_nopCommerce demo store/button_Email a friend'))

    WebUI.setText(findTestObject('Page_nopCommerce demo store. Email A Friend. Fahrenheit 451 by Ray Bradbury/input_concat(Friend, , s email)_FriendEmail'), 
        friend_email)

    WebUI.setText(findTestObject('Page_nopCommerce demo store. Email A Friend. Fahrenheit 451 by Ray Bradbury/input_Your email address_YourEmailAddress'), 
        your_email)

    WebUI.setText(findTestObject('Page_nopCommerce demo store. Email A Friend. Fahrenheit 451 by Ray Bradbury/textarea_Personal message_PersonalMessage'), 
        personal_message)

    WebUI.click(findTestObject('Page_nopCommerce demo store. Email A Friend. Fahrenheit 451 by Ray Bradbury/button_Send email'))
}

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store/a_shopping cart'))

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Shopping Cart/button_remove'))

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

Thread.sleep(2000)

