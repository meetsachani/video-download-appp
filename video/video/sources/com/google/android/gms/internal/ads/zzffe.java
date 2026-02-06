package com.google.android.gms.internal.ads;

import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzffe {
    public final zzfex a;
    public final InterfaceFutureC8411o11 b;
    public boolean c = false;
    public boolean d = false;

    public zzffe(final zzfec zzfecVar, final zzfew zzfewVar, final zzfex zzfexVar) {
        this.a = zzfexVar;
        this.b = zzgcy.f(zzgcy.n(zzfewVar.a(zzfexVar), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzffc
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzffe.b(zzffe.this, zzfewVar, zzfecVar, zzfexVar, (zzfel) obj);
            }
        }, zzfexVar.b()), Exception.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzffd
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzffe.a(zzffe.this, zzfewVar, (Exception) obj);
            }
        }, zzfexVar.b());
    }

    public static /* synthetic */ InterfaceFutureC8411o11 a(zzffe zzffeVar, zzfew zzfewVar, Exception exc) {
        synchronized (zzffeVar) {
            zzffeVar.d = true;
            throw exc;
        }
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzffe zzffeVar, zzfew zzfewVar, zzfec zzfecVar, zzfex zzfexVar, zzfel zzfelVar) {
        synchronized (zzffeVar) {
            try {
                zzffeVar.d = true;
                zzfewVar.b(zzfelVar);
                if (!zzffeVar.c) {
                    zzfecVar.d(zzfexVar.a(), zzfelVar);
                    return zzgcy.h(null);
                }
                return zzgcy.h(new zzfev(zzfelVar, zzfexVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized InterfaceFutureC8411o11 c(zzfex zzfexVar) {
        if (!this.d && !this.c) {
            zzfex zzfexVar2 = this.a;
            if (zzfexVar2.a() != null && zzfexVar.a() != null && zzfexVar2.a().equals(zzfexVar.a())) {
                this.c = true;
                return this.b;
            }
        }
        return null;
    }

    public final synchronized void d(zzgcu zzgcuVar) {
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzffb
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                zzfev zzfevVar = (zzfev) obj;
                return zzgcy.i();
            }
        };
        zzfex zzfexVar = this.a;
        zzgcy.r(zzgcy.n(this.b, zzgcfVar, zzfexVar.b()), zzgcuVar, zzfexVar.b());
    }
}
