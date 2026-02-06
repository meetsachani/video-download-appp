package o;

import android.os.Bundle;
import android.os.IBinder;

@Deprecated
/* renamed from: o.ir  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7136ir {
    @JR1(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @JR1(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
