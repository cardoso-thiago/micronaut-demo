package br.com.cardoso.controller

import br.com.cardoso.entity.User
import br.com.cardoso.service.UserService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import java.util.*

@Controller
class UserController(private val userService: UserService) {

    @Get("/{id}")
    fun user(id: Long): HttpResponse<Optional<User>> = HttpResponse.ok(userService.findById(id))

    @Post("/save")
    fun saveUser(@Body user: User): MutableHttpResponse<User> = HttpResponse.created(userService.saveUser(user))
}