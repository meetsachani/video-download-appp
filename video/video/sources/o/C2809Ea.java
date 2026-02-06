package o;

import android.os.Bundle;

/* renamed from: o.Ea  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2809Ea {
    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
