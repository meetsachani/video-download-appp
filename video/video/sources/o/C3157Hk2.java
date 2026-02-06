package o;

import android.content.Context;

/* renamed from: o.Hk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3157Hk2 implements JP1 {
    @Override // o.JP1
    public IP1 a(Context context) {
        if (context != null && C6006eE2.f(context) == 0.0f) {
            return IP1.REDUCED_MOTION;
        }
        return IP1.STANDARD_MOTION;
    }
}
