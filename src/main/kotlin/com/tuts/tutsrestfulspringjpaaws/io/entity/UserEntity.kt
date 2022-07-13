package com.tuts.tutsrestfulspringjpaaws.io.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name="users")
class UserEntity: Serializable {

    @Id
    @GeneratedValue
    private var id:Long? = null
        get() = field

    @Column(nullable = false)
    private var userId:String? = null
        get() = field
        set(value) {
            field = value
        }

    @Column(nullable = false, length = 50)
    private var firstName:String? = null
        get() = field
        set(value) {
            field = value
        }

    @Column(nullable = false, length = 50)
    private var lastName:String? = null
        get() = field
        set(value) {
            field = value
        }

    @Column(nullable = false, length = 120)
    private var email:String? = null
        get() = field
        set(value) {
            field = value
        }

    @Column(nullable = false)
    private var encryptedPassword:String? = null
        get() = field
        set(value) {
            field = value
        }

    private var emailVerificationtoken:String? = null
        get() = field
        set(value) {
            field = value
        }

    @Column(nullable = false)
    private var emailVeridicationStatus = false
        get() = field
        set(value) {
            field = value
        }


}