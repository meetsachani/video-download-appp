package com.google.android.gms.internal.ads;

import java.util.HashSet;
import o.InterfaceC5056aJ2;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfnb {
    public JSONObject a;
    public final zzfnk b;

    public zzfnb(zzfnk zzfnkVar) {
        this.b = zzfnkVar;
    }

    @InterfaceC5056aJ2
    public final JSONObject a() {
        return this.a;
    }

    public final void b() {
        this.b.b(new zzfnl(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new zzfnm(this, hashSet, jSONObject, j));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new zzfnn(this, hashSet, jSONObject, j));
    }

    @InterfaceC5056aJ2
    public final void e(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
