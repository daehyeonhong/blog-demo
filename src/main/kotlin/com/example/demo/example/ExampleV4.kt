package com.example.demo.example

class ExampleV4(
    @ExampleV4Annotation
    val name: String,
)

@Target(AnnotationTarget.PROPERTY)
annotation class ExampleV4Annotation
