package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzdb {
    public static final String b;
    public final String a;

    static {
        String str = zzeu.a;
        b = Integer.toString(0, 36);
    }

    public zzdb(String str) {
        this.a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(b, this.a);
        return bundle;
    }
}
