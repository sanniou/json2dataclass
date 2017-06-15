import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject


/**
 *author : jichang
 *time   : 2017/06/09
 *desc   : 自动生成数据类 data class
 *version: 1.0
 */
val json = """{"songurl":{"url":[{"show_link":"http:\/\/zhangmenshiting.baidu.com\/data2\/music\/fe1dbb7c5f2a23aa168985e8b4190016\/541809713\/541809713.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","down_type":0,"original":0,"free":1,"replay_gain":"0.250000","song_file_id":541809713,"file_size":1759645,"file_extension":"mp3","file_duration":220,"can_see":1,"can_load":true,"preload":40,"file_bitrate":64,"file_link":"http:\/\/yinyueshiting.baidu.com\/data2\/music\/fe1dbb7c5f2a23aa168985e8b4190016\/541809713\/541809713.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","is_udition_url":1,"hash":"8f894f8433d5c123248998497e5df4527b138add"},{"show_link":"http:\/\/zhangmenshiting.baidu.com\/data2\/music\/40d9a4ced0a4486171f28cb4a47c138d\/541809712\/541809712.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","down_type":1,"original":0,"free":1,"replay_gain":"0.260002","song_file_id":541809712,"file_size":3517999,"file_extension":"mp3","file_duration":220,"can_see":1,"can_load":true,"preload":80,"file_bitrate":128,"file_link":"http:\/\/yinyueshiting.baidu.com\/data2\/music\/40d9a4ced0a4486171f28cb4a47c138d\/541809712\/541809712.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","is_udition_url":0,"hash":"d823524f1f8d967a72427e86bed783e931072584"},{"show_link":"http:\/\/zhangmenshiting.baidu.com\/data2\/music\/ed8f0b17783e2c23eb6fced961aae082\/541809710\/541809710.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","down_type":0,"original":0,"free":1,"replay_gain":"0.000000","song_file_id":541809710,"file_size":7034708,"file_extension":"mp3","file_duration":220,"can_see":1,"can_load":true,"preload":160,"file_bitrate":256,"file_link":"http:\/\/yinyueshiting.baidu.com\/data2\/music\/ed8f0b17783e2c23eb6fced961aae082\/541809710\/541809710.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","is_udition_url":0,"hash":"53cbc7ee734beed5070f115ae3dd4ca78f2d1136"},{"show_link":"http:\/\/zhangmenshiting.baidu.com\/data2\/music\/2b4c48ecf8a001ee8bd7a65a5142ab6f\/541809700\/541809700.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","down_type":2,"original":0,"free":1,"replay_gain":"0.000000","song_file_id":541809700,"file_size":8793062,"file_extension":"mp3","file_duration":220,"can_see":1,"can_load":true,"preload":200,"file_bitrate":320,"file_link":"http:\/\/yinyueshiting.baidu.com\/data2\/music\/2b4c48ecf8a001ee8bd7a65a5142ab6f\/541809700\/541809700.mp3?xcode=7458a56bdd2a1b280c0d8753917afb85","is_udition_url":0,"hash":"852dbcc40edd373059e8ec0c6b2c0f85bdb99c05"},{"show_link":"","down_type":0,"original":0,"free":1,"replay_gain":"0.000000","song_file_id":541809689,"file_size":23097010,"file_extension":"flac","file_duration":220,"can_see":1,"can_load":true,"preload":524.375,"file_bitrate":839,"file_link":"","is_udition_url":0,"hash":"e9bea6bd843704d04ad19f718b35f6eaee631917"}]},"error_code":22000,"songinfo":{"resource_type_ext":"0","resource_type":"0","del_status":"0","collect_num":1763,"hot":"185585","sound_effect":"","title":"桃花诺 ","language":"国语","play_type":0,"country":"内地","biaoshi":"lossless","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","song_source":"web","is_first_publish":0,"artist_640_1136":"","charge":0,"album_500_500":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_500","korean_bb_song":"0","has_mv_mobile":1,"album_no":"1","is_charge":"","pic_radio":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_300","pic_huge":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_1000","ting_uid":"7898","expire":36000,"pic_singer":"","compose":"罗锟","toneid":"0","area":"0","original_rate":"","artist_500_500":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg@s_0,w_500","multiterminal_copytype":"","has_mv":0,"album_title":"桃花诺","piao_id":"0","high_rate":"320","album_1000_1000":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_1000","lrclink":"http:\/\/musicdata.baidu.com\/data2\/lrc\/cd580f83cac336a9bd812351b47ed514\/541680696\/541680696.lrc","distribution":"0000000000,0000000000,0000000000,0000000000,0000000000,0000000000,0000000000,0000000000,0000000000,0000000000","relate_status":"0","learn":0,"pic_big":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_150","artist":"G.E.M.邓紫棋","aliasname":"《上古情歌》电视剧片尾曲","artist_list":[{"avatar_mini":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg@s_0,w_20","avatar_s300":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg@s_0,w_300","ting_uid":"7898","del_status":"0","avatar_s500":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg@s_0,w_500","artist_name":"G.E.M.邓紫棋","avatar_small":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg@s_0,w_48","avatar_s180":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg@s_0,w_180","artist_id":"1814"}],"comment_num":45,"album_id":"541680639","share_num":61,"song_id":"541680641","artist_480_800":"","all_rate":"flac,320,256,128,64","author":"G.E.M.邓紫棋","share_url":"http:\/\/music.baidu.com\/song\/541680641","all_artist_id":"1814","songwriting":"张赢","publishtime":"2017-05-30","copy_type":"1","artist_1000_1000":"http:\/\/musicdata.baidu.com\/data2\/pic\/246667237\/246667237.jpg","versions":"","file_duration":"220","artist_id":"1814","original":0,"compress_status":"0","pic_small":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_90","pic_premium":"http:\/\/musicdata.baidu.com\/data2\/pic\/7cc403f4620d1b1c42dc1ab770a41a6b\/541680638\/541680638.jpg@s_0,w_500","bitrate":"64,128,256,320,839","havehigh":2}}"""

