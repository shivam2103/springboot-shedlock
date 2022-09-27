package com.shedlock.example.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test")
data class TestEntity(

    @Id
    @GeneratedValue(generator = "UUID") @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private var id: UUID? = null,

    @Column(nullable = false)
    private val name: String? = null
)
