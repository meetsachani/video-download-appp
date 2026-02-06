package com.google.android.gms.ads;

import java.util.Locale;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class VersionInfo {
    public final int a;
    public final int b;
    public final int c;

    public VersionInfo(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    @InterfaceC5670cr1
    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
