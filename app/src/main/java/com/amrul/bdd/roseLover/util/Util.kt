package com.amrul.bdd.roseLover.util

import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur
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
                    words[i].subSequence(1, words[i].length).toString()
                        .lowercase(Locale.getDefault())
                )
            }
        }
        return sb.toString()
    }

    fun blurBackground(activity: Activity, blurView: BlurView, context:Context) {
        val radius = 20f;

        val decorView: View = activity.window.decorView
        // ViewGroup you want to start blur from. Choose root as close to BlurView in hierarchy as possible.
        val rootView: ViewGroup = decorView.findViewById(android.R.id.content);

        // Optional:
        // Set drawable to draw in the beginning of each blurred frame.
        // Can be used in case your layout has a lot of transparent space and your content
        // gets a too low alpha value after blur is applied.
        val windowBackground: Drawable = decorView.background;

        blurView.setupWith(rootView, RenderScriptBlur(context)) // or RenderEffectBlur
            .setFrameClearDrawable(windowBackground) // Optional
            .setBlurRadius(radius)
    }
}