package com.templates.moonwolf125.androidkotlinarchitecturetemplates.utils

import com.google.android.material.textfield.TextInputLayout

var TextInputLayout.text
    get() = this.editText?.text
    set(value) { this.editText?.text = value }