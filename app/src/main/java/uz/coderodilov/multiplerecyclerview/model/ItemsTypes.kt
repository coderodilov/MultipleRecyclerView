package uz.coderodilov.multiplerecyclerview.model

sealed class ItemsTypes {
    data class ItemContact(val phone: String) : ItemsTypes()
    data class ItemHeader(val time: String) : ItemsTypes()
}
