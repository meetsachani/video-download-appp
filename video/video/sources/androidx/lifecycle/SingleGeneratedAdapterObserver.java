package androidx.lifecycle;

import androidx.lifecycle.f;
import o.C6562gT0;
import o.KZ0;

/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements i {
    public final d X;

    public SingleGeneratedAdapterObserver(d dVar) {
        C6562gT0.p(dVar, "generatedAdapter");
        this.X = dVar;
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        this.X.a(kz0, aVar, false, null);
        this.X.a(kz0, aVar, true, null);
    }
}
