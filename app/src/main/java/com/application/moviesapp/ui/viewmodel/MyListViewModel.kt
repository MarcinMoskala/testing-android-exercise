package com.application.moviesapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.application.moviesapp.data.common.Resource
import com.application.moviesapp.domain.model.MovieFavourite
import com.application.moviesapp.domain.usecase.MovieFavouriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.cancellable
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyListViewModel @Inject constructor(private val useCase: MovieFavouriteUseCase) :
    ViewModel() {

    val getMovieFavouritePagingFlow = useCase().cachedIn(viewModelScope)
}