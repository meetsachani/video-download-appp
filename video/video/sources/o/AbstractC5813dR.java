package o;

import android.content.Context;

@InterfaceC6615gi
/* renamed from: o.dR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5813dR {
    public static final String a = "cct";

    public static AbstractC5813dR a(Context context, ND nd, ND nd2) {
        return new C2645Ci(context, nd, nd2, "cct");
    }

    public static AbstractC5813dR b(Context context, ND nd, ND nd2, String str) {
        return new C2645Ci(context, nd, nd2, str);
    }

    public abstract Context c();

    @InterfaceC5670cr1
    public abstract String d();

    public abstract ND e();

    public abstract ND f();
}
