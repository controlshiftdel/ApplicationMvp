package com.example.applicationmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.applicationmvp.presenter.LuasPresenter
import com.example.applicationmvp.presenter.LuasView

class MainActivity : AppCompatActivity(),
    LuasView {

    private lateinit var presenter: LuasPresenter
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var tvHasilLuasPersegiPanjang: TextView
    private lateinit var btnHitungLuasPersegiPanjang: Button
    private lateinit var tvHasilKelilingPersegiPanjang: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = LuasPresenter(this)

        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_panjang)
        tvHasilLuasPersegiPanjang = findViewById(R.id.tv_hasil_luas_persegi_panjang)
        tvHasilKelilingPersegiPanjang = findViewById(R.id.tv_hasil_Keliling_persegi_panjang)

        btnHitungLuasPersegiPanjang = findViewById(R.id.btn_hitung)

        btnHitungLuasPersegiPanjang.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()

            presenter.hitungLuasPersegiPanjang(panjang, lebar)
        }
    }

    override fun hasilLuasPersegiPanjang(luas: Float) {
        tvHasilLuasPersegiPanjang.text = luas.toString()

    }

    override fun keliling(keliling: Float) {
        tvHasilKelilingPersegiPanjang.text = keliling.toString()
    }

}