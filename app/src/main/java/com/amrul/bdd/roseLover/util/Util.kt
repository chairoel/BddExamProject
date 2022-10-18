package com.amrul.bdd.roseLover.util

import java.util.*

object Util {
    fun toCamelCase(text: String): String {
        val words = text.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val sb = StringBuilder()
        if (words[0].isNotEmpty()) {
            sb.append(words[0][0].uppercaseChar()).append(
                words[0].subSequence(1, words[0].length).toString().lowercase(Locale.getDefault())
            )

            for (i in 1 until words.size) {
                sb.append(" ")
                sb.append(words[i][0].uppercaseChar()).append(
                    words[i].subSequence(1, words[i].length).toString().lowercase(Locale.getDefault())
                )
            }
        }
        return sb.toString()
    }
}