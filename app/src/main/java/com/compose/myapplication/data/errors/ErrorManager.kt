package com.compose.myapplication.data.errors

import com.compose.myapplication.data.error.mapper.ErrorMapper
import com.task.data.error.Error
import javax.inject.Inject


class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) : ErrorUseCase {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorsMap.getValue(errorCode))
    }
}
