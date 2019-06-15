/**
 * Designed and developed by Kyle Dahn (@MoonWolf125)
 */

package com.templates.moonwolf125.androidkotlinarchitecturetemplates.view.custom

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.R
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.base.BaseView
import com.templates.moonwolf125.androidkotlinarchitecturetemplates.data.model.TempModel
import kotlinx.android.synthetic.main.temp_custom_row_view.view.*

class TempCustomRowView @JvmOverloads constructor(context: Context,
                                                  attributeSet: AttributeSet? = null,
                                                  defStyleAttr: Int = 0) : BaseView<TempModel>(context, attributeSet, defStyleAttr) {

    init {
        if (attributeSet == null) {
//          Set the layout parameters to layout_width="match_parent" layout_height="wrap_content"
//          This default is structured to fit into a RecyclerView neatly
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        }
        inflate(context, R.layout.temp_custom_row_view, this)
    }

//  Implement BaseView abstract function to newInstance new instances
//  TODO Put this in a companion object?
    override fun <TView : BaseView<TempModel>> newInstance(context: Context): TView {
        return TempCustomRowView(context) as TView
    }

    override fun bindData(data: TempModel) {
//      TODO set all view data in here
        tv_text.text = data.data
    }
}

// TODO do I need this in the future if I move over to callbacks using function types?
interface TempCustomItemListener {
    fun onTempCustomItemSelected(tempModel: TempModel)
}