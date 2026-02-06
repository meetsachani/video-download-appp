package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzfuw {
    public final String a;
    public final zzfuv b;
    public zzfuv c;

    public /* synthetic */ zzfuw(String str, zzfux zzfuxVar) {
        zzfuv zzfuvVar = new zzfuv();
        this.b = zzfuvVar;
        this.c = zzfuvVar;
        str.getClass();
        this.a = str;
    }

    public final zzfuw a(Object obj) {
        zzfuv zzfuvVar = new zzfuv();
        this.c.b = zzfuvVar;
        this.c = zzfuvVar;
        zzfuvVar.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        zzfuv zzfuvVar = this.b.b;
        String str = "";
        while (zzfuvVar != null) {
            Object obj = zzfuvVar.a;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfuvVar = zzfuvVar.b;
            str = C6566gU0.h;
        }
        sb.append('}');
        return sb.toString();
    }
}
