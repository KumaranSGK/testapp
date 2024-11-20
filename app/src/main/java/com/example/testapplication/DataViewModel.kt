package com.example.testapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

open class DataViewModel: ViewModel() {
    private val _isamount = MutableLiveData<Boolean>()
    val amount: LiveData<Boolean> = _isamount


    fun Amount(amount: String) {
        viewModelScope.launch {
            try {
                if (!amount.isNullOrEmpty() && !amount.equals("0")) {
                    _isamount.value = true
                }
                else{
                    _isamount.value = false
                }

            } catch (e: Exception) {

            } finally {

            }
        }
    }
}
