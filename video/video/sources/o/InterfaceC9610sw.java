package o;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
import o.T12;

/* renamed from: o.sw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9610sw extends InterfaceC9367rw {
    public static final InterfaceC9610sw a = new a();

    /* renamed from: o.sw$c */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b(List<C3597Ly> list);
    }

    void a(boolean z);

    void b(T12.b bVar);

    T12 c();

    InterfaceFutureC8411o11<List<Void>> e(List<C3597Ly> list, int i, int i2);

    Rect h();

    void i(int i);

    HJ k();

    void l(HJ hj);

    boolean n();

    int p();

    void q();

    /* renamed from: o.sw$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public C3588Lv X;

        public b(C3588Lv c3588Lv) {
            this.X = c3588Lv;
        }

        public C3588Lv a() {
            return this.X;
        }

        public b(C3588Lv c3588Lv, Throwable th) {
            super(th);
            this.X = c3588Lv;
        }
    }

    /* renamed from: o.sw$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC9610sw {
        @Override // o.InterfaceC9610sw
        public T12 c() {
            return T12.a();
        }

        @Override // o.InterfaceC9367rw
        public InterfaceFutureC8411o11<Void> d(float f) {
            return C7221jC0.h(null);
        }

        @Override // o.InterfaceC9610sw
        public InterfaceFutureC8411o11<List<Void>> e(List<C3597Ly> list, int i, int i2) {
            return C7221jC0.h(Collections.EMPTY_LIST);
        }

        @Override // o.InterfaceC9367rw
        public InterfaceFutureC8411o11<Void> f() {
            return C7221jC0.h(null);
        }

        @Override // o.InterfaceC9367rw
        public InterfaceFutureC8411o11<Void> g(float f) {
            return C7221jC0.h(null);
        }

        @Override // o.InterfaceC9610sw
        public Rect h() {
            return new Rect();
        }

        @Override // o.InterfaceC9367rw
        public InterfaceFutureC8411o11<Void> j(boolean z) {
            return C7221jC0.h(null);
        }

        @Override // o.InterfaceC9610sw
        public HJ k() {
            return null;
        }

        @Override // o.InterfaceC9367rw
        public InterfaceFutureC8411o11<C3788Nw0> m(C2602Bw0 c2602Bw0) {
            return C7221jC0.h(C3788Nw0.b());
        }

        @Override // o.InterfaceC9610sw
        public boolean n() {
            return false;
        }

        @Override // o.InterfaceC9367rw
        public InterfaceFutureC8411o11<Integer> o(int i) {
            return C7221jC0.h(0);
        }

        @Override // o.InterfaceC9610sw
        public int p() {
            return 2;
        }

        @Override // o.InterfaceC9610sw
        public void q() {
        }

        @Override // o.InterfaceC9610sw
        public void a(boolean z) {
        }

        @Override // o.InterfaceC9610sw
        public void b(T12.b bVar) {
        }

        @Override // o.InterfaceC9610sw
        public void i(int i) {
        }

        @Override // o.InterfaceC9610sw
        public void l(HJ hj) {
        }
    }

    default InterfaceC9610sw getImplementation() {
        return this;
    }
}
