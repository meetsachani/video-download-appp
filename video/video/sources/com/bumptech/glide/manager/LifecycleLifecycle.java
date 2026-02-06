package com.bumptech.glide.manager;

import androidx.lifecycle.f;
import androidx.lifecycle.l;
import java.util.HashSet;
import java.util.Set;
import o.CZ0;
import o.IZ0;
import o.JZ0;
import o.KZ0;
import o.SD2;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements CZ0, JZ0 {
    public final Set<IZ0> X = new HashSet();
    public final f Y;

    public LifecycleLifecycle(f fVar) {
        this.Y = fVar;
        fVar.a(this);
    }

    @Override // o.CZ0
    public void a(IZ0 iz0) {
        this.X.add(iz0);
        if (this.Y.b() == f.b.DESTROYED) {
            iz0.onDestroy();
        } else if (this.Y.b().g(f.b.STARTED)) {
            iz0.onStart();
        } else {
            iz0.onStop();
        }
    }

    @Override // o.CZ0
    public void b(IZ0 iz0) {
        this.X.remove(iz0);
    }

    @l(f.a.ON_DESTROY)
    public void onDestroy(KZ0 kz0) {
        for (IZ0 iz0 : SD2.l(this.X)) {
            iz0.onDestroy();
        }
        kz0.b().d(this);
    }

    @l(f.a.ON_START)
    public void onStart(KZ0 kz0) {
        for (IZ0 iz0 : SD2.l(this.X)) {
            iz0.onStart();
        }
    }

    @l(f.a.ON_STOP)
    public void onStop(KZ0 kz0) {
        for (IZ0 iz0 : SD2.l(this.X)) {
            iz0.onStop();
        }
    }
}
