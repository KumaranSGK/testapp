package com.example.testapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

open class DataViewModel: ViewModel() {
    private val _isamount = MutableLiveData<String>()
    val amount: LiveData<String> = _isamount


    fun Amount(userId: String) {
        viewModelScope.launch {
            try {
                _loading.value = true
                val result = userRepository.getUser(userId)
                _userData.value = result
            } catch (e: Exception) {
                _error.value = e.message
            } finally {
                _loading.value = false
            }
        }
    }
}