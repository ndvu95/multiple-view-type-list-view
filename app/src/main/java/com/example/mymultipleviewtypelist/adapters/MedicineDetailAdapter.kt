package com.example.mymultipleviewtypelist.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymultipleviewtypelist.data.Medicine
import com.example.mymultipleviewtypelist.databinding.ItemMedicineDetailBinding

class MedicineDetailAdapter : androidx.recyclerview.widget.ListAdapter<Medicine, ViewHolder>(MedicineDetailDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder = ViewHolder.create(parent)

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int,
    ) {
        holder.bind(getItem(position))
    }
}

class MedicineDetailDiffCallback : DiffUtil.ItemCallback<Medicine>() {
    override fun areItemsTheSame(
        oldItem: Medicine,
        newItem: Medicine,
    ): Boolean = oldItem == newItem

    override fun areContentsTheSame(
        oldItem: Medicine,
        newItem: Medicine,
    ): Boolean = oldItem == newItem
}

class ViewHolder(
    val binding: ItemMedicineDetailBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(medicine: Medicine) {
        binding.textMedicineName.text = medicine.name
        binding.textStock.text = medicine.stock.toString()
        binding.textPrice.text = medicine.price.toString()
    }

    companion object {
        fun create(viewGroup: ViewGroup): ViewHolder =
            ViewHolder(
                ItemMedicineDetailBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false,
                ),
            )
    }
}
