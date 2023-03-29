package com.cwj.idioms

import java.nio.file.Files
import java.nio.file.Paths

/**
 * @author wujie.chen
 * 2023/1/29 14:55
 */
fun main() {
    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    // fun use()
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}