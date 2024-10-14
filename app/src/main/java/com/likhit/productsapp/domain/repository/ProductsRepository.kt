package com.likhit.productsapp.domain.repository

import com.likhit.productsapp.data.remote.Product
import com.likhit.productsapp.data.remote.Result
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {

    suspend fun getProductsList(): Flow<Result<List<Product>>>

}