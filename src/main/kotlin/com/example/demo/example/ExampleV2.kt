package com.example.demo.example

import jakarta.validation.constraints.NotBlank

class ExampleV2(
    @NotBlank
    var name: String = "name",
)
