package com.stmik.roninews

import android.view.View

interface RecyclerViewClickListener {
    fun onItemClickListener(view: View, book: Book)
}