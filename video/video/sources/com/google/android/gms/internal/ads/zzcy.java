package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcy {
    public static final String c;
    public static final String d;
    public final String a;
    public final int b;

    static {
        String str = zzeu.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public zzcy(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.a);
        bundle.putInt(d, this.b);
        return bundle;
    }
}
