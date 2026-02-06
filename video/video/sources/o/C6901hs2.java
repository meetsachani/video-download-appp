package o;

import androidx.lifecycle.LiveData;
import o.RP1;

/* renamed from: o.hs2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6901hs2 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: o.hs2$a */
    /* loaded from: classes.dex */
    public static final class a<X> extends AbstractC8052mY0 implements HA0<X, C7458kA2> {
        public final /* synthetic */ C4511Vh1<X> X;
        public final /* synthetic */ RP1.a Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4511Vh1<X> c4511Vh1, RP1.a aVar) {
            super(1);
            this.X = c4511Vh1;
            this.Y = aVar;
        }

        public final void c(X x) {
            X f = this.X.f();
            if (!this.Y.X && ((f != null || x == null) && (f == null || C6562gT0.g(f, x)))) {
                return;
            }
            this.Y.X = false;
            this.X.r(x);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Object obj) {
            c(obj);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: o.hs2$b */
    /* loaded from: classes.dex */
    public static final class b<X> extends AbstractC8052mY0 implements HA0<X, C7458kA2> {
        public final /* synthetic */ C4511Vh1<Y> X;
        public final /* synthetic */ HA0<X, Y> Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4511Vh1<Y> c4511Vh1, HA0<X, Y> ha0) {
            super(1);
            this.X = c4511Vh1;
            this.Y = ha0;
        }

        public final void c(X x) {
            this.X.r(this.Y.invoke(x));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Object obj) {
            c(obj);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.hs2$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements HA0<Object, C7458kA2> {
        public final /* synthetic */ C4511Vh1<Object> X;
        public final /* synthetic */ InterfaceC6490gB0<Object, Object> Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4511Vh1<Object> c4511Vh1, InterfaceC6490gB0<Object, Object> interfaceC6490gB0) {
            super(1);
            this.X = c4511Vh1;
            this.Y = interfaceC6490gB0;
        }

        public final void c(Object obj) {
            this.X.r(this.Y.apply(obj));
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Object obj) {
            c(obj);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.hs2$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC3583Lt1, InterfaceC6733hB0 {
        public final /* synthetic */ HA0 a;

        public d(HA0 ha0) {
            C6562gT0.p(ha0, "function");
            this.a = ha0;
        }

        @Override // o.InterfaceC6733hB0
        public final InterfaceC5022aB0<?> a() {
            return this.a;
        }

        @Override // o.InterfaceC3583Lt1
        public final /* synthetic */ void b(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC3583Lt1) || !(obj instanceof InterfaceC6733hB0)) {
                return false;
            }
            return C6562gT0.g(a(), ((InterfaceC6733hB0) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: o.hs2$e */
    /* loaded from: classes.dex */
    public static final class e<X> implements InterfaceC3583Lt1<X> {
        public LiveData<Y> a;
        public final /* synthetic */ HA0<X, LiveData<Y>> b;
        public final /* synthetic */ C4511Vh1<Y> c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* renamed from: o.hs2$e$a */
        /* loaded from: classes.dex */
        public static final class a<Y> extends AbstractC8052mY0 implements HA0<Y, C7458kA2> {
            public final /* synthetic */ C4511Vh1<Y> X;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4511Vh1<Y> c4511Vh1) {
                super(1);
                this.X = c4511Vh1;
            }

            public final void c(Y y) {
                this.X.r(y);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.HA0
            public /* bridge */ /* synthetic */ C7458kA2 invoke(Object obj) {
                c(obj);
                return C7458kA2.a;
            }
        }

        public e(HA0<X, LiveData<Y>> ha0, C4511Vh1<Y> c4511Vh1) {
            this.b = ha0;
            this.c = c4511Vh1;
        }

        public final LiveData<Y> a() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC3583Lt1
        public void b(X x) {
            LiveData<Y> liveData = (LiveData) this.b.invoke(x);
            Object obj = this.a;
            if (obj != liveData) {
                if (obj != null) {
                    C4511Vh1<Y> c4511Vh1 = this.c;
                    C6562gT0.m(obj);
                    c4511Vh1.t(obj);
                }
                this.a = liveData;
                if (liveData != 0) {
                    C4511Vh1<Y> c4511Vh12 = this.c;
                    C6562gT0.m(liveData);
                    c4511Vh12.s(liveData, new d(new a(this.c)));
                }
            }
        }

        public final void c(LiveData<Y> liveData) {
            this.a = liveData;
        }
    }

    /* renamed from: o.hs2$f */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC3583Lt1<Object> {
        public LiveData<Object> a;
        public final /* synthetic */ InterfaceC6490gB0<Object, LiveData<Object>> b;
        public final /* synthetic */ C4511Vh1<Object> c;

        /* renamed from: o.hs2$f$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC8052mY0 implements HA0<Object, C7458kA2> {
            public final /* synthetic */ C4511Vh1<Object> X;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4511Vh1<Object> c4511Vh1) {
                super(1);
                this.X = c4511Vh1;
            }

            public final void c(Object obj) {
                this.X.r(obj);
            }

            @Override // o.HA0
            public /* bridge */ /* synthetic */ C7458kA2 invoke(Object obj) {
                c(obj);
                return C7458kA2.a;
            }
        }

        public f(InterfaceC6490gB0<Object, LiveData<Object>> interfaceC6490gB0, C4511Vh1<Object> c4511Vh1) {
            this.b = interfaceC6490gB0;
            this.c = c4511Vh1;
        }

        public final LiveData<Object> a() {
            return this.a;
        }

        @Override // o.InterfaceC3583Lt1
        public void b(Object obj) {
            LiveData<Object> apply = this.b.apply(obj);
            LiveData<Object> liveData = this.a;
            if (liveData != apply) {
                if (liveData != null) {
                    C4511Vh1<Object> c4511Vh1 = this.c;
                    C6562gT0.m(liveData);
                    c4511Vh1.t(liveData);
                }
                this.a = apply;
                if (apply != null) {
                    C4511Vh1<Object> c4511Vh12 = this.c;
                    C6562gT0.m(apply);
                    c4511Vh12.s(apply, new d(new a(this.c)));
                }
            }
        }

        public final void c(LiveData<Object> liveData) {
            this.a = liveData;
        }
    }

    public static final <X> LiveData<X> a(LiveData<X> liveData) {
        C6562gT0.p(liveData, "<this>");
        C4511Vh1 c4511Vh1 = new C4511Vh1();
        RP1.a aVar = new RP1.a();
        aVar.X = true;
        if (liveData.j()) {
            c4511Vh1.r(liveData.f());
            aVar.X = false;
        }
        c4511Vh1.s(liveData, new d(new a(c4511Vh1, aVar)));
        return c4511Vh1;
    }

    public static final <X, Y> LiveData<Y> b(LiveData<X> liveData, HA0<X, Y> ha0) {
        C6562gT0.p(liveData, "<this>");
        C6562gT0.p(ha0, "transform");
        C4511Vh1 c4511Vh1 = new C4511Vh1();
        c4511Vh1.s(liveData, new d(new b(c4511Vh1, ha0)));
        return c4511Vh1;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ LiveData c(LiveData liveData, InterfaceC6490gB0 interfaceC6490gB0) {
        C6562gT0.p(liveData, "<this>");
        C6562gT0.p(interfaceC6490gB0, "mapFunction");
        C4511Vh1 c4511Vh1 = new C4511Vh1();
        c4511Vh1.s(liveData, new d(new c(c4511Vh1, interfaceC6490gB0)));
        return c4511Vh1;
    }

    public static final <X, Y> LiveData<Y> d(LiveData<X> liveData, HA0<X, LiveData<Y>> ha0) {
        C6562gT0.p(liveData, "<this>");
        C6562gT0.p(ha0, "transform");
        C4511Vh1 c4511Vh1 = new C4511Vh1();
        c4511Vh1.s(liveData, new e(ha0, c4511Vh1));
        return c4511Vh1;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ LiveData e(LiveData liveData, InterfaceC6490gB0 interfaceC6490gB0) {
        C6562gT0.p(liveData, "<this>");
        C6562gT0.p(interfaceC6490gB0, "switchMapFunction");
        C4511Vh1 c4511Vh1 = new C4511Vh1();
        c4511Vh1.s(liveData, new f(interfaceC6490gB0, c4511Vh1));
        return c4511Vh1;
    }
}
