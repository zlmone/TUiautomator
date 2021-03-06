package com.tlz.tuiautomator

import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 * xxx.
 * By tomlezen.
 * Date: 2019-08-14.
 * Time: 15:36.
 */
class ApplicationTest {

    @Test
    fun testCurrentApp() {
        runBlocking {
            TestConfig.automator.application.currentApp().handleTestResult2()
        }
    }

    @Test
    fun testWaitActivity() {
        runBlocking {
            TestConfig.automator.application.waitActivity("com.tlz.tuiautomator.demo.MainActivity").handleTestResult2()
        }
    }

    @Test
    fun testStart() {
        runBlocking {
            TestConfig.automator.application.start("com.lxt.app.dev").handleTestResult2()
        }
    }

    @Test
    fun testStartWithMonkey() {
        runBlocking {
            TestConfig.automator.application.startWithMonkey("com.lxt.app.dev").handleTestResult2()
        }
    }

    @Test
    fun testStop() {
        runBlocking {
            TestConfig.automator.application.stop("com.lxt.app.dev").handleTestResult2()
        }
    }

    @Test
    fun testStopAll() {
        runBlocking {
            TestConfig.automator.application.stopAll().handleTestResult2()
        }
    }

    @Test
    fun testClear() {
        runBlocking {
            TestConfig.automator.application.clear("com.tlz.tuiautomator.demo").handleTestResult2()
        }
    }

    @Test
    fun testUninstall() {
        runBlocking {
            TestConfig.automator.application.uninstall("com.tlz.tuiautomator.demo").handleTestResult2()
        }
    }

    @Test
    fun testAppInfo() {
        runBlocking {
            TestConfig.automator.application.info("com.tlz.tuiautomator.demo").handleTestResult2()
        }
    }
}