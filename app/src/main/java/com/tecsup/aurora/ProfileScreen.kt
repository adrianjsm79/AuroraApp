package com.tecsup.aurora.ui.screens.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
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
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AuroraDark)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Mi Perfil",
            style = TextStyle(
                brush = AuroraGradient,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(Modifier.height(24.dp))

        // Datos de usuario
        InfoCard("Información de la cuenta") {
            ProfileItem("Usuario", "Juanito123")
            ProfileItem("Número registrado", "+51 923945344")
            ProfileItem("Correo electrónico", "juanitope@gmail.com")

            Spacer(Modifier.height(8.dp))
            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
            ) { Text("Cambiar contraseña", color = Color.White) }
        }

        Spacer(Modifier.height(24.dp))

        // Datos del dispositivo
        InfoCard("Información del equipo") {
            ProfileItem("Marca", "Samsung")
            ProfileItem("Modelo", "Galaxy A20")
            ProfileItem("Sistema", "Android 11")
            ProfileItem("IMEI", "123456789012345")
        }
    }
}

@Composable
fun InfoCard(title: String, content: @Composable ColumnScope.() -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AuroraCard),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(title, color = Color.Cyan, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(8.dp))
            content()
        }
    }
}

@Composable
fun ProfileItem(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("$label:", color = Color.LightGray, fontSize = 14.sp)
        Text(value, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}
