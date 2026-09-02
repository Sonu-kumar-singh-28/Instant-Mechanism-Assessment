package com.manage.services.instantmechanic.presentation.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.manage.services.instantmechanic.data.repository.MechanicRepository

class HomeViewModelFactory(
    private val repository: MechanicRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(
        modelClass: Class<T>
    ): T {

        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        }

        throw IllegalArgumentException(
            "Unknown ViewModel class"
        )
    }
}