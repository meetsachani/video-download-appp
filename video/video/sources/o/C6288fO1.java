package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;

/* renamed from: o.fO1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6288fO1 {
    public static final String g = "positiveButton";
    public static final String h = "negativeButton";
    public static final String i = "rationaleMsg";
    public static final String j = "theme";
    public static final String k = "requestCode";
    public static final String l = "permissions";
    public String a;
    public String b;
    public int c;
    public int d;
    public String e;
    public String[] f;

    public C6288fO1(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i2, int i3, @InterfaceC5670cr1 String[] strArr) {
        this.a = str;
        this.b = str2;
        this.e = str3;
        this.c = i2;
        this.d = i3;
        this.f = strArr;
    }

    public AlertDialog a(Context context, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        if (this.c > 0) {
            builder = new AlertDialog.Builder(context, this.c);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        return builder.setCancelable(false).setPositiveButton(this.a, onClickListener).setNegativeButton(this.b, onClickListener).setMessage(this.e).create();
    }

    public androidx.appcompat.app.a b(Context context, DialogInterface.OnClickListener onClickListener) {
        a.C0006a c0006a;
        int i2 = this.c;
        if (i2 > 0) {
            c0006a = new a.C0006a(context, i2);
        } else {
            c0006a = new a.C0006a(context);
        }
        return c0006a.b(false).y(this.a, onClickListener).p(this.b, onClickListener).l(this.e).create();
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString(g, this.a);
        bundle.putString(h, this.b);
        bundle.putString(i, this.e);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putStringArray("permissions", this.f);
        return bundle;
    }

    public C6288fO1(Bundle bundle) {
        this.a = bundle.getString(g);
        this.b = bundle.getString(h);
        this.e = bundle.getString(i);
        this.c = bundle.getInt(j);
        this.d = bundle.getInt(k);
        this.f = bundle.getStringArray("permissions");
    }
}
