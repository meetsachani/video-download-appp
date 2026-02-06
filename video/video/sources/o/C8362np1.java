package o;

import android.os.Build;

/* renamed from: o.np1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8362np1 implements InterfaceC10688xL1 {
    public static boolean d() {
        if (Build.VERSION.SDK_INT < 34) {
            return true;
        }
        return false;
    }
}
