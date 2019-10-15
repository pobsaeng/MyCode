package com.app.kapi.repository
import com.app.kapi.models.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UsersRepository: JpaRepository<Users, Int> {
    override fun findById(id: Int): Optional<Users> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }
}