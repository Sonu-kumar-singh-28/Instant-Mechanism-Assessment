package com.manage.services.instantmechanic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.manage.services.instantmechanic.data.remote.RetrofitClient
import com.manage.services.instantmechanic.data.repository.MechanicRepository
import com.manage.services.instantmechanic.navigation.AppNavigation
import com.manage.services.instantmechanic.presentation.home.HomeViewModel
import com.manage.services.instantmechanic.presentation.home.HomeViewModelFactory

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Retrofit API
        val api = RetrofitClient.api

        // Repository
        val repository = MechanicRepository(api)

        setContent {

            val viewModel: HomeViewModel = viewModel(
                factory = HomeViewModelFactory(repository)
            )

            AppNavigation(viewModel)
        }
    }
}