package com.vsoft.trackify.controller

import com.vsoft.trackify.model.User
import com.vsoft.trackify.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @Autowired
    private val repository: UserRepository? = null

    @GetMapping(value = ["/users"])
    fun getAllUsers(): MutableList<User>? = repository?.findAll()

    @GetMapping(value = ["/users/{id]"])
    fun getUserById(@PathVariable id: String) = repository?.findById(id)

    @PostMapping(value = ["/users"])
    fun addNewUser(@RequestBody user: User): User? {
        repository?.save(user)
        return user
    }
}