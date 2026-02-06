package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgoi implements zzgom {
    public final String a;
    public final zzgwp b;
    public final zzgxk c;
    public final zzgtk d;
    public final zzguq e;
    @InterfaceC10571ws1
    public final Integer f;

    public zzgoi(String str, zzgwp zzgwpVar, zzgxk zzgxkVar, zzgtk zzgtkVar, zzguq zzguqVar, @InterfaceC10571ws1 Integer num) {
        this.a = str;
        this.b = zzgwpVar;
        this.c = zzgxkVar;
        this.d = zzgtkVar;
        this.e = zzguqVar;
        this.f = num;
    }

    public static zzgoi a(String str, zzgxk zzgxkVar, zzgtk zzgtkVar, zzguq zzguqVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        if (zzguqVar == zzguq.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgoi(str, zzgou.a(str), zzgxkVar, zzgtkVar, zzguqVar, num);
    }

    public final zzgtk b() {
        return this.d;
    }

    public final zzguq c() {
        return this.e;
    }

    public final zzgxk d() {
        return this.c;
    }

    @InterfaceC10571ws1
    public final Integer e() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgom
    public final zzgwp f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }
}
