package o;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class RU {
    public static final RU a = new RU();

    public static /* synthetic */ PU e(RU ru, B12 b12, HR1 hr1, List list, InterfaceC9974uQ interfaceC9974uQ, FA0 fa0, int i, Object obj) {
        if ((i & 2) != 0) {
            hr1 = null;
        }
        if ((i & 4) != 0) {
            list = C8222nF.H();
        }
        if ((i & 8) != 0) {
            C8909q40 c8909q40 = C8909q40.a;
            interfaceC9974uQ = C10217vQ.a(C8909q40.c().M(C8088mh2.c(null, 1, null)));
        }
        return ru.b(b12, hr1, list, interfaceC9974uQ, fa0);
    }

    public final <T> PU<T> a(B12<T> b12, FA0<? extends File> fa0) {
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(fa0, "produceFile");
        return e(this, b12, null, null, null, fa0, 14, null);
    }

    public final <T> PU<T> b(B12<T> b12, HR1<T> hr1, List<? extends AU<T>> list, InterfaceC9974uQ interfaceC9974uQ, FA0<? extends File> fa0) {
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(list, "migrations");
        C6562gT0.p(interfaceC9974uQ, "scope");
        C6562gT0.p(fa0, "produceFile");
        if (hr1 == null) {
            hr1 = (HR1<T>) new C3180Hq1();
        }
        return new C9662t82(fa0, b12, C7979mF.k(BU.a.b(list)), hr1, interfaceC9974uQ);
    }

    public final <T> PU<T> c(B12<T> b12, HR1<T> hr1, List<? extends AU<T>> list, FA0<? extends File> fa0) {
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(list, "migrations");
        C6562gT0.p(fa0, "produceFile");
        return e(this, b12, hr1, list, null, fa0, 8, null);
    }

    public final <T> PU<T> d(B12<T> b12, HR1<T> hr1, FA0<? extends File> fa0) {
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(fa0, "produceFile");
        return e(this, b12, hr1, null, null, fa0, 12, null);
    }
}
