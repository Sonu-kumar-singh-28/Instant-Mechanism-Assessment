package com.manage.services.instantmechanic.presentation.home

import com.manage.services.instantmechanic.data.model.Mechanic


data class HomeUiState(
    val isLoading: Boolean = false,
    val mechanics: List<Mechanic> = emptyList(),
    val error: String? = null
)