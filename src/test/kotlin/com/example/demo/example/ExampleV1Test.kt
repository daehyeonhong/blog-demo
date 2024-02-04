package com.example.demo.example

import jakarta.validation.constraints.NotBlank
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.lang.reflect.Field

class ExampleV1Test {
    @Test
    @DisplayName("ExampleV1.name 필드에 NotBlank 어노테이션이 적용되어 있어야 한다.")
    fun verifyExampleV1NameFieldIsAnnotatedWithNotBlank() {
        val field: Field = ExampleV1::class.java.getDeclaredField("name")
        Assertions.assertThat(field.isAnnotationPresent(NotBlank::class.java)).isTrue()
    }
}
