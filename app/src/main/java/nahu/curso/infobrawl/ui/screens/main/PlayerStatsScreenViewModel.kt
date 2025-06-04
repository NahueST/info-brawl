package nahu.curso.infobrawl.ui.screens.main

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import nahu.curso.infobrawl.data.ApiBrawlRepository
import nahu.curso.infobrawl.domain.IApiBrawlRepository
import java.io.IOException

class MainScreenViewModel(private val apiBrawlRepository: IApiBrawlRepository = ApiBrawlRepository()) : ViewModel()
{
    var uiState by mutableStateOf(PlayerStatsScreenState())
        private set

    init {fetchPlayer()}
    private var fetchJob: Job? = null
    fun fetchPlayer(){
        fetchJob?.cancel()
        fetchJob = viewModelScope.launch{
            try {
                uiState = uiState.copy(player = apiBrawlRepository.fetchPlayer("#9pc8pgvc"))
            }catch (e: IOException) {
                Log.e("Info Brawl", "Error recuperando el jugador")
            }
        }
    }
}

