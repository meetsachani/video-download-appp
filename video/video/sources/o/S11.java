package o;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public class S11 {
    public static Dialog a;

    public static void a(Activity activity) {
        try {
            Dialog dialog = a;
            if (dialog != null && dialog.isShowing()) {
                return;
            }
            Dialog dialog2 = new Dialog(activity);
            a = dialog2;
            dialog2.requestWindowFeature(1);
            a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            a.getWindow().setLayout(-1, -1);
            activity.getWindow().setFlags(1024, 1024);
            activity.getWindow().addFlags(128);
            a.setContentView(R.layout.ad_loader_progressbar);
            a.getWindow().setLayout(-1, -1);
            a.setCancelable(false);
            a.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b() {
        try {
            if (a.isShowing()) {
                a.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
