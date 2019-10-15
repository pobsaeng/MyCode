package com.pure.kotlin.helper

import java.lang.reflect.Modifier
import java.util.*

class Utility {
    fun reflectionToString(obj: Any): String {
        val s = LinkedList<String>()
        var clazz: Class<in Any>? = obj.javaClass

        while (clazz != null) {
            for (prop in clazz.declaredFields.filterNot { Modifier.isStatic(it.modifiers) }) {
                prop.isAccessible = true
                s += "${prop.name}=" + prop.get(obj)?.toString()?.trim()
            }
            clazz = clazz.superclass
        }
        return "${obj.javaClass.simpleName}=[${s.joinToString(", ")}]"
    }

    fun convertProp(i: Int, listMap: ArrayList<Map<String, Any>>, instant: Any): Any {
        var clazz = Class.forName(instant.javaClass.name)

        listMap[i].forEach { (key, value) ->

            val fieldNAME = clazz.getDeclaredField(key)
            fieldNAME.isAccessible = true
            fieldNAME.set(instant, value)
        }
        return instant
    }
}