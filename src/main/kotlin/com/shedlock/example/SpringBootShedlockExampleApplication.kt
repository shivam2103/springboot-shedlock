package com.shedlock.example

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "40s")
class SpringBootShedlockExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootShedlockExampleApplication>(*args)
}
