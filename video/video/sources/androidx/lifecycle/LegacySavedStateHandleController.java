package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.f;
import androidx.savedstate.a;
import o.C6562gT0;
import o.CH2;
import o.GH2;
import o.HH2;
import o.InterfaceC9511sW0;
import o.KZ0;
import o.OX1;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController a = new LegacySavedStateHandleController();
    public static final String b = "androidx.lifecycle.savedstate.vm.tag";

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0051a {
        @Override // androidx.savedstate.a.InterfaceC0051a
        public void a(OX1 ox1) {
            C6562gT0.p(ox1, "owner");
            if (ox1 instanceof HH2) {
                GH2 A = ((HH2) ox1).A();
                androidx.savedstate.a E = ox1.E();
                for (String str : A.c()) {
                    CH2 b = A.b(str);
                    C6562gT0.m(b);
                    LegacySavedStateHandleController.a(b, E, ox1.b());
                }
                if (!A.c().isEmpty()) {
                    E.k(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    @InterfaceC9511sW0
    public static final void a(CH2 ch2, androidx.savedstate.a aVar, f fVar) {
        C6562gT0.p(ch2, "viewModel");
        C6562gT0.p(aVar, "registry");
        C6562gT0.p(fVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) ch2.d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.c()) {
            savedStateHandleController.a(aVar, fVar);
            a.c(aVar, fVar);
        }
    }

    @InterfaceC9511sW0
    public static final SavedStateHandleController b(androidx.savedstate.a aVar, f fVar, String str, Bundle bundle) {
        C6562gT0.p(aVar, "registry");
        C6562gT0.p(fVar, "lifecycle");
        C6562gT0.m(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, p.f.a(aVar.b(str), bundle));
        savedStateHandleController.a(aVar, fVar);
        a.c(aVar, fVar);
        return savedStateHandleController;
    }

    public final void c(final androidx.savedstate.a aVar, final f fVar) {
        f.b b2 = fVar.b();
        if (b2 != f.b.INITIALIZED && !b2.g(f.b.STARTED)) {
            fVar.a(new i() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.i
                public void i(KZ0 kz0, f.a aVar2) {
                    C6562gT0.p(kz0, "source");
                    C6562gT0.p(aVar2, "event");
                    if (aVar2 == f.a.ON_START) {
                        f.this.d(this);
                        aVar.k(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        } else {
            aVar.k(a.class);
        }
    }
}
