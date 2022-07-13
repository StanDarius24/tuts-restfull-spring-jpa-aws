package com.tuts.tutsrestfulspringjpaaws.shared.dto

import kotlin.properties.Delegates

class UserDTO: java.io.Serializable{

    companion object {
        const val serialVersionUID = 4865903039190150223L
    }

    var id by Delegates.notNull<Long>()
    val userID by lazy { "" }
    val firstName by lazy { "" }
    val lastName by lazy { "" }
    val password by lazy { "" }
    val encryptedPassword by lazy { "" }
    val emailVerificationToken by lazy { "" }
    var emailVerificationStatus = false

}
