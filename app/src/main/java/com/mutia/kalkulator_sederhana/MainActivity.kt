package com.mutia.kalkulator_sederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mutia.kalkulator_sederhana.R


class MainActivity : AppCompatActivity() {

    private lateinit var  etAngka1 : EditText
    private lateinit var etAngka2 : EditText
    private lateinit var btnTambah : Button
    private lateinit var btnKurang : Button
    private lateinit var btnKali : Button
    private lateinit var btnbagi : Button
    private lateinit var txtHasil : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);

        etAngka1 = findViewById(R.id.etAngka1)
        etAngka2 = findViewById(R.id.etAngka2)
        btnTambah = findViewById(R.id.btnTambah)
        btnKurang = findViewById(R.id.btnkurang)
        btnKali = findViewById(R.id.btnKali)
        btnbagi = findViewById(R.id.btnbagi)
        txtHasil = findViewById(R.id.txtHasil)

        btnTambah.setOnClickListener() {
            val nAngka1 = etAngka1.text.toString().toInt()
            val nAngka2 = etAngka2.text.toString().toInt()
            val hasil =     nAngka1 + nAngka2
            txtHasil.setText("Hasil Tambah : "+ hasil)
        }
        btnKurang.setOnClickListener() {
            val nAngka1 = etAngka1.text.toString().toInt()
            val nAngka2 = etAngka2.text.toString().toInt()
            val hasil = nAngka1 - nAngka2
            txtHasil.text = "Hasil Kurang : "+ hasil
        }
        btnKali.setOnClickListener() {
            val nAngka1 = etAngka1.text.toString().toInt()
            val nAngka2 = etAngka2.text.toString().toInt()

            val hasil = nAngka1 * nAngka2
            txtHasil.text = "Hasil kali : "+ hasil
        }
        btnbagi.setOnClickListener() {
            val nAngka1 = etAngka1.text.toString().toInt()
            val nAngka2 = etAngka2.text.toString().toInt()

            val hasil = nAngka1 / nAngka2
            txtHasil.text = "Hasil bagi : "+ hasil
        }

    }
}