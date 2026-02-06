package o;

import o.InterfaceC8136mt2;

/* renamed from: o.Nq1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3767Nq1<R> implements InterfaceC8136mt2<R> {
    public static final C3767Nq1<?> a = new C3767Nq1<>();
    public static final InterfaceC9109qt2<?> b = new a();

    /* renamed from: o.Nq1$a */
    /* loaded from: classes.dex */
    public static class a<R> implements InterfaceC9109qt2<R> {
        @Override // o.InterfaceC9109qt2
        public InterfaceC8136mt2<R> a(GU gu, boolean z) {
            return C3767Nq1.a;
        }
    }

    public static <R> InterfaceC8136mt2<R> b() {
        return a;
    }

    public static <R> InterfaceC9109qt2<R> c() {
        return (InterfaceC9109qt2<R>) b;
    }

    @Override // o.InterfaceC8136mt2
    public boolean a(Object obj, InterfaceC8136mt2.a aVar) {
        return false;
    }
}
