package com.example.designpatternpractice.proxy

import org.junit.Test

class ProxyTest {

    @Test
    fun proxyTest(){
        val fileSystemEditor: FileSystemInterface = FileSystemProxy(UserPermission.Editor)
        try { fileSystemEditor.read() } catch (err: Exception) {println(err)}
        try { fileSystemEditor.write() } catch (err: Exception) {println(err)}

        val fileSystemReadOnly: FileSystemInterface = FileSystemProxy(UserPermission.ReadOnly)
        try { fileSystemReadOnly.read() } catch (err: Exception) {println(err)}
        try { fileSystemReadOnly.write() } catch (err: Exception) {println(err)}
    }
}