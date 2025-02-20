package com.example.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


data class Contact(
    val name : String,
    val phoneNumber : String
)

@Composable
fun columnAndRows() {

    val contacts = remember {
        listOf(
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "Amit",
                phoneNumber = "123-987-7890"
            ),
            Contact(
                name = "Pushpa",
                phoneNumber = "345-456-7890"
            ),
            Contact(
                name = "Yash Mehta",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "Minato Uzumaki",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "Amit",
                phoneNumber = "123-987-7890"
            ),
            Contact(
                name = "Pushpa",
                phoneNumber = "345-456-7890"
            ),
            Contact(
                name = "Yash Mehta",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "Minato Uzumaki",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "Amit",
                phoneNumber = "123-987-7890"
            ),
            Contact(
                name = "Pushpa",
                phoneNumber = "345-456-7890"
            ),
            Contact(
                name = "Yash Mehta",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "Minato Uzumaki",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),Contact(
                name = "John Doe",
                phoneNumber = "123-456-7890"
            ),


        )
    }

//    LazyColumn(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        items(contacts) { contact ->
//            Card(
//                modifier = Modifier.fillMaxWidth().padding(16.dp)
//            ) {
//                Column {
//                    Text(text = contact.name)
//                    Text(text = contact.phoneNumber)
//                }
//            }
//        }
//    }

    LazyRow(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        items(contacts) { contact ->
            Card(
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Column {
                    Text(text = contact.name)
                    Text(text = contact.phoneNumber)
                }
            }
        }
    }


}