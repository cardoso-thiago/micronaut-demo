package br.com.cardoso.service

import br.com.cardoso.entity.User
import br.com.cardoso.repository.UserRepository
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class UserService(private val userRepository: UserRepository) {

    @Transactional
    open fun saveUser(user: User) = userRepository.save(user)

    @Transactional
    open fun findById(id: Long) = userRepository.findById(id)
}