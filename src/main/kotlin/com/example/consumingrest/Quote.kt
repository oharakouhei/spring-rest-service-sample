package com.example.consumingrest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Quote {
    var type: String? = null
    private var value: Value? = null
    fun getValue(): Value? {
        return value
    }

    fun setValue(value: Value?) {
        this.value = value
    }

    override fun toString(): String {
        return "Quote{" +
            "type='" + type + '\'' +
            ", value=" + value +
            '}'
    }
}
