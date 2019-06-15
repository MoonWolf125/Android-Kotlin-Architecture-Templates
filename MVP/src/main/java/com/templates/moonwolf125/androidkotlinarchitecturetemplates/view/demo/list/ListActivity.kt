package com.templates.moonwolf125.androidkotlinarchitecturetemplates.view.demo.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.R
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.data.model.TempModel
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.view.adapters.BaseAdapter
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.view.custom.TempCustomRowView
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity: AppCompatActivity(), IListView {

    private val presenter: ListPresenter = ListPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        rv_list.layoutManager = LinearLayoutManager(this)
        val data: List<TempModel> = listOf(TempModel("Example One"), TempModel("Example Two"), TempModel("Example Three"))
        rv_list.adapter = BaseAdapter<TempCustomRowView, TempModel>(TempCustomRowView(this)).setDataItems(data)
    }
}
