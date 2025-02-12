package com.example.tespraktikum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tespraktikum.databinding.ActivityMenuAlgoritmaBinding
import com.example.tespraktikum.databinding.ActivityMenuEnkripsiBinding
import javax.crypto.SecretKey
import javax.crypto.spec.IvParameterSpec

class MenuEnkripsi : AppCompatActivity() {
    private lateinit var secretKey: SecretKey
    private lateinit var iv: IvParameterSpec
    lateinit var binding : ActivityMenuEnkripsiBinding
    private var encryptedText = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMenuEnkripsiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        secretKey = AESHelper.generateSecretKey()
        iv = AESHelper.generateIV()

        binding.buttonEn.setOnClickListener {
            val textToEncrypt = binding.editTextText3.text.toString().trim()

            if (textToEncrypt.isNotEmpty()) {
                encryptedText = AESHelper.encrypt(
                    textToEncrypt = textToEncrypt,
                    secretKey = secretKey,
                    iv = iv
                )

                binding.editTextText3.text = encryptedText
            }

        }

        binding.buttonDek.setOnClickListener {
            if (encryptedText.isNotEmpty()) {
                val decryptedText = AESHelper.decrypt(
                    encryptedText = encryptedText,
                    secretKey = secretKey,
                    iv = iv
                )

                binding.editTextText4.text = decryptedText
            }
        }
    }
}