fun parseObject(name: String, json: String): String {
    try {
        val jsonObject = Gson().fromJson(json, JsonObject::class.java)
        val builder = StringBuilder()
        parseObject(name, jsonObject, builder)
        return builder.toString()
    } catch (e: Exception) {
        return ""
    }
}

private fun parseObject(name: String, jsonObject: JsonObject, strs: StringBuilder) {
    val dataBuilder = StringBuilder("data class $name(")
    val docBuilder = StringBuilder("/**\n")
    jsonObject.entrySet()
            .forEach { entry ->
                val key = entry.key
                val element = entry.value
                docBuilder.append("* $key : $element\n")
                dataBuilder.append("val $key :")
                if (element.isJsonObject) {
                    val replacement = Character.toUpperCase(key[0].toTitleCase()) + key.substring(1)
                    dataBuilder.append(replacement)
                    parseObject(replacement, element.asJsonObject, strs)
                } else if (element.isJsonArray) {
                    val replacement = Character.toUpperCase(key[0].toTitleCase()) + key.substring(1)
                    dataBuilder.append("List<$replacement >")
                    parseArray(replacement, element.asJsonArray, strs)
                } else if (element.isJsonNull) {
                    dataBuilder.append("String")
                } else if (element.isJsonPrimitive) {
                    val primitive = element.asJsonPrimitive
                    if (primitive.isBoolean) {
                        dataBuilder.append("Boolean")
                    } else if (primitive.isNumber) {
                        //NOTE  只识别了 Long 和 Float 类型
                        dataBuilder.append(
                                if (primitive.asString.contains('.')) {
                                    "Long"
                                } else {
                                    "Float"
                                })
                    } else if (primitive.isString) {
                        dataBuilder.append("String")
                    }
                }
                dataBuilder.append(",\n")
            }

    dataBuilder.delete(dataBuilder.length - 2, dataBuilder.length).append(")")

    strs.append(docBuilder.toString()).append("*/").append("\n")

    strs.append(dataBuilder.toString()).append("\n\n")
}

private fun parseArray(name: String, jsonArray: JsonArray, strs: StringBuilder) {
    parseObject(name, jsonArray.get(0).asJsonObject, strs)
}

fun main(args: Array<String>) {
    println(parseObject("P", json))
}