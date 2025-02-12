package com.example.tespraktikum.api
import com.example.tespraktikum.model.DataMakanan
import retrofit2.Call
import retrofit2.http.*

abstract class ApiInterface {
    //    Kos Putra
    @GET("datakos")
    fun getAllMakanan(): Call<List<ResponseDataMakananItem>>

    @POST("datakos")
    abstract fun addMakanan(@Body request : DataMakanan) :Call<ResponseDataMakanan>


    @DELETE("datakos/{id}")
    fun deleteMakanan(@Path("id")id : Int): Call<ResponseDataMakananItem>

    @PUT("datakos/{id}")
    fun editMakanan(@Path("id") id: Int, @Body request : DataMakanan): Call<ResponseDataMakanan>
}