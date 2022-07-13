package com.tuts.tutsrestfulspringjpaaws.ui.model.request

data class UserDetailsRequestModel(
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String
)