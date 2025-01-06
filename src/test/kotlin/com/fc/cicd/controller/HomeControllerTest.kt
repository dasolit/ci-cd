package com.fc.cicd.controller

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(controllers = [HomeController::class])
class HomeControllerTest {

    @Autowired
    private val mockMvc: MockMvc? = null

    @Test
    @DisplayName("Home Controller Hello World가 리턴됨")
    @Throws(Exception::class)
    fun home() {
        val hello = "Hello World 1"

        mockMvc?.perform(MockMvcRequestBuilders.get(""))
            ?.andExpect(MockMvcResultMatchers.status().isOk())
            ?.andExpect(MockMvcResultMatchers.content().string(hello))
    }

}