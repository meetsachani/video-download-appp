package com.google.android.gms.internal.ads;

import java.util.HashSet;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzaq {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized String a() {
        String str;
        synchronized (zzaq.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (zzaq.class) {
            if (a.add(str)) {
                String str2 = b;
                b = str2 + C6566gU0.h + str;
            }
        }
    }
}
