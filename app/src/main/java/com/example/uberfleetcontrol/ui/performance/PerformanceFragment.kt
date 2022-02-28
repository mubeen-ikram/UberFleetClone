package com.example.uberfleetcontrol.ui.performance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.uberfleetcontrol.databinding.FragmentPerformanceBinding

class PerformanceFragment : Fragment() {

    private lateinit var performanceViewModel: PerformanceViewModel
    private var _binding: FragmentPerformanceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        performanceViewModel =
                ViewModelProvider(this).get(PerformanceViewModel::class.java)

        _binding = FragmentPerformanceBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textPerformance
//        performanceViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}