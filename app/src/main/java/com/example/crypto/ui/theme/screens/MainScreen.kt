package com.crypto.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.crypto.ui.components.BalanceCard
import com.crypto.ui.theme.CryptoWalletTheme

@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("CryptoWallet") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            BalanceCard(balance = "0.15 BTC")

            // TODO: Добавить ActionButtons и AssetsList
            Text("WalletConnect ядро готово к интеграции!",
                style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    CryptoWalletTheme {
        MainScreen()
    }
}