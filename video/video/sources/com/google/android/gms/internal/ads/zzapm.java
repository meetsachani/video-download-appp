package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzapm {
    public final String a;
    public final String b;

    public zzapm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzapm.class == obj.getClass()) {
            zzapm zzapmVar = (zzapm) obj;
            if (TextUtils.equals(this.a, zzapmVar.a) && TextUtils.equals(this.b, zzapmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + C6566gU0.g;
    }
}
