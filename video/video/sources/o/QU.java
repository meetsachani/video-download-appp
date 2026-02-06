package o;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class QU {

    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Context, List<? extends AU<Object>>> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final List<AU<Object>> invoke(Context context) {
            C6562gT0.p(context, "it");
            return C8222nF.H();
        }
    }

    public static final <T> InterfaceC11186zO1<Context, PU<T>> a(String str, B12<T> b12, HR1<T> hr1, HA0<? super Context, ? extends List<? extends AU<T>>> ha0, InterfaceC9974uQ interfaceC9974uQ) {
        C6562gT0.p(str, "fileName");
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(ha0, "produceMigrations");
        C6562gT0.p(interfaceC9974uQ, "scope");
        return new TU(str, b12, hr1, ha0, interfaceC9974uQ);
    }

    public static /* synthetic */ InterfaceC11186zO1 b(String str, B12 b12, HR1 hr1, HA0 ha0, InterfaceC9974uQ interfaceC9974uQ, int i, Object obj) {
        if ((i & 4) != 0) {
            hr1 = null;
        }
        if ((i & 8) != 0) {
            ha0 = a.X;
        }
        if ((i & 16) != 0) {
            C8909q40 c8909q40 = C8909q40.a;
            interfaceC9974uQ = C10217vQ.a(C8909q40.c().M(C8088mh2.c(null, 1, null)));
        }
        return a(str, b12, hr1, ha0, interfaceC9974uQ);
    }
}
