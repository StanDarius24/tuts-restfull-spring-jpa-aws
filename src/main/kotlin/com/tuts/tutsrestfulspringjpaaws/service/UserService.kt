package com.tuts.tutsrestfulspringjpaaws.service

import com.tuts.tutsrestfulspringjpaaws.shared.dto.UserDTO

interface UserService {

    fun createUser(user: UserDTO): UserDTO

}