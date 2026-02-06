package o;

import android.graphics.Color;

@Deprecated
/* renamed from: o.rI0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9214rI0 {
    public static String a(String str) {
        return UE.h + str + ",." + str + " *";
    }

    public static String b(@JF int i) {
        return TD2.M("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}
