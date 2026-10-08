package com.example.questlayout

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
    horizontalAlignmnet = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(id=R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id=R.string.univ),\
            fontSize = 22.sp
        )
    }
}