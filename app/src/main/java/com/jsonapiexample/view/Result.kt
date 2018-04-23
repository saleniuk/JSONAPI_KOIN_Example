package com.jsonapiexample.view

sealed class Result<T> {

    class Success<T>(val data: T) : Result<T>()
    class Error<T>(val throwable: Throwable) : Result<T>()
    class Loading<T>() : Result<T>()
}