package com.manage.services.instantmechanic.data.repository

import com.manage.services.instantmechanic.data.model.Mechanic
import com.manage.services.instantmechanic.data.remote.MechanicApi
import javax.inject.Inject

class MechanicRepository @Inject constructor(
    private val api: MechanicApi
) {

    suspend fun getMechanics(): Result<List<Mechanic>> {
        return try {
            val data = api.getMechanics()
            Result.success(data)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}