package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o.C6566gU0;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgbv extends zzgco implements Runnable {
    public static final /* synthetic */ int e1 = 0;
    public InterfaceFutureC8411o11 c1;
    public Object d1;

    public zzgbv(InterfaceFutureC8411o11 interfaceFutureC8411o11, Object obj) {
        interfaceFutureC8411o11.getClass();
        this.c1 = interfaceFutureC8411o11;
        this.d1 = obj;
    }

    public abstract Object B(Object obj, Object obj2) throws Exception;

    public abstract void C(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        String str;
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.c1;
        Object obj = this.d1;
        String j = super.j();
        if (interfaceFutureC8411o11 != null) {
            str = "inputFuture=[" + interfaceFutureC8411o11.toString() + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + C6566gU0.g;
        } else if (j != null) {
            return str.concat(j);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void k() {
        t(this.c1);
        this.c1 = null;
        this.d1 = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.c1;
        Object obj = this.d1;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (interfaceFutureC8411o11 == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.c1 = null;
        if (!interfaceFutureC8411o11.isCancelled()) {
            try {
                try {
                    Object B = B(obj, zzgcy.p(interfaceFutureC8411o11));
                    this.d1 = null;
                    C(B);
                    return;
                } catch (Throwable th) {
                    try {
                        zzgdr.a(th);
                        m(th);
                        return;
                    } finally {
                        this.d1 = null;
                    }
                }
            } catch (Error e) {
                m(e);
                return;
            } catch (CancellationException unused) {
                cancel(false);
                return;
            } catch (ExecutionException e2) {
                m(e2.getCause());
                return;
            } catch (Exception e3) {
                m(e3);
                return;
            }
        }
        v(interfaceFutureC8411o11);
    }
}
