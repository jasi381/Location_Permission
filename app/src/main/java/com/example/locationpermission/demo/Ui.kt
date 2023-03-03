package com.example.locationpermission.demo

import android.telecom.Call.Details
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Ui(list: List<DemoData>){

//    Text(text =list[1].status.toString(),
//    fontSize = 18.sp)

    LazyColumn(){
        items(list.size){
            Text(text = list[it].status.toString(),
                fontSize = 18.sp)

            Text(text = list[it].Amount.toString(),
                fontSize = 18.sp)


        }
    }

}



val listDetails = List<DemoData>(10) {
    DemoData(
        "12/12/2021",
        "Monthly Details",
        "Type",
        "Amount",
    )

}


val Details = List<DemoData>(size = 10){
    DemoData(
        "12/12/2021",
        "Monthly Details",
        "Type",
        "Amount",
        "Status"
    )
}