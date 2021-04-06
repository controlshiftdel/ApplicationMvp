package com.example.applicationmvp.presenter

class LuasPresenter (
 private val luasView: LuasView
) {

    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){
        val hasil = panjang * lebar
        val keliling = 2 * (panjang + lebar)

        luasView.hasilLuasPersegiPanjang(hasil)
        luasView.keliling(keliling)


    }
}