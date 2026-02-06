package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.C4500Ve2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzalz {
    public final String a;
    public final int b;
    public final String c;
    public final Set d;

    public zzalz(String str, int i, String str2, Set set) {
        this.b = i;
        this.a = str;
        this.c = str2;
        this.d = set;
    }

    public static zzalz a(String str, int i) {
        String str2;
        String trim = str.trim();
        zzdc.d(!trim.isEmpty());
        int indexOf = trim.indexOf(C4500Ve2.b);
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        String str3 = zzeu.a;
        String[] split = trim.split("\\.", -1);
        String str4 = split[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < split.length; i2++) {
            hashSet.add(split[i2]);
        }
        return new zzalz(str4, i, str2, hashSet);
    }

    public static zzalz b() {
        return new zzalz("", 0, "", Collections.EMPTY_SET);
    }
}
