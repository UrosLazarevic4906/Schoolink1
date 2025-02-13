package com.example.schoolink.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.schoolink.R
import com.example.schoolink.ui.theme.Ash
import com.example.schoolink.ui.theme.Black

@Composable
fun HeaderBack(
    onBackClick: () -> Unit,
    title: String,
    description: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        IconButton(
            onClick = onBackClick
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_chevron_left),
                contentDescription = "Back",
                tint = Black
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.displaySmall,
//            textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Black
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = description,
                style = MaterialTheme.typography.bodyLarge,
//            textAlign = TextAlign.Center,
                color = Ash
            )
        }

    }
}

@Preview
@Composable
private fun AuthenticationHeaderPreview() {
    HeaderBack(
        onBackClick = {},
        title = "Create an account",
        description = "We’ll sent you a verification code to your email in order to verify your account."
    )
}

