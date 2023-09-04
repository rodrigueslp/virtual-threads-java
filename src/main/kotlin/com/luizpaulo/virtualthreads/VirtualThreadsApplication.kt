package com.luizpaulo.virtualthreads

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VirtualThreadsApplication

fun main(args: Array<String>) {
	runApplication<VirtualThreadsApplication>(*args)
}
