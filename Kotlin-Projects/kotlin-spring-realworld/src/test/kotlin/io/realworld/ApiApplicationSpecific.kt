package io.realworld

import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder
import io.realworld.client.ProfileClient
import io.realworld.client.TagClient
import io.realworld.client.UserClient
import io.realworld.client.response.InLogin
import io.realworld.client.response.InRegister
import io.realworld.model.User
import io.realworld.model.inout.Login
import io.realworld.model.inout.Register
import io.realworld.service.UserService
import org.hamcrest.Matchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiApplicationSpecific {

    var randomServerPort: Int = 0
    @Autowired
    var environment: Environment? = null
    var tagClient: TagClient? = null
    var userClient: UserClient? = null
    var profileClient: ProfileClient? = null
    var userService: UserService? = null

    fun <T> buildClient(t: Class<T>): T {
        environment.let {
            randomServerPort = Integer.valueOf(it!!.getProperty("local.server.port"))
            return Feign.builder()
                    .encoder(GsonEncoder()).decoder(GsonDecoder())
                    .target(t, "http://localhost:${randomServerPort}")
        }
    }

    @Before
    fun before() {
        tagClient = buildClient(TagClient::class.java)
        userClient = buildClient(UserClient::class.java)
        profileClient = buildClient(ProfileClient::class.java)
    }

    @Test
    fun userAndProfileTest() {
        val fooRegister = userClient?.register(
                InRegister(
                        Register(username = "foo", email = "foo@foo.com", password = "foo")
                )
        )
//        var users = userService!!.setCurrentUser(User(
//                id = 70003017,
//                email = "pob@gmail.com",
//                password = "123456",
//                username = "pobsaeng@gmail.com",
//                token = "11223344"
//        ))
//        println(users)


//        Assert.assertEquals("foo", fooRegister?.user?.username)
//        Assert.assertEquals("foo@foo.com", fooRegister?.user?.email)
//        Assert.assertThat(fooRegister?.user?.token, Matchers.notNullValue())
//        println("------Register foo OK------")

//        val fooLogin = userClient?.login(InLogin(Login(email = "foo@foo.com", password = "foo")))
//        Assert.assertEquals("foo", fooLogin?.user?.username)
//        Assert.assertEquals("foo@foo.com", fooLogin?.user?.email)
//        Assert.assertThat(fooLogin?.user?.token, Matchers.notNullValue())
//        println("Login foo OK")

//        val barRegister = userClient?.register(
//                InRegister(Register(username = "bar", email = "bar@bar.com", password = "bar")))
//        Assert.assertEquals("bar", barRegister?.user?.username)
//        Assert.assertEquals("bar@bar.com", barRegister?.user?.email)
//        Assert.assertThat(barRegister?.user?.token, Matchers.notNullValue())
//        println("Register bar OK")
//
//        val barLogin = userClient?.login(InLogin(Login(email = "bar@bar.com", password = "bar")))
//        Assert.assertEquals("bar", barLogin?.user?.username)
//        Assert.assertEquals("bar@bar.com", barLogin?.user?.email)
//        Assert.assertThat(barLogin?.user?.token, Matchers.notNullValue())
//        println("Login bar OK")
//
//        var profile = profileClient?.profile(barLogin?.user?.token!!, "foo")?.profile
//        Assert.assertEquals("foo", profile?.username)
//        Assert.assertFalse(profile?.following!!)
//        println("Profile foo requested by bar OK")
//
//        profile = profileClient?.follow(barLogin?.user?.token!!, "foo")?.profile
//        Assert.assertEquals("foo", profile?.username)
//        Assert.assertTrue(profile?.following!!)
//        println("Foo is followed by bar OK")
//
//        profile = profileClient?.unfollow(barLogin?.user?.token!!, "foo")?.profile
//        Assert.assertEquals("foo", profile?.username)
//        Assert.assertFalse(profile?.following!!)
//        println("Foo is unfollowed by bar OK")
    }
}
