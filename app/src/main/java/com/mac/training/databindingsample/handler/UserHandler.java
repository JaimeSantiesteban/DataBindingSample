package com.mac.training.databindingsample.handler;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mac.training.databindingsample.R;

/**
 * Created by User on 10/9/2016.
 */

public class UserHandler {

    private static final String TAG = "UserHandler";

    public void onClickUserName(View view) {
        Context ctx = view.getContext();
        Toast.makeText(ctx, ctx.getString(R.string.hola_q_hace_msg), Toast.LENGTH_LONG);
        Log.d(TAG, ctx.getString(R.string.hola_q_hace_msg));
    }

}
