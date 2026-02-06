package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.f;
import o.KZ0;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements i {
    public final Object X;
    public final b.a Y;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.X = obj;
        this.Y = b.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        this.Y.a(kz0, aVar, this.X);
    }
}
