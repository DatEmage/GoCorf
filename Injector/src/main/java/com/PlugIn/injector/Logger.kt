/*
 * This file is distirbuted by PlugIn
 * Copyright (c) 2023 SYS
 * Licensed under the GPL-3.0 license
 */

package com.plugin.injector

import com.discord.app.AppLog

object Logger {
    private const val TAG = "[$LOG_TAG] "

    fun d(msg: String) = AppLog.g.d(TAG + msg, null)
    fun w(msg: String) = AppLog.g.w(TAG + msg, null)
    fun e(msg: String, e: Throwable?) = AppLog.g.e(TAG + msg, e, null)
}
