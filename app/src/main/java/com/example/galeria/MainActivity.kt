package com.example.galeria

import android.net.ipsec.ike.IkeKeyIdIdentification
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.galeria.data.ListaMoldura
import com.example.galeria.model.IdImagemdeDescricao
import com.example.galeria.ui.theme.GaleriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaTheme {
                // A surface container using the 'background' color from the theme


            }
        }
    }
}

@Composable
 fun AppGaleriaDeFotos() {
    Surface(
        Modifier.fillMaxSize(),
        color = Color.LightGray

    ) {
        LazyColumn{
            items(ListaMoldura().carregamoldura()){
                fotos ->
                Fotos(idImagemdeDescricao = fotos)
            }
        }
    }
}

@Composable
fun Fotos(idImagemdeDescricao: IdImagemdeDescricao){

    Card() {
        Column() {
            Image(
                painter = painterResource(id = idImagemdeDescricao.idimagem),
                contentDescription = null
            )
            Text(
                text = stringResource(id = idImagemdeDescricao.idDescrecao),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(160.dp)
            )

        }

    }

}





