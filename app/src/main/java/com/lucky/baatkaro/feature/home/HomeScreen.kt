package com.lucky.baatkaro.feature.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.WbIncandescent
import androidx.compose.material.icons.filled.Web
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Hub
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.WbIncandescent
import androidx.compose.material.icons.outlined.Web
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lucky.baatkaro.R
import com.lucky.baatkaro.feature.auth.signin.SignInScreen
import com.lucky.baatkaro.feature.bottomNavigation.BottomNavigationItem


@Composable
fun HomeScreen(
    navController: NavController,
) {
    val items = listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = Icons.Filled.Hub,
            unselectedIcon = Icons.Outlined.Hub
        ),
        BottomNavigationItem(
            title = "InterView Prep",
            selectedIcon = Icons.Filled.Web,
            unselectedIcon = Icons.Outlined.Web
        ),
        BottomNavigationItem(
            title = "You",
            selectedIcon = Icons.Filled.AccountCircle,
            unselectedIcon = Icons.Outlined.AccountCircle
        ),
    )
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }





    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->

                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = {
                            selectedItemIndex = index
                        },
                        label = {
                            Text(text = item.title)
                        },
                        alwaysShowLabel = true,

                        icon = {
                            Icon(
                                imageVector = if (index == selectedItemIndex){
                                    item.selectedIcon
                                } else{
                                    item.unselectedIcon
                                },
                                contentDescription =item.title )

                        }


                    )


                }

            }
        }
    )  {it ->
    Column(
        modifier = Modifier
            .padding(it)
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(R.drawable.rgpv),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.White)
            )

        }
        Spacer(modifier = Modifier.size(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Please select your branch !",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleLarge.fontWeight,


                )
        }
        Spacer(modifier = Modifier.size(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        )
        {
            ElevatedButton(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),

                border = BorderStroke(2.dp, Color.Black),

                onClick = { navController.navigate("cs") }

            ) {
                Text(
                    "Computer Science",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,

                    )
            }

        }
        Spacer(modifier = Modifier.size(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        )
        {
            ElevatedButton(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),

                border = BorderStroke(2.dp, Color.Black),

                onClick = { /*TODO*/ }

            ) {
                Text(
                    "Mechanical",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                )
            }

        }
        Spacer(modifier = Modifier.size(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        )
        {
            ElevatedButton(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),

                border = BorderStroke(2.dp, Color.Black),

                onClick = { /*TODO*/ }

            ) {
                Text(
                    "Civil",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                )
            }

        }
        Spacer(modifier = Modifier.size(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        )
        {
            ElevatedButton(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),

                border = BorderStroke(2.dp, Color.Black),

                onClick = { /*TODO*/ }

            ) {
                Text(
                    "IT",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                )
            }

        }
        Spacer(modifier = Modifier.size(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        )
        {
            ElevatedButton(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),


                border = BorderStroke(2.dp, Color.Black),

                onClick = { /*TODO*/ }

            ) {
                Text(
                    "EC",
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                )
            }

        }
    }


    }



}

@Preview(showBackground = true)
@Composable
fun Homescreen() {
    HomeScreen(navController = rememberNavController())
}