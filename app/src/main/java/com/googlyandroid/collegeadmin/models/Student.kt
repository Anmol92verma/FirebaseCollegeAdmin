package com.googlyandroid.collegeadmin.models

data class Student(val enrollment_id: String, val name: String, val section: String,val semester:String)
data class Professor(val uniqueId: String, val name: String, val subjects: ArrayList<Subject>)
data class Subject(val subject: String)
