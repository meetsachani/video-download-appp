package o;

import java.util.Comparator;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.sH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9452sH {
    public static final AbstractC9452sH a = new a();
    public static final AbstractC9452sH b = new b(-1);
    public static final AbstractC9452sH c = new b(1);

    /* renamed from: o.sH$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC9452sH {
        public a() {
            super(null);
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH d(double d, double d2) {
            return o(Double.compare(d, d2));
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH e(float f, float f2) {
            return o(Float.compare(f, f2));
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH f(int i, int i2) {
            return o(C7775lT0.e(i, i2));
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH g(long j, long j2) {
            return o(C7194j51.d(j, j2));
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH i(Comparable<?> comparable, Comparable<?> comparable2) {
            return o(comparable.compareTo(comparable2));
        }

        @Override // o.AbstractC9452sH
        public <T> AbstractC9452sH j(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2, Comparator<T> comparator) {
            return o(comparator.compare(t, t2));
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH k(boolean z, boolean z2) {
            return o(C4049Qo.d(z, z2));
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH l(boolean z, boolean z2) {
            return o(C4049Qo.d(z2, z));
        }

        @Override // o.AbstractC9452sH
        public int m() {
            return 0;
        }

        public AbstractC9452sH o(int i) {
            if (i < 0) {
                return AbstractC9452sH.b;
            }
            return i > 0 ? AbstractC9452sH.c : AbstractC9452sH.a;
        }
    }

    public /* synthetic */ AbstractC9452sH(a aVar) {
        this();
    }

    public static AbstractC9452sH n() {
        return a;
    }

    public abstract AbstractC9452sH d(double d, double d2);

    public abstract AbstractC9452sH e(float f, float f2);

    public abstract AbstractC9452sH f(int i, int i2);

    public abstract AbstractC9452sH g(long j, long j2);

    @Deprecated
    public final AbstractC9452sH h(Boolean bool, Boolean bool2) {
        return k(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract AbstractC9452sH i(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> AbstractC9452sH j(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2, Comparator<T> comparator);

    public abstract AbstractC9452sH k(boolean z, boolean z2);

    public abstract AbstractC9452sH l(boolean z, boolean z2);

    public abstract int m();

    public AbstractC9452sH() {
    }

    /* renamed from: o.sH$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9452sH {
        public final int d;

        public b(int i) {
            super(null);
            this.d = i;
        }

        @Override // o.AbstractC9452sH
        public int m() {
            return this.d;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH d(double d, double d2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH e(float f, float f2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH f(int i, int i2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH g(long j, long j2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH i(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH k(boolean z, boolean z2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public AbstractC9452sH l(boolean z, boolean z2) {
            return this;
        }

        @Override // o.AbstractC9452sH
        public <T> AbstractC9452sH j(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
