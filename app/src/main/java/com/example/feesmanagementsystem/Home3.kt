package com.example.feesmanagementsystem

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import android.graphics.Color
import com.example.feesmanagementsystem.StudentProfile.Companion.emailComp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter


class Home3 : Fragment() {
    var email: String? = ""
    var name: String? = ""
    lateinit var emailtxt: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var view= inflater.inflate(R.layout.fragment_home3, container, false)

        email = emailComp

        emailtxt = view.findViewById(R.id.emailTV)
        emailtxt.setText(email)

        return view
    }


}