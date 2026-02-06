package androidx.lifecycle;

import androidx.lifecycle.f;
import o.C6562gT0;
import o.KX1;
import o.KZ0;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements i {
    public final KX1 X;

    public SavedStateHandleAttacher(KX1 kx1) {
        C6562gT0.p(kx1, "provider");
        this.X = kx1;
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_CREATE) {
            kz0.b().d(this);
            this.X.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
