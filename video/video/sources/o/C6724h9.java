package o;

import android.app.Application;

/* renamed from: o.h9  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6724h9 extends CH2 {
    public final Application d;

    public C6724h9(Application application) {
        C6562gT0.p(application, "application");
        this.d = application;
    }

    public <T extends Application> T g() {
        T t = (T) this.d;
        C6562gT0.n(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
