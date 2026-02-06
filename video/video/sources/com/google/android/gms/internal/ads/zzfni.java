package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzfni extends zzfnj {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public zzfni(zzfnb zzfnbVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnbVar);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
