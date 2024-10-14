package com.likhit.productsapp.data.repository

import com.likhit.productsapp.data.remote.Api
import com.likhit.productsapp.data.remote.Product
import com.likhit.productsapp.data.remote.Result
import com.likhit.productsapp.domain.repository.ProductsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val api: Api
):ProductsRepository {

    override suspend fun getProductsList(): Flow<Result<List<Product>>> {
        return flow {
            val productsFromApi = try {
                api.getProductsList()
            }catch (e: IOException){
                e.printStackTrace()
                emit(Result.Error(message = "Error"))
                return@flow
            }catch (e: HttpException){
                e.printStackTrace()
                emit(Result.Error(message = "Error"))
                return@flow
            }catch (e: Exception){
                e.printStackTrace()
                emit(Result.Error(message = "Error"))
                return@flow
            }
            emit(Result.Success(data = productsFromApi.products))
        }
    }
}