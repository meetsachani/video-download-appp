package com.google.firebase.platforminfo;

import o.InterfaceC11300zs1;
import o.WX0;

/* loaded from: classes3.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @InterfaceC11300zs1
    public static String a() {
        try {
            return WX0.b1.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
