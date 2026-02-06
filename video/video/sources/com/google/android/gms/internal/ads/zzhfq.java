package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class zzhfq {
    public final LinkedHashMap a;

    public zzhfq(int i) {
        this.a = zzhfs.b(i);
    }

    public final zzhfq a(Object obj, zzhge zzhgeVar) {
        zzhgd.a(obj, "key");
        zzhgd.a(zzhgeVar, "provider");
        this.a.put(obj, zzhgeVar);
        return this;
    }
}
