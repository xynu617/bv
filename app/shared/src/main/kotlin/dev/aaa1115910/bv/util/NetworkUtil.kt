package dev.aaa1115910.bv.util

/**
 * 本 fork 已移除「中国大陆地区不可用」限制。
 *
 * 上游实现会请求 cloudflare 的 cdn-cgi/trace 判断出口 IP 所在地区，
 * 当 loc == "CN" 时返回 true，MainActivity 据此渲染 RegionBlockScreen 阻止使用。
 *
 * 这里直接返回 false：不做任何地区/网络探测，应用在所有地区都按正常流程启动。
 * 相关调用点（mobile/tv 的 MainActivity）保持原样，RegionBlockScreen 因此不会再被显示。
 */
object NetworkUtil {
    suspend fun isMainlandChina() = false
}
