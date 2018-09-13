package com.vsoft.trackify.model

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

data class User(@Id var id: String?, var name: String, var latitude: Double, var longitude: Double, var lastLocationDate: LocalDateTime)