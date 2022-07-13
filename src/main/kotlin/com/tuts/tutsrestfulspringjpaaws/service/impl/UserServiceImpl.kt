package com.tuts.tutsrestfulspringjpaaws.service.impl

import com.tuts.tutsrestfulspringjpaaws.service.UserService
import com.tuts.tutsrestfulspringjpaaws.shared.dto.UserDTO
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

  override fun createUser(user: UserDTO): UserDTO {
    TODO("Not yet implemented")
  }
}
