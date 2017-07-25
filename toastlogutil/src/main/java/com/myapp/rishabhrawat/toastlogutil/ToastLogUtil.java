package com.myapp.rishabhrawat.toastlogutil;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Rishabh Rawat on 7/25/2017.
 */

public class ToastLogUtil {

    private Context context;
    public static void toastmessage(Context context,String message)
    {
        Toast.makeText(context,String.format(message), Toast.LENGTH_LONG).show();
    }

    public static void errorlog(String message)
    {
        Log.e("Your_ERROR_MESSAGE",message);
    }

    public static void verboselog(String message)
    {
        Log.v("Your_VERBOSE_MESSAGE",message);
    }

    public static void infolog(String message)
    {
        Log.i("Your_INFO_MESSAGE",message);
    }
    public static void debuglog(String message)
    {
        Log.d("Your_DEBUG_MESSAGE",message);
    }
}
