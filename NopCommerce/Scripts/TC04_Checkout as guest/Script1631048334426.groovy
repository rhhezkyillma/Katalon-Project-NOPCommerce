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

WebUI.click(findTestObject('Page_nopCommerce demo store. Shopping Cart/input_189.00_termsofservice'))

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Shopping Cart/button_Checkout'))

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Login/button_Checkout as Guest'))

if (ship_to_bill.equals('YA')) {
    WebUI.check(findTestObject('Page_nopCommerce demo store. Checkout/check_ShipToSame'))

    WebUI.verifyElementChecked(findTestObject('Page_nopCommerce demo store. Checkout/check_ShipToSame'), 3)
} else {
    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/check_ShipToSame'))

    WebUI.verifyElementNotChecked(findTestObject('Page_nopCommerce demo store. Checkout/check_ShipToSame'), 5)
}

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_First name_BillingNewAddress.FirstName'), first_name_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Last name_BillingNewAddress.LastName'), last_name_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Email_BillingNewAddress.Email'), email_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Company_BillingNewAddress.Company'), company_bill)

WebUI.selectOptionByLabel(findTestObject('Page_nopCommerce demo store. Checkout/select_Select country'), country_bill, false)

WebUI.selectOptionByLabel(findTestObject('Page_nopCommerce demo store. Checkout/select_Select state'), province_bill, false)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_City_BillingNewAddress.City'), city_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Address 1_BillingNewAddress.Address1'), address1_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Address 2_BillingNewAddress.Address2'), address2_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Zip  postal code_BillingNewAddress.ZipPostalCode'), 
    postal_code_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
    phone_number_bill)

WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Fax number_BillingNewAddress.FaxNumber'), fax_number_bill)

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

if (ship_to_bill.equals('TIDAK')) {
    'Captured Screenshoot'
    CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue'))

    WebUI.waitForPageLoad(5)
	
	'Captured Screenshoot'
	CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')
	
	WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/btn_ContinueShipSave'))
	
}else {
	WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue'))
}


if (ship_method_bill.equals('Ground')) {
    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/input_Shipping method_shippingoption'))
} else if (ship_method_bill.equals('Ground')) {
    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/input_The one day air shipping_shippingoption'))
} else {
    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/input_Shipping by land transport_shippingoption'))
}

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_Shipping'))

if (payment_method_bill.equals('Check')) {
    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/input_Payment Check'))

    'Captured Screenshoot'
    CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_Payment'))
} else {
    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/input_Payment CC'))

    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_Payment'))

    'Captured Screenshoot'
    CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/select_VisaMaster cardDiscoverAmex'))

    WebUI.selectOptionByLabel(findTestObject('Page_nopCommerce demo store. Checkout/select_VisaMaster cardDiscoverAmex'), 
        select_cc_bill, false)

    WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Cardholder name_CardholderName'), cardholder_name_bill, 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Card number_CardNumber'), card_number_bill, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/select_Month'))

    WebUI.selectOptionByLabel(findTestObject('Page_nopCommerce demo store. Checkout/select_Month'), exp_month_bill, false)

    WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/select_year'))

    WebUI.selectOptionByLabel(findTestObject('Page_nopCommerce demo store. Checkout/select_year'), exp_year_bill, false)

    WebUI.setText(findTestObject('Page_nopCommerce demo store. Checkout/input_Card code_CardCode'), card_code_bill, FailureHandling.STOP_ON_FAILURE)
}

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_Payment_Save'))

'Captured Screenshoot'
CustomKeywords.'com.nopcommerce.PublicKeyword.TakeScreenshot'('Shopping Cart')

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Confirm'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/btn_Continue'))

Thread.sleep(2000)

