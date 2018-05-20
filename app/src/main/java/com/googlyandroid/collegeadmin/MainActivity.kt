package com.googlyandroid.collegeadmin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.navigation

class MainActivity : AppCompatActivity() {

  private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
    when (item.itemId) {
      R.id.navigation_home -> {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            StudentsFragment()).commit()
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_dashboard -> {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            StudentsFragment()).commit()
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_notifications -> {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            StudentsFragment()).commit()
        return@OnNavigationItemSelectedListener true
      }
    }
    false
  }

  private val firebaseAuth = FirebaseAuth.getInstance()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    firebaseAuth?.currentUser?.let {
      title = "Welcome ${it.email} !"
    }
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    val inflater = menuInflater
    inflater.inflate(R.menu.main_activity_menu, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    item?.let {
      when (item.itemId) {
        R.id.logout -> {
          firebaseAuth.signOut()
          startActivity(Intent(this@MainActivity, LoginActivity::class.java))
          finish()
        }
      }
    }
    return super.onOptionsItemSelected(item)
  }
}
