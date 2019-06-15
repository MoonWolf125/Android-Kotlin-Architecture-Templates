package com.templates.moonwolf125.androidkotlinarchitecturetemplates.base

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

abstract class BaseView<TModel> @JvmOverloads constructor(context: Context,
                                                        attributeSet: AttributeSet? = null,
                                                        defStyleAttr: Int = 0): FrameLayout(context, attributeSet, defStyleAttr) {

    //  No need to override this as it's used in BaseAdapter
    fun setup(func: BaseView<TModel>.() -> Unit) {
        this.func()
    }

//  Override this in your custom view in order to instantiate inside BaseAdapter
    abstract fun <TView: BaseView<TModel>> newInstance(context: Context): TView

//  Override this in your custom view in order to bind the proper Data object
    abstract fun bindData(data: TModel)
}