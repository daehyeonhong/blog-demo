package com.example.demo.example

import jakarta.validation.constraints.NotBlank

class ExampleV3(
    @field:NotBlank
    val name: String,
)
