package com.manage.services.instantmechanic.data.remote

import com.manage.services.instantmechanic.data.model.Mechanic
import retrofit2.http.GET

interface MechanicApi {

    @GET("c/a860-6359-4537-bb91")
    suspend fun getMechanics(): List<Mechanic>
}