package org.d3if4104.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*


// TODO: R
class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val panjangPersegi = et_panjangPJ.text
        val lebarPersegi = et_lebarPJ.text
        btn_hitungPJ.setOnClickListener {
            if (panjangPersegi.toString().isEmpty() || lebarPersegi.toString().isEmpty()) {
                Toast.makeText(activity, "Harus Diisi", Toast.LENGTH_SHORT).show()
            } else {
                val panjang = panjangPersegi.toString().trim().toInt()
                val lebar = lebarPersegi.toString().trim().toInt()
                val luas = panjang * lebar
                val keliling = 2 * (panjang + lebar)
                tv_luasPJ.text = luas.toString()
                tv_kelilingPJ.text = keliling.toString()
                tv_luasPJ.visibility = View.VISIBLE
                tv_kelilingPJ.visibility = View.VISIBLE
            }
        }


    }
}