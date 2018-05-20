package com.googlyandroid.collegeadmin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.googlyandroid.collegeadmin.models.Student

class StudentsFragment : Fragment(), OnListFragmentInteractionListener {
  override fun onItemClick(student: Student) {
    Toast.makeText(context, student.name, Toast.LENGTH_SHORT).show()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.fragment_student_list, container, false)
    setAdapter()
    return view
  }

  private fun setAdapter() {
    var rv = view as RecyclerView
    rv.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
    rv.adapter = StudentsRecyclerViewAdapter(this)
  }

}
