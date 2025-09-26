package com.aurora.ui.recovery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 🎨 Colores base
val AuroraGradient = Brush.horizontalGradient(
    listOf(Color(0xFF9C27B0), Color(0xFF00BCD4))
)

val AuroraDark = Color(0xFF0E1320)
val AuroraCard = Color(0xFF1A2235)

@Composable
fun RecoveryMethodScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AuroraDark)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.height(8.dp))
        Text("Sistema de localización de celulares", color = Color.Gray, fontSize = 14.sp)

        Spacer(Modifier.height(32.dp))
        Text("Restablecer contraseña", fontSize = 20.sp, color = Color(0xFF4CAF50))

        Spacer(Modifier.height(24.dp))
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = AuroraCard)
        ) {
            Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Método de envío:", color = Color.White, fontSize = 16.sp)

                Spacer(Modifier.height(12.dp))
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EA)),
                    modifier = Modifier.fillMaxWidth()
                ) { Text("Teléfono") }

                Spacer(Modifier.height(8.dp))
                OutlinedButton(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    border = ButtonDefaults.outlinedButtonBorder.copy(width = 1.dp, brush = AuroraGradient)
                ) { Text("Correo", color = Color.White) }

                Spacer(Modifier.height(16.dp))
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
                ) { Text("Enviar código", color = Color.White) }
            }
        }
    }
}

@Composable
fun RecoveryCodeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AuroraDark)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.height(8.dp))
        Text("Sistema de localización de celulares", color = Color.Gray, fontSize = 14.sp)

        Spacer(Modifier.height(32.dp))
        Text("Restablecer contraseña", fontSize = 20.sp, color = Color(0xFF4CAF50))

        Spacer(Modifier.height(16.dp))
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AuroraCard),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Enviamos un código de recuperación a tu correo o teléfono",
                    color = Color.LightGray, textAlign = TextAlign.Center, fontSize = 14.sp)

                Spacer(Modifier.height(8.dp))
                Text("Enviado a: juanitope@gmail.com", color = Color.White, fontSize = 14.sp)

                Spacer(Modifier.height(24.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    repeat(4) {
                        OutlinedTextField(value = "", onValueChange = { },
                            modifier = Modifier.width(50.dp),
                            singleLine = true
                        )
                    }
                }

                Spacer(Modifier.height(8.dp))
                Text("Código inválido", color = Color.Red, fontSize = 12.sp)

                Spacer(Modifier.height(16.dp))
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
                ) { Text("Reenviar código", color = Color.White) }
            }
        }
    }
}

@Composable
fun RecoveryNewPasswordScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AuroraDark)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.height(8.dp))
        Text("Sistema de localización de celulares", color = Color.Gray, fontSize = 14.sp)

        Spacer(Modifier.height(32.dp))
        Text("Restablecer contraseña", fontSize = 20.sp, color = Color(0xFF4CAF50))

        Spacer(Modifier.height(16.dp))
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = AuroraCard),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedTextField(value = "", onValueChange = { }, label = { Text("Contraseña nueva") })
                Spacer(Modifier.height(12.dp))
                OutlinedTextField(value = "", onValueChange = { }, label = { Text("Confirmar contraseña") })

                Spacer(Modifier.height(12.dp))
                Text("Contraseña inválida", color = Color.Red, fontSize = 12.sp)
                Text("Contraseña válida", color = Color.Green, fontSize = 12.sp)

                Spacer(Modifier.height(16.dp))
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
                ) { Text("Guardar y volver al inicio", color = Color.White) }
            }
        }
    }
}

//// ---- Previews ----

@Preview(showBackground = true)
@Composable
fun PreviewRecoveryMethod() { RecoveryMethodScreen() }

@Preview(showBackground = true)
@Composable
fun PreviewRecoveryCode() { RecoveryCodeScreen() }

@Preview(showBackground = true)
@Composable
fun PreviewRecoveryNewPassword() { RecoveryNewPasswordScreen() }
