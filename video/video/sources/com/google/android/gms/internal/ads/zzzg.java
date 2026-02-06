package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzzg {
    public int a;
    public int b;
    public int c = 0;
    public zzyz[] d = new zzyz[100];

    public zzzg(boolean z, int i) {
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized zzyz b() {
        zzyz zzyzVar;
        try {
            this.b++;
            int i = this.c;
            if (i > 0) {
                zzyz[] zzyzVarArr = this.d;
                int i2 = i - 1;
                this.c = i2;
                zzyzVar = zzyzVarArr[i2];
                if (zzyzVar != null) {
                    zzyzVarArr[i2] = null;
                } else {
                    throw null;
                }
            } else {
                zzyzVar = new zzyz(new byte[65536], 0);
                int i3 = this.b;
                zzyz[] zzyzVarArr2 = this.d;
                int length = zzyzVarArr2.length;
                if (i3 > length) {
                    this.d = (zzyz[]) Arrays.copyOf(zzyzVarArr2, length + length);
                    return zzyzVar;
                }
            }
            return zzyzVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(zzyz zzyzVar) {
        zzyz[] zzyzVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        zzyzVarArr[i] = zzyzVar;
        this.b--;
        notifyAll();
    }

    public final synchronized void d(@InterfaceC11300zs1 zzza zzzaVar) {
        while (zzzaVar != null) {
            try {
                zzyz[] zzyzVarArr = this.d;
                int i = this.c;
                this.c = i + 1;
                zzyzVarArr[i] = zzzaVar.c();
                this.b--;
                zzzaVar = zzzaVar.f();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            g();
        }
    }

    public final synchronized void g() {
        int i = this.a;
        String str = zzeu.a;
        int max = Math.max(0, ((i + 65535) / 65536) - this.b);
        int i2 = this.c;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.d, max, i2, (Object) null);
        this.c = max;
    }
}
