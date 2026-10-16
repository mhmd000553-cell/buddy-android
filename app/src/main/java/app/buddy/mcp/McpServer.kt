package app.buddy.mcp

import android.content.Context
import fi.iki.elonen.NanoHTTPD
import android.util.Log

class McpServer(port: Int, private val ctx: Context) : NanoHTTPD(port) {
    private val TAG = "McpServer"

    override fun serve(session: IHTTPSession?): Response {
        val uri = session?.uri ?: "/"
        Log.d(TAG, "Request: ${'$'}uri")
        if (uri.startsWith("/mcp")) {
            val payload = "{\"status\":\"ok\",\"message\":\"MCP stub active\"}"
            return newFixedLengthResponse(Response.Status.OK, "application/json", payload)
        }
        return newFixedLengthResponse(Response.Status.NOT_FOUND, "text/plain", "Not found")
    }
}
