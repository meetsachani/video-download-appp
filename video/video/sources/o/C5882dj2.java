package o;

import java.io.Serializable;
import java.util.Map;

/* renamed from: o.dj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5882dj2<E> implements InterfaceC8705pE<E>, Serializable {
    private static final long serialVersionUID = 3518477308466486130L;
    public final KF1<? super E>[] X;
    public final InterfaceC8705pE<? super E>[] Y;
    public final InterfaceC8705pE<? super E> Z;

    public C5882dj2(boolean z, KF1<? super E>[] kf1Arr, InterfaceC8705pE<? super E>[] interfaceC8705pEArr, InterfaceC8705pE<? super E> interfaceC8705pE) {
        this.X = z ? RB0.e(kf1Arr) : kf1Arr;
        this.Y = z ? RB0.d(interfaceC8705pEArr) : interfaceC8705pEArr;
        this.Z = interfaceC8705pE == null ? C8115mo1.b() : interfaceC8705pE;
    }

    public static <E> InterfaceC8705pE<E> e(Map<KF1<E>, InterfaceC8705pE<E>> map) {
        if (map != null) {
            InterfaceC8705pE<E> remove = map.remove(null);
            int size = map.size();
            if (size == 0) {
                if (remove == null) {
                    return C8115mo1.b();
                }
                return remove;
            }
            InterfaceC8705pE[] interfaceC8705pEArr = new InterfaceC8705pE[size];
            KF1[] kf1Arr = new KF1[size];
            int i = 0;
            for (Map.Entry<KF1<E>, InterfaceC8705pE<E>> entry : map.entrySet()) {
                kf1Arr[i] = entry.getKey();
                interfaceC8705pEArr[i] = entry.getValue();
                i++;
            }
            return new C5882dj2(false, kf1Arr, interfaceC8705pEArr, remove);
        }
        throw new NullPointerException("The predicate and closure map must not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> InterfaceC8705pE<E> f(KF1<? super E>[] kf1Arr, InterfaceC8705pE<? super E>[] interfaceC8705pEArr, InterfaceC8705pE<? super E> interfaceC8705pE) {
        RB0.h(kf1Arr);
        RB0.g(interfaceC8705pEArr);
        if (kf1Arr.length == interfaceC8705pEArr.length) {
            if (kf1Arr.length == 0) {
                if (interfaceC8705pE == 0) {
                    return C8115mo1.b();
                }
                return interfaceC8705pE;
            }
            return new C5882dj2(kf1Arr, interfaceC8705pEArr, interfaceC8705pE);
        }
        throw new IllegalArgumentException("The predicate and closure arrays must be the same size");
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        int i = 0;
        while (true) {
            KF1<? super E>[] kf1Arr = this.X;
            if (i < kf1Arr.length) {
                if (kf1Arr[i].evaluate(e)) {
                    this.Y[i].a(e);
                    return;
                }
                i++;
            } else {
                this.Z.a(e);
                return;
            }
        }
    }

    public InterfaceC8705pE<? super E>[] b() {
        return RB0.d(this.Y);
    }

    public InterfaceC8705pE<? super E> c() {
        return this.Z;
    }

    public KF1<? super E>[] d() {
        return RB0.e(this.X);
    }

    public C5882dj2(KF1<? super E>[] kf1Arr, InterfaceC8705pE<? super E>[] interfaceC8705pEArr, InterfaceC8705pE<? super E> interfaceC8705pE) {
        this(true, kf1Arr, interfaceC8705pEArr, interfaceC8705pE);
    }
}
