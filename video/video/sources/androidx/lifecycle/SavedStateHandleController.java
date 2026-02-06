package androidx.lifecycle;

import androidx.lifecycle.f;
import o.C6562gT0;
import o.KZ0;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements i {
    public final String X;
    public final p Y;
    public boolean Z;

    public SavedStateHandleController(String str, p pVar) {
        C6562gT0.p(str, "key");
        C6562gT0.p(pVar, "handle");
        this.X = str;
        this.Y = pVar;
    }

    public final void a(androidx.savedstate.a aVar, f fVar) {
        C6562gT0.p(aVar, "registry");
        C6562gT0.p(fVar, "lifecycle");
        if (!this.Z) {
            this.Z = true;
            fVar.a(this);
            aVar.j(this.X, this.Y.o());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final p b() {
        return this.Y;
    }

    public final boolean c() {
        return this.Z;
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        if (aVar == f.a.ON_DESTROY) {
            this.Z = false;
            kz0.b().d(this);
        }
    }
}
