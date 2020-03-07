package org.example

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.AfterClass
import org.junit.Assert
import org.junit.BeforeClass
import org.junit.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class SeleniumTest {
    companion object {
        private lateinit var webDriver: WebDriver
        private lateinit var pom: POM

        @BeforeClass
        @JvmStatic
        fun init() {
            WebDriverManager.chromedriver().setup()
            webDriver = ChromeDriver()
            pom = POM(webDriver)
        }

        @AfterClass
        @JvmStatic
        fun close() {
            webDriver.quit()
        }
    }

    @Test
    fun testKotlinList() {
        Assert.assertTrue(pom.isKotlinInitialized())
    }

    @Test
    fun testJavaList() {
        Assert.assertTrue(pom.isJavaInitialized())
    }
}
