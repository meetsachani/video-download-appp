package androidx.activity;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import o.AbstractC2891Eu1;
import o.AbstractC4442Uo1;
import o.C4248So1;
import o.C6210f5;
import o.C6562gT0;
import o.KZ0;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$addCallback$lifecycleObserver$1 implements i, AutoCloseable {
    public final /* synthetic */ AbstractC4442Uo1<?> X;
    public final /* synthetic */ AbstractC2891Eu1 Y;
    public final /* synthetic */ f Y0;
    public final /* synthetic */ OnBackPressedDispatcher Z;

    public OnBackPressedDispatcher$addCallback$lifecycleObserver$1(AbstractC4442Uo1<?> abstractC4442Uo1, AbstractC2891Eu1 abstractC2891Eu1, OnBackPressedDispatcher onBackPressedDispatcher, f fVar) {
        this.X = abstractC4442Uo1;
        this.Y = abstractC2891Eu1;
        this.Z = onBackPressedDispatcher;
        this.Y0 = fVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.Y0.d(this);
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        boolean z = false;
        if (C6210f5.b) {
            AbstractC4442Uo1<?> abstractC4442Uo1 = this.X;
            if (aVar.i().g(f.b.STARTED) && this.Y.g()) {
                z = true;
            }
            abstractC4442Uo1.y(z);
        } else if (aVar == f.a.ON_START) {
            C4248So1.c(this.Z.j(), this.X, 0, 2, null);
        } else if (aVar == f.a.ON_STOP) {
            this.X.x();
        }
        if (aVar == f.a.ON_DESTROY) {
            this.X.x();
            this.Y0.d(this);
        }
    }
}
