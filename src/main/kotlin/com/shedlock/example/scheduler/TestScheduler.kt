package com.shedlock.example.scheduler

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class TestScheduler {

    @Scheduled(cron = "\${schedule.time}")
    @SchedulerLock(
        name = "testScheduler",
        lockAtMostFor = "\${schedule.lock.atmost}",
        lockAtLeastFor = "\${schedule.lock.atleast}"
    )
    fun testShedLock(){
        println("Ran this on this instance")
        println(LocalDateTime.now())
    }
}