package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.u;

/* renamed from: o.p6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8673p6 {

    /* renamed from: o.p6$a */
    /* loaded from: classes.dex */
    public static final class a implements FA0<GH2> {
        public final /* synthetic */ ComponentActivity X;

        public a(ComponentActivity componentActivity) {
            this.X = componentActivity;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final GH2 invoke() {
            return this.X.A();
        }
    }

    /* renamed from: o.p6$b */
    /* loaded from: classes.dex */
    public static final class b implements FA0<AbstractC6553gR> {
        public final /* synthetic */ ComponentActivity X;

        public b(ComponentActivity componentActivity) {
            this.X = componentActivity;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final AbstractC6553gR invoke() {
            return this.X.U();
        }
    }

    /* renamed from: o.p6$c */
    /* loaded from: classes.dex */
    public static final class c implements FA0<GH2> {
        public final /* synthetic */ ComponentActivity X;

        public c(ComponentActivity componentActivity) {
            this.X = componentActivity;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final GH2 invoke() {
            return this.X.A();
        }
    }

    /* renamed from: o.p6$d */
    /* loaded from: classes.dex */
    public static final class d implements FA0<AbstractC6553gR> {
        public final /* synthetic */ FA0<AbstractC6553gR> X;
        public final /* synthetic */ ComponentActivity Y;

        /* JADX WARN: Multi-variable type inference failed */
        public d(FA0<? extends AbstractC6553gR> fa0, ComponentActivity componentActivity) {
            this.X = fa0;
            this.Y = componentActivity;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final AbstractC6553gR invoke() {
            AbstractC6553gR invoke;
            FA0<AbstractC6553gR> fa0 = this.X;
            if (fa0 != null && (invoke = fa0.invoke()) != null) {
                return invoke;
            }
            return this.Y.U();
        }
    }

    /* renamed from: o.p6$e */
    /* loaded from: classes.dex */
    public static final class e implements FA0<u.b> {
        public final /* synthetic */ ComponentActivity X;

        public e(ComponentActivity componentActivity) {
            this.X = componentActivity;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final u.b invoke() {
            return this.X.T();
        }
    }

    /* renamed from: o.p6$f */
    /* loaded from: classes.dex */
    public static final class f implements FA0<u.b> {
        public final /* synthetic */ ComponentActivity X;

        public f(ComponentActivity componentActivity) {
            this.X = componentActivity;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final u.b invoke() {
            return this.X.T();
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends CH2> EY0<VM> a(ComponentActivity componentActivity, FA0<? extends u.b> fa0) {
        C6562gT0.p(componentActivity, "<this>");
        if (fa0 == null) {
            fa0 = new e(componentActivity);
        }
        C6562gT0.y(4, "VM");
        return new androidx.lifecycle.t(C6551gQ1.d(CH2.class), new a(componentActivity), fa0, new b(componentActivity));
    }

    public static final /* synthetic */ <VM extends CH2> EY0<VM> b(ComponentActivity componentActivity, FA0<? extends AbstractC6553gR> fa0, FA0<? extends u.b> fa02) {
        C6562gT0.p(componentActivity, "<this>");
        if (fa02 == null) {
            fa02 = new f(componentActivity);
        }
        C6562gT0.y(4, "VM");
        return new androidx.lifecycle.t(C6551gQ1.d(CH2.class), new c(componentActivity), fa02, new d(fa0, componentActivity));
    }

    public static /* synthetic */ EY0 c(ComponentActivity componentActivity, FA0 fa0, int i, Object obj) {
        if ((i & 1) != 0) {
            fa0 = null;
        }
        C6562gT0.p(componentActivity, "<this>");
        if (fa0 == null) {
            fa0 = new e(componentActivity);
        }
        C6562gT0.y(4, "VM");
        return new androidx.lifecycle.t(C6551gQ1.d(CH2.class), new a(componentActivity), fa0, new b(componentActivity));
    }

    public static /* synthetic */ EY0 d(ComponentActivity componentActivity, FA0 fa0, FA0 fa02, int i, Object obj) {
        if ((i & 1) != 0) {
            fa0 = null;
        }
        if ((i & 2) != 0) {
            fa02 = null;
        }
        C6562gT0.p(componentActivity, "<this>");
        if (fa02 == null) {
            fa02 = new f(componentActivity);
        }
        C6562gT0.y(4, "VM");
        return new androidx.lifecycle.t(C6551gQ1.d(CH2.class), new c(componentActivity), fa02, new d(fa0, componentActivity));
    }
}
