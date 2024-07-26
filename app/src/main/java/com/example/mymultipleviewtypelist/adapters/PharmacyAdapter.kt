package com.example.mymultipleviewtypelist.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mymultipleviewtypelist.data.ItemViewType
import com.example.mymultipleviewtypelist.data.Medicine
import com.example.mymultipleviewtypelist.data.PharmacyData
import com.example.mymultipleviewtypelist.databinding.ItemCategoryBinding
import com.example.mymultipleviewtypelist.databinding.ItemMedicineListBinding

class PharmacyAdapter : ListAdapter<PharmacyData, RecyclerView.ViewHolder>(PharmacyDiffCallback()) {
    override fun getItemViewType(position: Int): Int =
        when (getItem(position).itemType) {
            ItemViewType.PHARMACY_LIST.ordinal -> {
                ItemViewType.PHARMACY_LIST.ordinal
            }

            else -> {
                ItemViewType.MEDICINE_CATEGORY.ordinal
            }
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerView.ViewHolder =
        if (viewType == ItemViewType.MEDICINE_CATEGORY.ordinal) {
            CategoryViewHolder.create(parent)
        } else {
            MedicineListViewHolder.create(parent)
        }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
    ) {
        val viewType = getItemViewType(position)
        when (viewType) {
            ItemViewType.MEDICINE_CATEGORY.ordinal -> {
                val data = getItem(position) as PharmacyData.MedicineCategory
                (holder as? CategoryViewHolder)?.bind(data.name)
            }

            else -> {
                val data = getItem(position) as PharmacyData.MedicineList
                (holder as? MedicineListViewHolder)?.bind(data.data)
            }
        }
    }
}

class PharmacyDiffCallback : DiffUtil.ItemCallback<PharmacyData>() {
    override fun areItemsTheSame(
        oldItem: PharmacyData,
        newItem: PharmacyData,
    ): Boolean = oldItem::class.java.simpleName == newItem::class.java.simpleName

    override fun areContentsTheSame(
        oldItem: PharmacyData,
        newItem: PharmacyData,
    ): Boolean = oldItem == newItem
}

class CategoryViewHolder(
    val binding: ItemCategoryBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(category: String) {
        binding.textCategoryName.text = category
    }

    companion object {
        fun create(viewGroup: ViewGroup): CategoryViewHolder {
            val binding =
                ItemCategoryBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false,
                )
            return CategoryViewHolder(binding)
        }
    }
}

class MedicineListViewHolder(
    val binding: ItemMedicineListBinding,
) : RecyclerView.ViewHolder(binding.root) {
    private val adapter by lazy {
        MedicineDetailAdapter()
    }

    fun bind(list: List<Medicine>) {
        binding.recyclerDataList.adapter = adapter
        adapter.submitList(list)
    }

    companion object {
        fun create(viewGroup: ViewGroup): MedicineListViewHolder {
            val binding =
                ItemMedicineListBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false,
                )
            return MedicineListViewHolder(binding)
        }
    }
}
