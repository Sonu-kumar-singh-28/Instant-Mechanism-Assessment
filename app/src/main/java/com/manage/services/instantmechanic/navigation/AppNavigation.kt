package com.manage.services.instantmechanic.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.manage.services.instantmechanic.presentation.details.MechanicDetailsScreen
import com.manage.services.instantmechanic.presentation.home.HomeScreen
import com.manage.services.instantmechanic.presentation.home.HomeViewModel
import com.manage.services.instantmechanic.presentation.request.RequestServiceScreen


@Composable
fun AppNavigation(
    viewModel: HomeViewModel
) {

    val navController = rememberNavController()

    val uiState by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        // HOME
        composable("home") {

            HomeScreen(
                viewModel = viewModel,

                onMechanicClick = { mechanic ->
                    navController.navigate(
                        "details/${mechanic.id}"
                    )
                }
            )
        }

        // DETAILS
        composable(
            route = "details/{mechanicId}"
        ) { backStackEntry ->

            val mechanicId =
                backStackEntry.arguments
                    ?.getString("mechanicId")
                    ?.toIntOrNull()

            val mechanic =
                uiState.mechanics.find {
                    it.id == mechanicId
                }

            if (mechanic != null) {

                MechanicDetailsScreen(

                    mechanic = mechanic,

                    onBackClick = {
                        navController.popBackStack()
                    },

                    onRequestServiceClick = {

                        navController.navigate(
                            "request/${mechanic.id}"
                        )
                    }
                )
            }
        }

        // REQUEST SERVICE
        composable(
            route = "request/{mechanicId}"
        ) { backStackEntry ->

            val mechanicId =
                backStackEntry.arguments
                    ?.getString("mechanicId")
                    ?.toIntOrNull()

            val mechanic =
                uiState.mechanics.find {
                    it.id == mechanicId
                }

            if (mechanic != null) {

                RequestServiceScreen(

                    mechanicName = mechanic.name,

                    services = mechanic.services,

                    onBackClick = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}