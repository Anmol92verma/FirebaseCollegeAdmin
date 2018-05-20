package com.googlyandroid.collegeadmin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.googlyandroid.collegeadmin.models.Student
import kotlinx.android.synthetic.main.fragment_student_item.view.content
import kotlinx.android.synthetic.main.fragment_student_item.view.item_number

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class StudentsRecyclerViewAdapter(
    private val mListener: OnListFragmentInteractionListener)
  : RecyclerView.Adapter<StudentsRecyclerViewAdapter.ViewHolder>() {

  private val mValues: ArrayList<Student> = ArrayList()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.fragment_student_item, parent, false)
    return ViewHolder(view)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = mValues[position]
    holder.mIdView.text = item.enrollment_id
    holder.mContentView.text = item.name
  }

  override fun getItemCount(): Int = mValues.size

  inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
    val mIdView: TextView = mView.item_number
    val mContentView: TextView = mView.content

    init {
      mView.setOnClickListener {
        mListener.onItemClick(mValues[adapterPosition])
      }
    }

    override fun toString(): String {
      return super.toString() + " '" + mContentView.text + "'"
    }
  }
}
