package com.springsthursday.moviemoa

import android.util.Log
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

class JsoupTest{
    fun shouldParseHTML(){
        var resultString : String = "";
        var doc : Document?;
        var titleElement : Elements?;

        doc = Jsoup
            .connect("http://m.skbroadband.com/content/realtime/Channel_List.do?key_depth1=5800&key_depth2=192&key_depth3=20190531")
            .get();

        titleElement = doc.select("p.cont");

        titleElement.forEach {
            resultString += it.text() + "/";
        }

        Log.d("result", resultString);
    }
}