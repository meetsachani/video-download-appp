package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.St  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4266St {
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
