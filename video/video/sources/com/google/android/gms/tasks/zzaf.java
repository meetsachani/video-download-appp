package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaf<T> implements zzae<T> {
    public final Object a = new Object();
    public final int b;
    public final zzw c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public zzaf(int i, zzw zzwVar) {
        this.b = i;
        this.c = zzwVar;
    }

    private final void c() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                zzw zzwVar = this.c;
                int i = this.e;
                int i2 = this.b;
                zzwVar.y(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.g));
            } else if (this.h) {
                this.c.A();
            } else {
                this.c.z(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void a(T t) {
        synchronized (this.a) {
            this.d++;
            c();
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            c();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void e(@InterfaceC5670cr1 Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            c();
        }
    }
}
