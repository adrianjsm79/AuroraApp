package com.tecsup.aurora

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val AuroraGradient = Brush.horizontalGradient(
    listOf(Color(0xFF9C27B0), Color(0xFF00BCD4))
)

val AuroraDark = Color(0xFF0E1320)
val AuroraCard = Color(0xFF1A2235)

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AuroraDark)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(
            text = "Aurora",
            style = TextStyle(
                brush = AuroraGradient,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Grid de opciones
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                MenuCard("📍 Localización")
                MenuCard("📞 Llamada de emergencia")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                MenuCard("📊 Reportes")
                MenuCard("⚠️ Alertas activas")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                MenuCard("🔒 Seguridad")
                MenuCard("👥 Mis contactos")
            }
        }
    }
}

@Composable
fun MenuCard(title: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .height(120.dp)
            .clickable { },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AuroraCard)
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Text(title, color = Color.White, fontSize = 16.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}