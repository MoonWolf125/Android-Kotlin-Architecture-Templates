package com.templates.moonwolf125.androidkotlinarchitecturetemplates.view.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.base.BaseView

class BaseAdapter<TView : BaseView<TModel>, TModel>(private val view: BaseView<TModel>) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder<TModel>>() {

    private var dataItems: List<TModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<TModel> {
        return BaseViewHolder(rowView = view.newInstance(parent.context))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<TModel>, position: Int) {
        holder.rowView.setup { bindData(dataItems[position]) }
    }

    override fun getItemCount(): Int = dataItems.size

    fun setDataItems(dataItems: List<TModel>): BaseAdapter<TView, TModel> {
        this.dataItems = dataItems
        notifyDataSetChanged()
        return this
    }

    class BaseViewHolder<TModel>(val rowView: BaseView<TModel>) : RecyclerView.ViewHolder(rowView)
}
