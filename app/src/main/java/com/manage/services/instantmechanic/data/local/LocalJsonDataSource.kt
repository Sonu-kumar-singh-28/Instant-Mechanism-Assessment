package com.manage.services.instantmechanic.data.local

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.manage.services.instantmechanic.R
import com.manage.services.instantmechanic.data.model.Mechanic

class LocalJsonDataSource(
    private val context: Context
) {

    fun getMechanics(): List<Mechanic> {

        val inputStream = context.resources.openRawResource(
            R.raw.mechanics
        )

        val json = inputStream
            .bufferedReader()
            .use { it.readText() }

        val type = object : TypeToken<List<Mechanic>>() {}.type

        return Gson().fromJson(json, type)
    }
}