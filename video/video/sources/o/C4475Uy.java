package o;

import android.hardware.camera2.CaptureRequest;
import o.C4475Uy;
import o.HJ;

/* renamed from: o.Uy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4475Uy implements CO1 {
    public final HJ K;

    /* renamed from: o.Uy$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC10288vj0<C4475Uy> {
        public final C2569Bn1 a = C2569Bn1.u0();

        public static /* synthetic */ boolean c(a aVar, HJ hj, HJ.a aVar2) {
            aVar.e().M(aVar2, hj.i(aVar2), hj.j(aVar2));
            return true;
        }

        public static a h(final HJ hj) {
            final a aVar = new a();
            hj.k(C2598Bv.L, new HJ.b() { // from class: o.Ty
                @Override // o.HJ.b
                public final boolean a(HJ.a aVar2) {
                    return C4475Uy.a.c(C4475Uy.a.this, hj, aVar2);
                }
            });
            return aVar;
        }

        @Override // o.InterfaceC10288vj0
        public InterfaceC3849Om1 e() {
            return this.a;
        }

        @Override // o.InterfaceC10288vj0
        /* renamed from: f */
        public C4475Uy build() {
            return new C4475Uy(C5932dw1.t0(this.a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a g(CaptureRequest.Key<ValueT> key) {
            this.a.Q(C2598Bv.t0(key));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a k(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.a.h0(C2598Bv.t0(key), valuet);
            return this;
        }
    }

    public C4475Uy(HJ hj) {
        this.K = hj;
    }

    @Override // o.CO1
    public HJ d() {
        return this.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT r0(CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.K.h(C2598Bv.t0(key), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT s0(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return (ValueT) this.K.h(C2598Bv.t0(key), valuet);
    }
}
