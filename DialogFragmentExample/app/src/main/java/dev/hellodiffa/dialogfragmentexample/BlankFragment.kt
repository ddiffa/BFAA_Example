package dev.hellodiffa.dialogfragmentexample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : DialogFragment() {


    private lateinit var callback: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSave.setOnClickListener {

            //ini ngirim data via interface
            callback.setName(edtName.text.toString())
            dismiss()
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        //ini buat set callback/ main activitinya
        val fragment = activity
        if (fragment is MainActivity) {
            callback = fragment
        }
    }
}