package com.tecsup.aurora.SettingsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AuroraDark)
            .padding(16.dp)
    ) {
        Text(
            text = "Ajustes",
            style = TextStyle(
                brush = AuroraGradient,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(Modifier.height(16.dp))

        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = AuroraCard)
        ) {
            Column(Modifier.padding(16.dp)) {
                SettingItem("Tema claro/oscuro") { Switch(checked = false, onCheckedChange = {}) }
                SettingItem("Administrar contactos de emergencia")
                SettingItem("Usar datos biométricos")
                SettingItem("Soporte técnico")
                SettingItem("Leer Términos y condiciones")
                SettingItem("Política de privacidad")
                Spacer(Modifier.height(12.dp))
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                ) {
                    Text("Cerrar sesión", color = Color.White)
                }
            }
        }
    }
}

@Composable
fun SettingItem(text: String, action: @Composable (() -> Unit)? = null) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text, color = Color.White, fontSize = 16.sp)
        action?.invoke()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingsScreen() {
    SettingsScreen()
}
