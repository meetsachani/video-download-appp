package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbob implements zzbmt, zzboa {
    public final zzboa X;
    public final HashSet Y = new HashSet();

    public zzbob(zzboa zzboaVar) {
        this.X = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void a(String str, JSONObject jSONObject) {
        zzbms.b(this, str, jSONObject);
    }

    public final void c() {
        HashSet hashSet = this.Y;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.k("Unregistering eventhandler: ".concat(String.valueOf(((zzbjw) simpleEntry.getValue()).toString())));
            this.X.v((String) simpleEntry.getKey(), (zzbjw) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void c1(String str, JSONObject jSONObject) {
        zzbms.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void q(String str, Map map) {
        zzbms.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void u(String str, String str2) {
        zzbms.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void v(String str, zzbjw zzbjwVar) {
        this.X.v(str, zzbjwVar);
        this.Y.remove(new AbstractMap.SimpleEntry(str, zzbjwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzbnd
    public final void w(String str) {
        this.X.w(str);
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void x0(String str, zzbjw zzbjwVar) {
        this.X.x0(str, zzbjwVar);
        this.Y.add(new AbstractMap.SimpleEntry(str, zzbjwVar));
    }
}
