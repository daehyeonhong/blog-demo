package com.example.demo.user.service

import com.example.demo.user.domain.UserEntity
import com.example.demo.user.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = false)
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {
    override fun getAllUsers(): List<UserEntity> = this.userRepository.findAll()

    override fun getUser(id: Long): UserEntity? = this.userRepository.findByIdOrNull(id)
}
