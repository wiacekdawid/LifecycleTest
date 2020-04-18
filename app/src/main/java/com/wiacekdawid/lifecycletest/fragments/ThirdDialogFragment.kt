package com.wiacekdawid.lifecycletest.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.DialogFragment
import com.wiacekdawid.lifecycletest.R

class ThirdDialogFragment: AppCompatDialogFragment() {

    override fun onAttach(context: Context) {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onCreate")
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.BaseDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onCreateView")
        return inflater.inflate(R.layout.dialog_fragment_third, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("Lifecycle callback: " + this::class.java.simpleName, "onDetach")
        super.onDetach()
    }

    companion object {
        fun newInstance() = ThirdDialogFragment()
    }
}