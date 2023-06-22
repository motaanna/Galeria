package com.example.galeria.data

import com.example.galeria.R
import com.example.galeria.model.IdImagemdeDescricao

class ListaMoldura {

    fun carregamoldura(): List<IdImagemdeDescricao> {
        return listOf(
            IdImagemdeDescricao(R.drawable.imagem, R.string.descricaoImagem1),
            IdImagemdeDescricao(R.drawable.imagem2, R.string.descricaoImagem2,),
            IdImagemdeDescricao(R.drawable.imagem3, R.string.descricaoImagem3)
        )
    }
}