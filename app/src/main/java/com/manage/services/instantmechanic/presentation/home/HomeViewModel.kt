package com.manage.services.instantmechanic.presentation.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manage.services.instantmechanic.data.repository.MechanicRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: MechanicRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadMechanics()
    }

    fun loadMechanics() {
        viewModelScope.launch {

            _uiState.value = HomeUiState(
                isLoading = true
            )

            repository.getMechanics()
                .onSuccess { mechanics ->

                    _uiState.value = HomeUiState(
                        isLoading = false,
                        mechanics = mechanics
                    )
                }
                .onFailure { error ->

                    _uiState.value = HomeUiState(
                        isLoading = false,
                        error = error.message ?: "Unable to load mechanics"
                    )
                }
        }
    }
}