package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    //화면전환이 발생할 때 자동으로 호출
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate")
    }

    //onCreate Method 호출 이후에 자동으로 호출
    //Activity 가 정지 상태가 되었다가 활동상태로 돌아올 때 호출
    override fun onStart(){
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    //onStart Method 호출 된 이후에 자동으로 호출
    //Activity가 일시정지 되었다가 다시돌아올 때 호출
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    //Activity가 정지상태가 되었다가 활동상태로 돌아갈 때 onStart전에 호출된다.
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")
    }

    //Activity가 일시정지 상태가 될 때 호출된다
    //화면상에서 완전히 사라지거나 현재 화면 위에 작은 팝업 창 같은것이 나타날 때 호출
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    //Activity가 화면에서 사라질 때 호출된다.
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    //현재 액티비티의 수행이 완전히 종료되어 메모리상에서 제거될 때 실행된다.
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }


}