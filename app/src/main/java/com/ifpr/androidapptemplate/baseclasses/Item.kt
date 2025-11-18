package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var campo_produto: String? = null,
    var campo_funcionario: String? = null,
    var campo_preço: String? = null,
    val base64Image: String? = null,
    var campo_quantidade: String? = null,
    val imageUrl: String? = null
)
