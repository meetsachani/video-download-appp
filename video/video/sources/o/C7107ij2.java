package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.ij2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7107ij2<I, O> implements InterfaceC3287Is2<I, O>, Serializable {
    private static final long serialVersionUID = -6404460890903469332L;
    public final KF1<? super I>[] X;
    public final InterfaceC3287Is2<? super I, ? extends O>[] Y;
    public final InterfaceC3287Is2<? super I, ? extends O> Z;

    public C7107ij2(boolean z, KF1<? super I>[] kf1Arr, InterfaceC3287Is2<? super I, ? extends O>[] interfaceC3287Is2Arr, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        this.X = z ? RB0.e(kf1Arr) : kf1Arr;
        this.Y = z ? RB0.f(interfaceC3287Is2Arr) : interfaceC3287Is2Arr;
        this.Z = interfaceC3287Is2 == null ? C9950uK.d() : interfaceC3287Is2;
    }

    public static <I, O> InterfaceC3287Is2<I, O> e(Map<? extends KF1<? super I>, ? extends InterfaceC3287Is2<? super I, ? extends O>> map) {
        if (map != null) {
            if (map.size() == 0) {
                return C9950uK.d();
            }
            InterfaceC3287Is2<I, O> interfaceC3287Is2 = (InterfaceC3287Is2) ((InterfaceC3287Is2<? super I, ? extends O>) map.remove(null));
            int size = map.size();
            if (size == 0) {
                if (interfaceC3287Is2 == null) {
                    return C9950uK.d();
                }
                return interfaceC3287Is2;
            }
            InterfaceC3287Is2[] interfaceC3287Is2Arr = new InterfaceC3287Is2[size];
            KF1[] kf1Arr = new KF1[size];
            int i = 0;
            for (Map.Entry<? extends KF1<? super I>, ? extends InterfaceC3287Is2<? super I, ? extends O>> entry : map.entrySet()) {
                kf1Arr[i] = entry.getKey();
                interfaceC3287Is2Arr[i] = entry.getValue();
                i++;
            }
            return new C7107ij2(false, kf1Arr, interfaceC3287Is2Arr, interfaceC3287Is2);
        }
        throw new NullPointerException("The predicate and transformer map must not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <I, O> InterfaceC3287Is2<I, O> f(KF1<? super I>[] kf1Arr, InterfaceC3287Is2<? super I, ? extends O>[] interfaceC3287Is2Arr, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        RB0.h(kf1Arr);
        RB0.i(interfaceC3287Is2Arr);
        if (kf1Arr.length == interfaceC3287Is2Arr.length) {
            if (kf1Arr.length == 0) {
                if (interfaceC3287Is2 == 0) {
                    return C9950uK.d();
                }
                return interfaceC3287Is2;
            }
            return new C7107ij2(kf1Arr, interfaceC3287Is2Arr, interfaceC3287Is2);
        }
        throw new IllegalArgumentException("The predicate and transformer arrays must be the same size");
    }

    @Override // o.InterfaceC3287Is2
    public O a(I i) {
        int i2 = 0;
        while (true) {
            KF1<? super I>[] kf1Arr = this.X;
            if (i2 < kf1Arr.length) {
                if (kf1Arr[i2].evaluate(i)) {
                    return this.Y[i2].a(i);
                }
                i2++;
            } else {
                return this.Z.a(i);
            }
        }
    }

    public InterfaceC3287Is2<? super I, ? extends O> b() {
        return this.Z;
    }

    public KF1<? super I>[] c() {
        return RB0.e(this.X);
    }

    public InterfaceC3287Is2<? super I, ? extends O>[] d() {
        return RB0.f(this.Y);
    }

    public C7107ij2(KF1<? super I>[] kf1Arr, InterfaceC3287Is2<? super I, ? extends O>[] interfaceC3287Is2Arr, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2) {
        this(true, kf1Arr, interfaceC3287Is2Arr, interfaceC3287Is2);
    }
}
