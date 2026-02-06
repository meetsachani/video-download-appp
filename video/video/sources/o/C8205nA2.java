package o;

import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.nA2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8205nA2<Model> implements InterfaceC7595kk1<Model, Model> {
    public static final C8205nA2<?> a = new C8205nA2<>();

    public static <T> C8205nA2<T> c() {
        return (C8205nA2<T>) a;
    }

    @Override // o.InterfaceC7595kk1
    public boolean a(Model model) {
        return true;
    }

    @Override // o.InterfaceC7595kk1
    public InterfaceC7595kk1.a<Model> b(Model model, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(model), new b(model));
    }

    /* renamed from: o.nA2$a */
    /* loaded from: classes.dex */
    public static class a<Model> implements InterfaceC7838lk1<Model, Model> {
        public static final a<?> a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Model, Model> e(C5650cm1 c5650cm1) {
            return C8205nA2.c();
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.nA2$b */
    /* loaded from: classes.dex */
    public static class b<Model> implements InterfaceC9990uU<Model> {
        public final Model X;

        public b(Model model) {
            this.X = model;
        }

        @Override // o.InterfaceC9990uU
        public Class<Model> a() {
            return (Class<Model>) this.X.getClass();
        }

        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super Model> aVar) {
            aVar.f((Model) this.X);
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return GU.LOCAL;
        }

        @Override // o.InterfaceC9990uU
        public void b() {
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
        }
    }
}
