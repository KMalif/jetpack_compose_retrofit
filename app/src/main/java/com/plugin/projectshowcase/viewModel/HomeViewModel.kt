package com.plugin.projectshowcase.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plugin.projectshowcase.data.api.model.Photos
import com.plugin.projectshowcase.data.repository.PhotosRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val photosRepo: PhotosRepo
) : ViewModel() {

    private val _state = MutableStateFlow(emptyList<Photos>())
    val state : StateFlow<List<Photos>>
    get() = _state

    init {
        viewModelScope.launch {
            val showcases  = photosRepo.getAllPhotos()
            _state.value = showcases
        }
    }
}