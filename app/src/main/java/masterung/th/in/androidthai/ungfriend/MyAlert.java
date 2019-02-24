package masterung.th.in.androidthai.ungfriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlert {

    private Context context;
    public MyAlert(Context context){this.context=context;}
    public void normalDialog(String title,String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
            }
        });

    }
}
