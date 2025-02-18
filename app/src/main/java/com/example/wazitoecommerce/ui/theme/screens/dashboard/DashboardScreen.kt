package com.example.wazitoecommerce.ui.theme.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_STUDENTS_URL
import com.example.wazitoecommerce.navigation.VIEW_STUDENTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun DashboardScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.image),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Student App",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(150.dp))
        Button(onClick = {
            navController.navigate(ADD_STUDENTS_URL)
        }) {
            Text(text = "Add Student",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            navController.navigate(VIEW_STUDENTS_URL)
        }) {
            Text(text = "View Student",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif)
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DashboardScreenPreview(){
    WazitoECommerceTheme {
        DashboardScreen(navController = rememberNavController())
    }
}