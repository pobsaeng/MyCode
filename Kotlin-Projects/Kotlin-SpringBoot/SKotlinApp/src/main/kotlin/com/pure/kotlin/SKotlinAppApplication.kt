package com.pure.kotlin

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.jdbc.core.JdbcTemplate

@SpringBootApplication
@ComponentScan
class SKotlinAppApplication(val jdbcTemplate: JdbcTemplate) : CommandLineRunner {

	override fun run(vararg args: String?) {
//		with(jdbcTemplate) { //2
//			execute("DROP TABLE customers IF EXISTS ")
//			execute("CREATE TABLE customers(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))")
//		}

		//3
//		val splitUpNames = listOf("John Woo", "Jeff Dean", "Josh Block", "Josh Long")
//				.map { name -> name.split(" ") }
//				.map { split -> split[0] to split[1] }
//
//		//5
//		jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?, ?)", splitUpNames, splitUpNames.size) { ps, (firstName, lastName) ->
//			ps.setString(1, firstName)
//			ps.setString(2, lastName)
//		}

		//6
		println("===========")
		println(jdbcTemplate.dataSource.connection.catalog)
	}
}

	@Bean
	fun run(): CommandLineRunner {
		return CommandLineRunner { args ->
			println("CommandLineRunner!")

		}
	}

fun main(args: Array<String>) {
	runApplication<SKotlinAppApplication>(*args)
}