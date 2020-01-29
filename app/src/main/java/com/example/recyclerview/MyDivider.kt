package com.example.recyclerview

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.TypedValue
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class MyDivider(
    private val context: Context,
    private val divider: Drawable
) : DividerItemDecoration(context, VERTICAL) {

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        c.save()
        val leftWithMargin = dpToPx(60f)
        val parentTop = parent.paddingTop
        val parentBottom = parent.height - parent.paddingBottom
        for (i in 0 until parent.childCount) {
            divider.setBounds(leftWithMargin, parentTop, parent.width, parentBottom)
            divider.draw(c)
        }
    }

    private fun dpToPx(dp: Float): Int = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp,
        context.resources.displayMetrics
    ).toInt()
}