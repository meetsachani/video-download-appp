package o;

import java.util.HashSet;

@Deprecated
/* renamed from: o.fi0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6361fi0 {
    public static final String a = "ExoPlayerLib";
    public static final String b = "2.19.1";
    public static final String c = "ExoPlayerLib/2.19.1";
    public static final int d = 2019001;
    public static final boolean e = true;
    public static final boolean f = true;
    public static final HashSet<String> g = new HashSet<>();
    public static String h = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (C6361fi0.class) {
            if (g.add(str)) {
                h += C6566gU0.h + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (C6361fi0.class) {
            str = h;
        }
        return str;
    }
}
