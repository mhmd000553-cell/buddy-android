package app.buddy.assistant

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.util.Log
import android.content.Intent
import kotlinx.coroutines.*

class BuddyAccessibilityService : AccessibilityService() {
    private val TAG = "BuddyAccessibilityService"
    private var mcpServer: app.buddy.mcp.McpServer? = null

    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.i(TAG, "Accessibility service connected")
        // Start local MCP server
        mcpServer = app.buddy.mcp.McpServer(8765, applicationContext)
        mcpServer?.start()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // For MVP: just log events; real logic will parse screen and act via Tools
        event?.let {
            Log.d(TAG, "Event: ${'$'}{it.eventType} from ${'$'}{it.packageName}")
        }
    }

    override fun onInterrupt() {
        Log.w(TAG, "Accessibility service interrupted")
    }

    override fun onDestroy() {
        super.onDestroy()
        mcpServer?.stop()
        Log.i(TAG, "Service destroyed and MCP server stopped")
    }
}
