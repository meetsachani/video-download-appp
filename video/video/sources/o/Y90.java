package o;

import java.util.Comparator;
import java.util.Map;
import o.C3743Nk1;

@NN0
@InterfaceC7070ia0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class Y90<T> {
    public final b a;
    @MB
    public final Comparator<T> b;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.INSERTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.SORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public Y90(b bVar, @MB Comparator<T> comparator) {
        boolean z;
        boolean z2;
        this.a = (b) C10664xF1.E(bVar);
        this.b = comparator;
        if (bVar == b.SORTED) {
            z = true;
        } else {
            z = false;
        }
        if (comparator != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z == z2);
    }

    public static <S> Y90<S> d() {
        return new Y90<>(b.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> Y90<S> e() {
        return new Y90<>(b.SORTED, AbstractC10587ww1.z());
    }

    public static <S> Y90<S> f(Comparator<S> comparator) {
        return new Y90<>(b.SORTED, (Comparator) C10664xF1.E(comparator));
    }

    public static <S> Y90<S> g() {
        return new Y90<>(b.STABLE, null);
    }

    public static <S> Y90<S> i() {
        return new Y90<>(b.UNORDERED, null);
    }

    public Comparator<T> b() {
        Comparator<T> comparator = this.b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public <K extends T, V> Map<K, V> c(int i) {
        int i2 = a.a[this.a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    return C7935m81.g0(b());
                }
                throw new AssertionError();
            }
            return C7935m81.e0(i);
        }
        return C7935m81.a0(i);
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y90)) {
            return false;
        }
        Y90 y90 = (Y90) obj;
        if (this.a == y90.a && C2593Bt1.a(this.b, y90.b)) {
            return true;
        }
        return false;
    }

    public b h() {
        return this.a;
    }

    public int hashCode() {
        return C2593Bt1.b(this.a, this.b);
    }

    public String toString() {
        C3743Nk1.b f = C3743Nk1.c(this).f("type", this.a);
        Comparator<T> comparator = this.b;
        if (comparator != null) {
            f.f("comparator", comparator);
        }
        return f.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T1 extends T> Y90<T1> a() {
        return this;
    }
}
