package com.jarrodcoffee.example.data.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jarrodcoffee.example.data.JarrodMenuItem
import com.jarrodcoffee.example.data.events.CategoryClickListener
import com.jarrodcoffee.example.databinding.JarrodCateogryItemsBinding

class JarrodCategoryAdapter(
    private val context: Context,
    private val categoryList: ArrayList<JarrodMenuItem>,
    private val categoryClickListener: CategoryClickListener
): RecyclerView.Adapter<JarrodCategoryAdapter.CategoryViewHolder>() {

    private lateinit var binding: JarrodCateogryItemsBinding

    class CategoryViewHolder(private var jarrodCatItems: JarrodCateogryItemsBinding):RecyclerView.ViewHolder(jarrodCatItems.root){
        fun bind(currentItem: JarrodMenuItem, listener: CategoryClickListener){
            jarrodCatItems.jarrodCategory = currentItem
            jarrodCatItems.jarrodCategoryClick = listener
            jarrodCatItems.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(context)
        val itemBinding = JarrodCateogryItemsBinding.inflate(inflater, parent, false)
        binding = itemBinding
        return CategoryViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) =
        holder.bind(categoryList[position], categoryClickListener)

}