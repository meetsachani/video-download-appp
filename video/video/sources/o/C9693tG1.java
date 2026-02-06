package o;

import java.io.File;
import java.util.List;

/* renamed from: o.tG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9693tG1 {
    public static final C9693tG1 a = new C9693tG1();

    /* renamed from: o.tG1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<File> {
        public final /* synthetic */ FA0<File> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FA0<? extends File> fa0) {
            super(0);
            this.X = fa0;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final File invoke() {
            File invoke = this.X.invoke();
            String f0 = C6652gr0.f0(invoke);
            DG1 dg1 = DG1.a;
            if (C6562gT0.g(f0, dg1.e())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + dg1.e()).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PU e(C9693tG1 c9693tG1, HR1 hr1, List list, InterfaceC9974uQ interfaceC9974uQ, FA0 fa0, int i, Object obj) {
        if ((i & 1) != 0) {
            hr1 = null;
        }
        if ((i & 2) != 0) {
            list = C8222nF.H();
        }
        if ((i & 4) != 0) {
            C8909q40 c8909q40 = C8909q40.a;
            interfaceC9974uQ = C10217vQ.a(C8909q40.c().M(C8088mh2.c(null, 1, null)));
        }
        return c9693tG1.b(hr1, list, interfaceC9974uQ, fa0);
    }

    public final PU<AbstractC10668xG1> a(FA0<? extends File> fa0) {
        C6562gT0.p(fa0, "produceFile");
        return e(this, null, null, null, fa0, 7, null);
    }

    public final PU<AbstractC10668xG1> b(HR1<AbstractC10668xG1> hr1, List<? extends AU<AbstractC10668xG1>> list, InterfaceC9974uQ interfaceC9974uQ, FA0<? extends File> fa0) {
        C6562gT0.p(list, "migrations");
        C6562gT0.p(interfaceC9974uQ, "scope");
        C6562gT0.p(fa0, "produceFile");
        return new C9207rG1(RU.a.b(DG1.a, hr1, list, interfaceC9974uQ, new a(fa0)));
    }

    public final PU<AbstractC10668xG1> c(HR1<AbstractC10668xG1> hr1, List<? extends AU<AbstractC10668xG1>> list, FA0<? extends File> fa0) {
        C6562gT0.p(list, "migrations");
        C6562gT0.p(fa0, "produceFile");
        return e(this, hr1, list, null, fa0, 4, null);
    }

    public final PU<AbstractC10668xG1> d(HR1<AbstractC10668xG1> hr1, FA0<? extends File> fa0) {
        C6562gT0.p(fa0, "produceFile");
        return e(this, hr1, null, null, fa0, 6, null);
    }
}
