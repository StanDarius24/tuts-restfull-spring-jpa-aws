package com.tuts.tutsrestfulspringjpaaws.ui.controller

import com.tuts.tutsrestfulspringjpaaws.service.UserService
import com.tuts.tutsrestfulspringjpaaws.shared.dto.UserDTO
import com.tuts.tutsrestfulspringjpaaws.ui.model.request.UserDetailsRequestModel
import com.tuts.tutsrestfulspringjpaaws.ui.model.response.UserRest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users") // http://localhost:8080/users
class UserController {

    @Autowired
    var userService: UserService? = null

    @GetMapping
    fun getUser(): String {
        return "get user was called"
    }

    @PostMapping
    fun createUser(@RequestBody userDetailsRequestModel: UserDetailsRequestModel): UserRest? {
        val returnValue = UserRest()
        val userDto = UserDTO()

//        BeanUtils.copyProperties(userDetailsRequestModel, userDto)
        val createdValue = userService?.createUser(userDto)
//        BeanUtils.copyProperties(createdValue!!, returnValue)

        return returnValue
    }

    @PutMapping
    fun updateUser(): String {
       return "update user was called"
    }

    @DeleteMapping
    fun deleteUser(): String {
        return "delete user was called"
    }

}