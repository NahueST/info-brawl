package nahu.curso.infobrawl.ui.screens.main

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import nahu.curso.infobrawl.data.ApiBrawlRepository
import nahu.curso.infobrawl.domain.IApiBrawlRepository
import java.io.IOException

class MainScreenViewModel(private val apiBrawlRepository: IApiBrawlRepository = ApiBrawlRepository()) : ViewModel()
{
    var uiState by mutableStateOf(PlayerStatsScreenState())
        private set

    init {fetchPlayerAndBattles()}
    private fun fetchPlayerAndBattles() {
        viewModelScope.launch {
            try {
                val playerDeferred = async { apiBrawlRepository.fetchPlayer("#820uugrc8") }
                val battlesDeferred = async { apiBrawlRepository.fetchBattles("#820uugrc8") }

                val player = playerDeferred.await()
                val battles = battlesDeferred.await()

                uiState = uiState.copy(
                    player = player,
                    battles = battles
                )
            } catch (e: IOException) {
                Log.e("Info Brawl", "Error recuperando datos del jugador")
            }
        }
    }
//    init {fetchPlayer(); fetchBattles()}
//    private var fetchJob: Job? = null
//    fun fetchPlayer(){
//        fetchJob?.cancel()
//        fetchJob = viewModelScope.launch{
//            try {
//                uiState = uiState.copy(player = apiBrawlRepository.fetchPlayer("#820uugrc8"))
//            }catch (e: IOException) {
//                Log.e("Info Brawl", "Error recuperando el jugador")
//            }
//        }
//    }
//
//    private var fetchJobBattles: Job? = null
//    fun fetchBattles(){
//        fetchJobBattles?.cancel()
//        fetchJob = viewModelScope.launch{
//            try {
//                uiState = uiState.copy(battles = apiBrawlRepository.fetchBattles("#820uugrc8"))
//            }catch (e: IOException) {
//                Log.e("Info Brawl", "Error recuperando las batallas del jugador")
//            }
//        }
//    }


}

