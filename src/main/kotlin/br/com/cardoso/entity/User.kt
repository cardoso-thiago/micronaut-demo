package br.com.cardoso.entity

import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @Column(name = "name")
        val name: String,
        @Column(name = "age")
        val age: Int
)