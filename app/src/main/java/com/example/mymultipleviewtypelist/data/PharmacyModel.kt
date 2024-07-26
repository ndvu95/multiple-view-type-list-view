package com.example.mymultipleviewtypelist.data

enum class ItemViewType {
    MEDICINE_CATEGORY,
    PHARMACY_LIST,
}

sealed class PharmacyData(
    val itemType: Int,
) {
    data class MedicineCategory(
        val name: String,
    ) : PharmacyData(ItemViewType.MEDICINE_CATEGORY.ordinal)

    data class MedicineList(
        val data: List<Medicine>,
    ) : PharmacyData(ItemViewType.PHARMACY_LIST.ordinal)
}

data class Medicine(
    val name: String,
    val stock: Int,
    val price: Double,
)
