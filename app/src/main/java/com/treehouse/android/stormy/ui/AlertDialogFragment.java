package com.treehouse.android.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.treehouse.android.stormy.R;

/**
 * Created by charlesdirenzo on 7/10/17.
 */

public class AlertDialogFragment extends DialogFragment
{//fragments are similar to activities


    //this method will be called when we create the dialogue from our activity.
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        Context context = getActivity();
        //this creates and configures our builder all at the same time.
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                //might have to add context.getString before the R.string part.
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_ok_button_text, null); //null onclicklistener will just close the dialogue.

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
