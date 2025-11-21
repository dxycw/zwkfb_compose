package com.dxyc.zwkfbcs_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dxyc.zwkfbcs_compose.ui.theme.中午开发包测试Theme
import 安卓x.组合.材质3.填充色调按钮
import 安卓x.组合.材质3.文本

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            中午开发包测试Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        修饰符 = Modifier.padding(innerPadding)
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Greeting(修饰符: Modifier = Modifier) {
    中午开发包测试Theme {
        填充色调按钮(
            单击回调 = { /* TODO */ },
            修饰符 = 修饰符
        ) {
            文本("保存草稿")
        }
    }
}