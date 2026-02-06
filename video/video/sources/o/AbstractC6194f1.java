package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.f1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6194f1<T> implements Iterator<T> {
    public b X = b.NOT_READY;
    @MB
    public T Y;

    /* renamed from: o.f1$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.f1$b */
    /* loaded from: classes3.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @MB
    public abstract T b();

    @InterfaceC6181ey
    @MB
    public final T c() {
        this.X = b.DONE;
        return null;
    }

    public final boolean d() {
        this.X = b.FAILED;
        this.Y = b();
        if (this.X != b.DONE) {
            this.X = b.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.X != b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        int i = a.a[this.X.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return d();
    }

    @Override // java.util.Iterator
    @InterfaceC9863ty1
    public final T next() {
        if (hasNext()) {
            this.X = b.NOT_READY;
            T t = (T) C2687Cs1.a(this.Y);
            this.Y = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
