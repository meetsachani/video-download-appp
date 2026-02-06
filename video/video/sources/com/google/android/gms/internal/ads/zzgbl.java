package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import o.C6566gU0;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgbl extends zzgco implements Runnable {
    public static final /* synthetic */ int f1 = 0;
    public InterfaceFutureC8411o11 c1;
    public Class d1;
    public Object e1;

    public zzgbl(InterfaceFutureC8411o11 interfaceFutureC8411o11, Class cls, Object obj) {
        interfaceFutureC8411o11.getClass();
        this.c1 = interfaceFutureC8411o11;
        this.d1 = cls;
        this.e1 = obj;
    }

    public abstract Object B(Object obj, Throwable th) throws Exception;

    public abstract void C(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        String str;
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.c1;
        Class cls = this.d1;
        Object obj = this.e1;
        String j = super.j();
        if (interfaceFutureC8411o11 != null) {
            str = "inputFuture=[" + interfaceFutureC8411o11.toString() + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + C6566gU0.g;
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
        this.e1 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        Object obj;
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.c1;
        Class cls = this.d1;
        Object obj2 = this.e1;
        boolean z3 = false;
        if (interfaceFutureC8411o11 == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (obj2 == null) {
            z3 = true;
        }
        if (!(z3 | z4) && !isCancelled()) {
            this.c1 = null;
            try {
                if (interfaceFutureC8411o11 instanceof zzgec) {
                    th = ((zzgec) interfaceFutureC8411o11).a();
                } else {
                    th = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = new NullPointerException("Future type " + String.valueOf(interfaceFutureC8411o11.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
                }
                th = cause;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                obj = zzgcy.p(interfaceFutureC8411o11);
                if (th != null) {
                    l(obj);
                    return;
                } else if (cls.isInstance(th)) {
                    try {
                        Object B = B(obj2, th);
                        this.d1 = null;
                        this.e1 = null;
                        C(B);
                        return;
                    } catch (Throwable th2) {
                        try {
                            zzgdr.a(th2);
                            m(th2);
                            return;
                        } finally {
                            this.d1 = null;
                            this.e1 = null;
                        }
                    }
                } else {
                    v(interfaceFutureC8411o11);
                    return;
                }
            }
            obj = null;
            if (th != null) {
            }
        }
    }
}
