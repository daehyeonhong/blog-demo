package com.example.demo.user.service

import com.example.demo.user.domain.UserEntity

interface UserService {
    fun getAllUsers(): List<UserEntity>
    fun getUser(id: Long): UserEntity?
}
