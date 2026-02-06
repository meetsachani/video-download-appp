package com.google.android.gms.internal.ads;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes2.dex */
public final class zzaof {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public zzaof(int i, int i2, int i3) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i + RemoteSettings.i;
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i;
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.b;
        } else {
            i = i2 + this.c;
        }
        this.d = i;
        String str = this.a;
        this.e = str + i;
    }

    public final void d() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}
