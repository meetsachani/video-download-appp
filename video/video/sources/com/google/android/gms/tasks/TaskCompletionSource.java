package com.google.android.gms.tasks;

import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {
    public final zzw a = new zzw();

    public TaskCompletionSource() {
    }

    @InterfaceC5670cr1
    public Task<TResult> a() {
        return this.a;
    }

    public void b(@InterfaceC5670cr1 Exception exc) {
        this.a.y(exc);
    }

    public void c(@InterfaceC11300zs1 TResult tresult) {
        this.a.z(tresult);
    }

    public boolean d(@InterfaceC5670cr1 Exception exc) {
        return this.a.B(exc);
    }

    public boolean e(@InterfaceC11300zs1 TResult tresult) {
        return this.a.C(tresult);
    }

    public TaskCompletionSource(@InterfaceC5670cr1 CancellationToken cancellationToken) {
        cancellationToken.b(new zzs(this));
    }
}
