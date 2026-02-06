package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhah implements zzhaw {
    public final zzhad a;
    public final zzhbi b;
    public final boolean c;
    public final zzgyd d;

    public zzhah(zzhbi zzhbiVar, zzgyd zzgydVar, zzhad zzhadVar) {
        this.b = zzhbiVar;
        this.c = zzhadVar instanceof zzgyo;
        this.d = zzgydVar;
        this.a = zzhadVar;
    }

    public static zzhah k(zzhbi zzhbiVar, zzgyd zzgydVar, zzhad zzhadVar) {
        return new zzhah(zzhbiVar, zzgydVar, zzhadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final boolean a(Object obj, Object obj2) {
        if (!((zzgys) obj).zzt.equals(((zzgys) obj2).zzt)) {
            return false;
        }
        if (this.c) {
            return ((zzgyo) obj).zza.equals(((zzgyo) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final int b(Object obj) {
        int b = ((zzgys) obj).zzt.b();
        if (this.c) {
            return b + ((zzgyo) obj).zza.d();
        }
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final int c(Object obj) {
        int hashCode = ((zzgys) obj).zzt.hashCode();
        if (this.c) {
            return (hashCode * 53) + ((zzgyo) obj).zza.a.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final Object d() {
        zzhad zzhadVar = this.a;
        if (zzhadVar instanceof zzgys) {
            return ((zzgys) zzhadVar).P1();
        }
        return zzhadVar.V0().o3();
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void e(Object obj) {
        this.b.i(obj);
        this.d.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void f(Object obj, byte[] bArr, int i, int i2, zzgwy zzgwyVar) throws IOException {
        zzgys zzgysVar = (zzgys) obj;
        if (zzgysVar.zzt == zzhbj.c()) {
            zzgysVar.zzt = zzhbj.f();
        }
        zzgyo zzgyoVar = (zzgyo) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void g(Object obj, zzhbx zzhbxVar) throws IOException {
        Iterator f = ((zzgyo) obj).zza.f();
        while (f.hasNext()) {
            Map.Entry entry = (Map.Entry) f.next();
            zzgyg zzgygVar = (zzgyg) entry.getKey();
            if (zzgygVar.c() == zzhbw.MESSAGE && !zzgygVar.d() && !zzgygVar.f()) {
                if (entry instanceof zzgzk) {
                    zzhbxVar.I(zzgygVar.a(), ((zzgzk) entry).a().b());
                } else {
                    zzhbxVar.I(zzgygVar.a(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        ((zzgys) obj).zzt.k(zzhbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void h(Object obj, Object obj2) {
        zzhay.A(this.b, obj, obj2);
        if (this.c) {
            zzhay.z(this.d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void i(Object obj, zzhaq zzhaqVar, zzgyc zzgycVar) throws IOException {
        this.b.a(obj);
        zzgyo zzgyoVar = (zzgyo) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final boolean j(Object obj) {
        return ((zzgyo) obj).zza.i();
    }
}
