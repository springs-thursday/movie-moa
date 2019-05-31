package com.springsthursday.moviemoa

import android.os.AsyncTask

class JsoupAsyncTask() : AsyncTask<Unit, Unit, String>()
{
    override fun doInBackground(vararg params : Unit?) : String?
    {
        var jsoupTest : JsoupTest = JsoupTest();

        jsoupTest.shouldParseHTML();

        return "";
    }

    override fun onPreExecute()
    {
        super.onPreExecute();
    }

    override fun onPostExecute(result : String?)
    {
        super.onPostExecute(result);
    }
}