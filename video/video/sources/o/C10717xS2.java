package o;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: o.xS2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10717xS2 {
    public static Context a;
    public static C10717xS2 b;
    public static ProgressDialog c;

    public C10717xS2() {
        c();
    }

    public static C10717xS2 b(Context context) {
        if (b == null) {
            a = context;
            b = new C10717xS2();
        }
        return b;
    }

    public void a() {
        ProgressDialog progressDialog = c;
        if (progressDialog != null && progressDialog.isShowing()) {
            c.dismiss();
        }
    }

    public final void c() {
        ProgressDialog progressDialog = new ProgressDialog(a);
        c = progressDialog;
        progressDialog.setMessage("Parsing url...");
    }

    public void d() {
        ProgressDialog progressDialog = c;
        if (progressDialog != null && !progressDialog.isShowing()) {
            c.show();
        }
    }
}
