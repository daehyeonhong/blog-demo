package com.example.demo.example

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.reflect.full.hasAnnotation

class ExampleV4Test {
    @Test
    fun testExampleV4() {
        val hasAnnotation = ExampleV4::name.hasAnnotation<ExampleV4Annotation>()
        Assertions.assertThat(hasAnnotation).isTrue()
    }
}
