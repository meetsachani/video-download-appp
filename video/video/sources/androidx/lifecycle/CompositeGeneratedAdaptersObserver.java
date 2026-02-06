package androidx.lifecycle;

import androidx.lifecycle.f;
import o.C10289vj1;
import o.C6562gT0;
import o.KZ0;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements i {
    public final d[] X;

    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        C6562gT0.p(dVarArr, "generatedAdapters");
        this.X = dVarArr;
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        C10289vj1 c10289vj1 = new C10289vj1();
        for (d dVar : this.X) {
            dVar.a(kz0, aVar, false, c10289vj1);
        }
        for (d dVar2 : this.X) {
            dVar2.a(kz0, aVar, true, c10289vj1);
        }
    }
}
