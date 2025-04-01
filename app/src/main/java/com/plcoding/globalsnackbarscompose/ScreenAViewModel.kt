package com.plcoding.globalsnackbarscompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ScreenAViewModel: ViewModel() {

//    fun showSnackbar() {
//        viewModelScope.launch {
//            SnackbarController.sendEvent(
//                event = SnackbarEvent(
//                    message = "Hello from ViewModel",
//                    action = SnackbarAction(
//                        name = "Click me!",
//                        action = {
//
////                            SnackbarController.sendEvent(
////                                event = SnackbarEvent(
////                                    message = "Action pressed!"
////                                )
////                            )
//
//                            // dismiss the snack bar here
//
//                        }
//                    )
//                )
//            )
//        }
//    }

    fun showSnackbar() {
        viewModelScope.launch {
            SnackbarController.sendEvent(
                event = SnackbarEvent(
                    message = "Hello from ViewModel",
                    action = SnackbarAction(
                        name = "Click me!",
                        action = {

                            dismissSnackbar()
                           // SnackbarController.dismissSnackbar()

                        }
                    )
                )
            )
        }
    }

     fun dismissSnackbar() {
        viewModelScope.launch {
            SnackbarController.dismissSnackbar()  // Call the dismiss function
        }
    }
}