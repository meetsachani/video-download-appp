package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import o.AbstractC6949i41;
import o.MP0;
import o.YM2;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements MP0<YM2> {
    public static final String a = AbstractC6949i41.f("WrkMgrInitializer");

    @Override // o.MP0
    /* renamed from: a */
    public YM2 create(Context context) {
        AbstractC6949i41.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        YM2.A(context, new a.b().a());
        return YM2.p(context);
    }

    @Override // o.MP0
    public List<Class<? extends MP0<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
