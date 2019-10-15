package io.realworld.client

import feign.Headers
import feign.RequestLine

interface TagClient {
    @RequestLine("GET /api/tags")
    @Headers("Content-Type: application/json")
    fun tags(): OutTag
}

data class OutTag(var tags: List<String> = listOf())
