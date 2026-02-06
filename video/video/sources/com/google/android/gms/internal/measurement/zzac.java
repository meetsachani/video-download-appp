package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzac {
    public zzad a;
    public zzad b;
    public List<zzad> c;

    public zzac() {
        this.a = new zzad("", 0L, null);
        this.b = new zzad("", 0L, null);
        this.c = new ArrayList();
    }

    public final zzad a() {
        return this.a;
    }

    public final void b(zzad zzadVar) {
        this.a = zzadVar;
        this.b = (zzad) zzadVar.clone();
        this.c.clear();
    }

    public final void c(String str, long j, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, zzad.c(str2, this.a.b(str2), map.get(str2)));
        }
        this.c.add(new zzad(str, j, hashMap));
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzac zzacVar = new zzac((zzad) this.a.clone());
        for (zzad zzadVar : this.c) {
            zzacVar.c.add((zzad) zzadVar.clone());
        }
        return zzacVar;
    }

    public final zzad d() {
        return this.b;
    }

    public final void e(zzad zzadVar) {
        this.b = zzadVar;
    }

    public final List<zzad> f() {
        return this.c;
    }

    public zzac(zzad zzadVar) {
        this.a = zzadVar;
        this.b = (zzad) zzadVar.clone();
        this.c = new ArrayList();
    }
}
