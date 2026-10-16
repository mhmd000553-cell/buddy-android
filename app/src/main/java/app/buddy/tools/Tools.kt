package app.buddy.tools

import android.content.Context
import android.util.Log

object Tools {
    private const val TAG = "BuddyTools"

    fun readScreen(context: Context): String {
        Log.d(TAG, "readScreen() called (stub)")
        return "[screen text placeholder]"
    }

    fun tap(x: Int, y: Int) {
        Log.d(TAG, "tap(${'$'}x, ${'$'}y) (stub)")
    }

    fun typeText(text: String) {
        Log.d(TAG, "typeText: ${'$'}text (stub)")
    }

    fun scroll(direction: String) {
        Log.d(TAG, "scroll: ${'$'}direction (stub)")
    }

    fun screenshot(): ByteArray? {
        Log.d(TAG, "screenshot() (stub)")
        return null
    }
}
