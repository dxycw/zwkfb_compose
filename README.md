# zwkfb_compose
[![](https://jitpack.io/v/dxycw/zwkfb_compose.svg)](https://jitpack.io/#dxycw/zwkfb_compose)

# 项目介绍
本项目是中文开发的开发包项目，适用于Android的Jetpack Compose版。
如果你使用的的是xml布局项目，请使用[zwkfb_view](https://github.com/dxycw/zwkfb_view)。
# 使用方法
1、在项目的 settings.gradle 文件中添加 JitPack 仓库：

* Groovy 版本：
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
* Kotlin 版本：
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

2、在项目的 build.gradle 文件中添加依赖项：

* Groovy 版本：
```groovy
dependencies {
    implementation 'com.github.dxycw:zwkfb_compose:0.0.2'
}
```

* Kotlin 版本：
```kotlin
dependencies {
    implementation("com.github.dxycw:zwkfb_compose:0.0.2")
}
```

3、就可以在项目中使用了。

# 使用的依赖库
## 官方依赖库
* androidx.core:core-ktx:1.17.0
* androidx.lifecycle:lifecycle-runtime-ktx:2.6.1
* androidx.activity:activity-compose:1.8.0
* androidx.compose:compose-bom:2025.08.01
* androidx.compose.ui:ui:1.7.0
* androidx.compose.ui:ui-graphics:1.7.0
* androidx.compose.ui:ui-tooling-preview:1.7.0
* androidx.compose.material3:material3:1.3.0
## 其他依赖库
* 暂无


# 更新内容
## 0.0.2
* 新增“文本()”、“按钮()”、“阴影按钮()”、“填充色调按钮()”、“轮廓按钮()”、“文本按钮()”组件；
* 新增“局部文本样式”属性；
* 新增“提供文本样式()”函数；
## 0.0.1
* 创建中文开发包Jetpack Compose版
