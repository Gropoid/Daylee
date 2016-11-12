package gropoid.daylee.ui.workday

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import gropoid.daylee.R

class WorkdayActivity : AppCompatActivity(), WorkdayContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workday)
    }
}
