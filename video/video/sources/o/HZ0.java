package o;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;

/* loaded from: classes.dex */
public final class HZ0 {
    public static final GZ0 a(androidx.lifecycle.f fVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C6562gT0.p(fVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) fVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(fVar, C8088mh2.c(null, 1, null).M(C8909q40.e().b0()));
        } while (!C6515gH1.a(fVar.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.f();
        return lifecycleCoroutineScopeImpl;
    }
}
