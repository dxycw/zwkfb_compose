package 安卓x.组合.材质3

import android.annotation.SuppressLint
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

/**
 * 创建时间：2025年11月21日
 *
 * 描述：文本
 * @author dxyc
 */



/**
 * 版本：0.0.2
 *
 * 描述：文本组件
 * @param 文本 文本内容
 * @param 修饰符 修饰符
 * @param 颜色 文本颜色
 * @param 字体大小 字体大小
 * @param 字体样式 字体样式
 * @param 字体粗细 字体粗细
 * @param 字体族 字体族
 * @param 字间距 字间距
 * @param 文本装饰 文本装饰
 * @param 文本对齐 文本对齐
 * @param 行高 行高
 * @param 溢出 溢出
 * @param 软换行 软换行
 * @param 最大行数 最大行数
 * @param 最小行数 最小行数
 * @param 文本布局回调 文本布局回调
 * @param 样式 样式
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 文本(
    文本: String,
    修饰符: Modifier = Modifier,
    颜色: Color = Color.Unspecified,
    字体大小: TextUnit = TextUnit.Unspecified,
    字体样式: FontStyle? = null,
    字体粗细: FontWeight? = null,
    字体族: FontFamily? = null,
    字间距: TextUnit = TextUnit.Unspecified,
    文本装饰: TextDecoration? = null,
    文本对齐: TextAlign? = null,
    行高: TextUnit = TextUnit.Unspecified,
    溢出: TextOverflow = TextOverflow.Clip,
    软换行: Boolean = true,
    最大行数: Int = Int.MAX_VALUE,
    最小行数: Int = 1,
    文本布局回调: ((TextLayoutResult) -> Unit)? = null,
    样式: TextStyle = LocalTextStyle.current
) = Text(text = 文本, modifier = 修饰符, color = 颜色, fontSize = 字体大小, fontStyle = 字体样式,
    fontWeight = 字体粗细, fontFamily = 字体族, letterSpacing = 字间距, textDecoration = 文本装饰,
    textAlign = 文本对齐, lineHeight = 行高, overflow = 溢出, softWrap = 软换行, maxLines = 最大行数,
    minLines = 最小行数, onTextLayout = 文本布局回调, style = 样式)


/**
 * 版本：0.0.2
 *
 * 描述：文本组件
 * @param 文本 文本内容
 * @param 修饰符 修饰符
 * @param 颜色 文本颜色
 * @param 字体大小 字体大小
 * @param 字体样式 字体样式
 * @param 字体粗细 字体粗细
 * @param 字体族 字体族
 * @param 字间距 字间距
 * @param 文本装饰 文本装饰
 * @param 文本对齐 文本对齐
 * @param 行高 行高
 * @param 溢出 溢出
 * @param 软换行 软换行
 * @param 最大行数 最大行数
 * @param 最小行数 最小行数
 * @param 内嵌内容 内嵌内容
 * @param 文本布局回调 文本布局回调
 * @param 样式 样式
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 文本(
    文本: AnnotatedString,
    修饰符: Modifier = Modifier,
    颜色: Color = Color.Unspecified,
    字体大小: TextUnit = TextUnit.Unspecified,
    字体样式: FontStyle? = null,
    字体粗细: FontWeight? = null,
    字体族: FontFamily? = null,
    字间距: TextUnit = TextUnit.Unspecified,
    文本装饰: TextDecoration? = null,
    文本对齐: TextAlign? = null,
    行高: TextUnit = TextUnit.Unspecified,
    溢出: TextOverflow = TextOverflow.Clip,
    软换行: Boolean = true,
    最大行数: Int = Int.MAX_VALUE,
    最小行数: Int = 1,
    内嵌内容: Map<String, InlineTextContent> = mapOf(),
    文本布局回调: ((TextLayoutResult) -> Unit) = {},
    样式: TextStyle = LocalTextStyle.current,
) = Text(text = 文本, modifier = 修饰符, color = 颜色, fontSize = 字体大小, fontStyle = 字体样式,
    fontWeight = 字体粗细, fontFamily = 字体族, letterSpacing = 字间距, textDecoration = 文本装饰,
    textAlign = 文本对齐, lineHeight = 行高, overflow = 溢出, softWrap = 软换行, maxLines = 最大行数,
    minLines = 最小行数, inlineContent = 内嵌内容, onTextLayout = 文本布局回调, style = 样式)

/**
 * 版本：0.0.2
 *
 * 描述：局部文本样式
 */
@SuppressLint("CompositionLocalNaming")
val 局部文本样式 = LocalTextStyle

/**
 * 版本：0.0.2
 *
 * 描述：提供文本样式
 * @param 值 值
 * @param 内容 内容
 */
@SuppressLint("ComposableNaming")
@Composable
fun 提供文本样式(值: TextStyle, 内容: @Composable () -> Unit
) = ProvideTextStyle(value = 值, content = 内容)

