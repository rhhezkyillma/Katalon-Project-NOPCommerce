package com.nopcommerce

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class PublicKeyword {

	@Keyword
	public static void TakeScreenshot(String LocationFolder){
		Date today = new Date()
		String todaysDate = today.format('MM_dd_yy')
		String nowTime = today.format('hh_mm_ss')
		//		String fileName = 'Screenshot/'+LocationFolder+'/'+todaysDate+'-'+nowTime+'.png'
		WebUI.takeScreenshot('Screenshot/'+LocationFolder+'/'+todaysDate+'-'+nowTime+'.png')
		WebUI.takeScreenshot('E:\\KATALON DRIVE\\Katalon Project Qasir\\Project Qasir Web\\PROJECT QASIR\\Screenshot\\'+LocationFolder+'/'+todaysDate+'-'+nowTime+'.png',
				FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def Menu(String Menu) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement Menu_Outlet = driver.findElement(By.xpath("//a[contains(.,'"+Menu+"')]"))
		Menu_Outlet.click()
	}

	@Keyword
	def SelectItem(String ItemName) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement Menu_Item = driver.findElement(By.xpath("(//a[contains(.,'"+ItemName+"')])"))
		Menu_Item.click()
	}

	@Keyword
	def ShippingMethod(String ShippingMethod) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement ShipMethod = driver.findElement(By.xpath("//div[@class='estimate-shipping-row-item shipping-item'][contains(.,'2nd Day Air')]"))
		ShipMethod.click()
	}
}
