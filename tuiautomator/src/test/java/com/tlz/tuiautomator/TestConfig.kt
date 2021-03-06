package com.tlz.tuiautomator

/**
 * 测试全局配置.
 * By tomlezen.
 * Date: 2019-07-26.
 * Time: 16:37.
 */
object TestConfig {

//    const val ATX_AGENT_SERVER = "172.16.11.92"
//    const val ATX_AGENT_SERVER = "192.168.199.143"
    const val ATX_AGENT_SERVER = "192.168.199.164"

    val automator = TUiautomator(TUiautomatorConfig(atxAgentIp = ATX_AGENT_SERVER))
}

fun TUiautomatorResult<Boolean>.handleTestResult() {
    onSuccess {
        assert(it)
    }
    onFailure {
        it.printStackTrace()
        assert(false)
    }
}

fun TUiautomatorResult<Any?>.handleTestResult2() {
    onSuccess {
        println(it?.toString())
    }
    onFailure {
        it.printStackTrace()
        assert(false)
    }
}