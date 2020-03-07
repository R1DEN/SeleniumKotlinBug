package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class POM(webDriver: WebDriver) {
    @FindBy(css = "kotlin")
    private lateinit var kotlinList: List<WebElement>

    @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
    @FindBy(css = "java")
    private lateinit var javaList: java.util.List<WebElement>
    fun isKotlinInitialized(): Boolean {
        return ::kotlinList.isInitialized
    }

    fun isJavaInitialized(): Boolean {
        return ::javaList.isInitialized
    }

    init {
        PageFactory.initElements(webDriver, this)
    }
}