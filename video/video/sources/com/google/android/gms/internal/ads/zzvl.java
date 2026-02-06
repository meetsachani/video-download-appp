package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC11300zs1;
import o.OB;

/* loaded from: classes2.dex */
public final class zzvl {
    public final int a;
    @InterfaceC11300zs1
    public final zzvb b;
    public final CopyOnWriteArrayList c;

    public zzvl(CopyOnWriteArrayList copyOnWriteArrayList, int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = zzvbVar;
    }

    @OB
    public final zzvl a(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        return new zzvl(this.c, 0, zzvbVar);
    }

    public final void b(Handler handler, zzvm zzvmVar) {
        this.c.add(new zzvk(handler, zzvmVar));
    }

    public final void c(final zzdk zzdkVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zzvk zzvkVar = (zzvk) it.next();
            final zzvm zzvmVar = zzvkVar.b;
            zzeu.p(zzvkVar.a, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvj
                @Override // java.lang.Runnable
                public final void run() {
                    zzdk.this.b(zzvmVar);
                }
            });
        }
    }

    public final void d(final zzux zzuxVar) {
        c(new zzdk() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void b(Object obj) {
                ((zzvm) obj).F(0, zzvl.this.b, zzuxVar);
            }
        });
    }

    public final void e(final zzus zzusVar, final zzux zzuxVar) {
        c(new zzdk() { // from class: com.google.android.gms.internal.ads.zzvi
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void b(Object obj) {
                ((zzvm) obj).l(0, zzvl.this.b, zzusVar, zzuxVar);
            }
        });
    }

    public final void f(final zzus zzusVar, final zzux zzuxVar) {
        c(new zzdk() { // from class: com.google.android.gms.internal.ads.zzvg
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void b(Object obj) {
                ((zzvm) obj).i(0, zzvl.this.b, zzusVar, zzuxVar);
            }
        });
    }

    public final void g(final zzus zzusVar, final zzux zzuxVar, final IOException iOException, final boolean z) {
        c(new zzdk() { // from class: com.google.android.gms.internal.ads.zzvh
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void b(Object obj) {
                ((zzvm) obj).h(0, zzvl.this.b, zzusVar, zzuxVar, iOException, z);
            }
        });
    }

    public final void h(final zzus zzusVar, final zzux zzuxVar, final int i) {
        c(new zzdk() { // from class: com.google.android.gms.internal.ads.zzvf
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void b(Object obj) {
                ((zzvm) obj).y(0, zzvl.this.b, zzusVar, zzuxVar, i);
            }
        });
    }

    public final void i(zzvm zzvmVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzvk zzvkVar = (zzvk) it.next();
            if (zzvkVar.b == zzvmVar) {
                copyOnWriteArrayList.remove(zzvkVar);
            }
        }
    }

    public zzvl() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
