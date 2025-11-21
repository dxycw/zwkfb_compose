package 安卓x.组合.材质3

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Modifier.Companion
import androidx.compose.ui.graphics.Shape

/**
 * 创建时间：2025年11月21日
 *
 * 描述：按钮
 * @author dxyc
 */



/**
 * 版本：0.0.2
 *
 * 描述：按钮组件
 * @param 单击回调 单击回调
 * @param 修饰符 修饰符
 * @param 启用 是否启用
 * @param 形状 形状
 * @param 颜色集 颜色
 * @param 阴影 阴影
 * @param 边框 边框
 * @param 内容内边距 内容内边距
 * @param 交互源 交互源
 * @param 内容 内容
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 按钮(
    单击回调: () -> Unit,
    修饰符: Modifier = Modifier,
    启用: Boolean = true,
    形状: Shape = ButtonDefaults.shape,
    颜色集: ButtonColors = ButtonDefaults.buttonColors(),
    阴影: ButtonElevation? = ButtonDefaults.buttonElevation(),
    边框: BorderStroke? = null,
    内容内边距: PaddingValues = ButtonDefaults.ContentPadding,
    交互源: MutableInteractionSource? = null,
    内容: @Composable RowScope.() -> Unit
) = Button(onClick = 单击回调, modifier = 修饰符, enabled = 启用, shape =  形状, colors = 颜色集,
    elevation = 阴影, border = 边框, contentPadding = 内容内边距, interactionSource = 交互源,
    content = 内容)

/**
 * 版本：0.0.2
 *
 * 描述：阴影按钮组件
 * @param 单击回调 单击回调
 * @param 修饰符 修饰符
 * @param 启用 是否启用
 * @param 形状 形状
 * @param 颜色集 颜色
 * @param 阴影 阴影
 * @param 边框 边框
 * @param 内容内边距 内容内边距
 * @param 交互源 交互源
 * @param 内容 内容
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 阴影按钮(
    单击回调: () -> Unit,
    修饰符: Modifier = Modifier,
    启用: Boolean = true,
    形状: Shape = ButtonDefaults.elevatedShape,
    颜色集: ButtonColors = ButtonDefaults.elevatedButtonColors(),
    阴影: ButtonElevation? = ButtonDefaults.elevatedButtonElevation(),
    边框: BorderStroke? = null,
    内容内边距: PaddingValues = ButtonDefaults.ContentPadding,
    交互源: MutableInteractionSource? = null,
    内容: @Composable RowScope.() -> Unit
) = ElevatedButton(onClick = 单击回调, modifier = 修饰符, enabled = 启用, shape = 形状, colors = 颜色集,
    elevation = 阴影, border = 边框, contentPadding = 内容内边距, interactionSource = 交互源,
    content = 内容)


/**
 * 版本：0.0.2
 *
 * 描述：填充色调按钮组件
 * @param 单击回调 单击回调
 * @param 修饰符 修饰符
 * @param 启用 是否启用
 * @param 形状 形状
 * @param 颜色集 颜色
 * @param 阴影 阴影
 * @param 边框 边框
 * @param 内容内边距 内容内边距
 * @param 交互源 交互源
 * @param 内容 内容
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 填充色调按钮(
    单击回调: () -> Unit,
    修饰符: Modifier = Modifier,
    启用: Boolean = true,
    形状: Shape = ButtonDefaults.filledTonalShape,
    颜色集: ButtonColors = ButtonDefaults.filledTonalButtonColors(),
    阴影: ButtonElevation? = ButtonDefaults.filledTonalButtonElevation(),
    边框: BorderStroke? = null,
    内容内边距: PaddingValues = ButtonDefaults.ContentPadding,
    交互源: MutableInteractionSource? = null,
    内容: @Composable RowScope.() -> Unit
) = FilledTonalButton(onClick = 单击回调, modifier = 修饰符, enabled = 启用, shape = 形状,
    colors = 颜色集, elevation = 阴影, border = 边框, contentPadding = 内容内边距,
    interactionSource = 交互源, content = 内容)


/**
 * 版本：0.0.2
 *
 * 描述：轮廓按钮组件
 * @param 单击回调 单击回调
 * @param 修饰符 修饰符
 * @param 启用 是否启用
 * @param 形状 形状
 * @param 颜色集 颜色
 * @param 阴影 阴影
 * @param 边框 边框
 * @param 内容内边距 内容内边距
 * @param 交互源 交互源
 * @param 内容 内容
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 轮廓按钮(
    单击回调: () -> Unit,
    修饰符: Modifier = Modifier,
    启用: Boolean = true,
    形状: Shape = ButtonDefaults.outlinedShape,
    颜色集: ButtonColors = ButtonDefaults.outlinedButtonColors(),
    阴影: ButtonElevation? = null,
    边框: BorderStroke? = ButtonDefaults.outlinedButtonBorder(enabled = 启用),
    内容内边距: PaddingValues = ButtonDefaults.ContentPadding,
    交互源: MutableInteractionSource? = null,
    内容: @Composable RowScope.() -> Unit
) = OutlinedButton(onClick = 单击回调, modifier = 修饰符, enabled = 启用, shape = 形状,
    colors = 颜色集, elevation = 阴影, border = 边框, contentPadding = 内容内边距,
    interactionSource = 交互源, content = 内容)


/**
 * 版本：0.0.2
 *
 * 描述：文本按钮组件
 * @param 单击回调 单击回调
 * @param 修饰符 修饰符
 * @param 启用 是否启用
 * @param 形状 形状
 * @param 颜色集 颜色
 * @param 阴影 阴影
 * @param 边框 边框
 * @param 内容内边距 内容内边距
 * @param 交互源 交互源
 * @param 内容 内容
 */
@SuppressLint("ComposableNaming","ModifierParameter")
@Composable
fun 文本按钮(
    单击回调: () -> Unit,
    修饰符: Modifier = Modifier,
    启用: Boolean = true,
    形状: Shape = ButtonDefaults.textShape,
    颜色集: ButtonColors = ButtonDefaults.textButtonColors(),
    阴影: ButtonElevation? = null,
    边框: BorderStroke? = null,
    内容内边距: PaddingValues = ButtonDefaults.TextButtonContentPadding,
    交互源: MutableInteractionSource? = null,
    内容: @Composable RowScope.() -> Unit
) = TextButton(onClick = 单击回调, modifier = 修饰符, enabled = 启用, shape = 形状, colors = 颜色集,
    elevation = 阴影, border = 边框, contentPadding = 内容内边距, interactionSource = 交互源,
    content = 内容)



