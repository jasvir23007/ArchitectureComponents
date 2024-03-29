package com.example.architecturecomponents.lifecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.architecturecomponents.R

class LifeCycleOwnerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_life_cycle_owner, container, false) as ViewGroup

        val lifecycleObserVer = FragmentLifeCycleObserver(lifecycle)
        lifecycle.addObserver(lifecycleObserVer)
        return view
    }
}