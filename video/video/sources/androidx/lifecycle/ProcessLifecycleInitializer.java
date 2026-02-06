package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.n;
import java.util.List;
import o.C6562gT0;
import o.C8222nF;
import o.C8312nd;
import o.KZ0;
import o.MP0;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements MP0<KZ0> {
    @Override // o.MP0
    /* renamed from: a */
    public KZ0 create(Context context) {
        C6562gT0.p(context, "context");
        C8312nd e = C8312nd.e(context);
        C6562gT0.o(e, "getInstance(context)");
        if (e.g(ProcessLifecycleInitializer.class)) {
            h.a(context);
            n.b bVar = n.d1;
            bVar.c(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }

    @Override // o.MP0
    public List<Class<? extends MP0<?>>> dependencies() {
        return C8222nF.H();
    }
}
