package com.app.kapi.repository
import com.app.kapi.models.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<Book, Int> {
    // Customize Query
    @Query(value = "SELECT * FROM book", nativeQuery = true)
    abstract fun findAllBook(): List<Book>
}