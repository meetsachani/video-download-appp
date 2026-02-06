package o;

import android.os.Handler;
import java.io.IOException;
import o.C10415wE;

@Deprecated
/* renamed from: o.kh1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC7583kh1 {

    /* renamed from: o.kh1$b */
    /* loaded from: classes2.dex */
    public static final class b extends C4604Wg1 {
        public b(Object obj) {
            super(obj);
        }

        @Override // o.C4604Wg1
        /* renamed from: d */
        public b a(Object obj) {
            return new b(super.a(obj));
        }

        @Override // o.C4604Wg1
        /* renamed from: e */
        public b b(long j) {
            return new b(super.b(j));
        }

        public b(Object obj, long j) {
            super(obj, j);
        }

        public b(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public b(C4604Wg1 c4604Wg1) {
            super(c4604Wg1);
        }
    }

    /* renamed from: o.kh1$c */
    /* loaded from: classes2.dex */
    public interface c {
        void L(InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2);
    }

    void A(c cVar);

    void G(c cVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, ND1 nd1);

    void Q() throws IOException;

    default boolean R() {
        return true;
    }

    @InterfaceC11300zs1
    default AbstractC7373jp2 S() {
        return null;
    }

    void T(c cVar);

    void U(InterfaceC9309rh1 interfaceC9309rh1);

    void V(Handler handler, InterfaceC9309rh1 interfaceC9309rh1);

    @Deprecated
    default void a(c cVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        G(cVar, interfaceC4261Sr2, ND1.b);
    }

    InterfaceC4410Ug1 h(b bVar, InterfaceC10877y8 interfaceC10877y8, long j);

    C8322nf1 k();

    void m(Handler handler, InterfaceC8921q70 interfaceC8921q70);

    void o(InterfaceC8921q70 interfaceC8921q70);

    void s(InterfaceC4410Ug1 interfaceC4410Ug1);

    void u(c cVar);

    /* renamed from: o.kh1$a */
    /* loaded from: classes2.dex */
    public interface a {
        public static final a a = InterfaceC9552sh1.b;

        a a(M11 m11);

        int[] b();

        a d(InterfaceC9656t70 interfaceC9656t70);

        InterfaceC7583kh1 e(C8322nf1 c8322nf1);

        default a c(C10415wE.b bVar) {
            return this;
        }
    }
}
