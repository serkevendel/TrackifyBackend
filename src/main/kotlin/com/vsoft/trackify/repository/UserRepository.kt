package com.vsoft.trackify.repository

import com.vsoft.trackify.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String>