package com.example.galeria.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class IdImagemdeDescricao(
  @DrawableRes  val idimagem : Int,
  @StringRes val idDescrecao : Int
)
