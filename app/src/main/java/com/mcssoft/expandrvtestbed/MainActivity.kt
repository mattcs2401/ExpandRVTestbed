package com.mcssoft.expandrvtestbed

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mcssoft.expandrvtestbed.adapter.ParentAdapter
import com.mcssoft.expandrvtestbed.model.ChildItem
import com.mcssoft.expandrvtestbed.model.ParentItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

//        val parentItems: List<ExpandableGroup<ParentItem>> = getParentItems()
//        val recyclerView = findViewById(R.id.id_recyclerView) as RecyclerView
//        val layoutManager = LinearLayoutManager(this)
//
//        //instantiate your adapter with the list of genres
//        val adapter = ParentAdapter(parentItems)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.adapter = adapter

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
//        adapter.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
//        adapter.onRestoreInstanceState(savedInstanceState)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

//    private fun getParentItems() : List<ExpandableGroup<ParentItem>> {
//        val lChildren = arrayListOf<ChildItem>(ChildItem("Child 1"), ChildItem("Child 2"), ChildItem("Child 3"))
//        val lChildren2 = arrayListOf<ChildItem>(ChildItem("Child 4"), ChildItem("Child 5"), ChildItem("Child 6"))
//
//        val parentItem = ParentItem("Parent Title", lChildren)
//        val parentItem2 = ParentItem("Parent Title 2", lChildren2)
//
//        val lParentItems = arrayListOf<ParentItem>(parentItem, parentItem2)
//
//        val egroup = ExpandableGroup("", lParentItems)
//        return arrayListOf(egroup)
//    }
}
