package com.googlyandroid.collegeadmin

import com.googlyandroid.collegeadmin.models.Professor
import com.googlyandroid.collegeadmin.models.Student
import com.googlyandroid.collegeadmin.models.Subject
import java.util.Date

class DatabaseConnection {

  companion object {
    val connection = DatabaseConnection()
    fun getInstance(): DatabaseConnection {
      return connection
    }
  }

  fun insertAttendance(forDate: Date, forStudent: Student, forSubject: Subject,
      byProfessor: Professor) {

  }

  fun getAttendance(forStudent: Student, forDate: Date) {

  }

  fun removeAttendance(forDate: Date, forStudent: Student, forSubject: Subject,
      byProfessor: Professor) {

  }

  fun insertSubjects(byProfessor: Professor, forSubject: Subject) {

  }

  fun removeSubject(byProfessor: Professor, forSubject: Subject) {

  }

}