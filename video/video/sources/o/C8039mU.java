package o;

/* renamed from: o.mU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8039mU<T> extends AbstractC8311nc2<T> {
    public final T a;
    public final int b;

    public C8039mU(T t, int i) {
        super(null);
        this.a = t;
        this.b = i;
    }

    public final void a() {
        int i;
        T t = this.a;
        boolean z = false;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        if (i == this.b) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
    }

    public final int b() {
        return this.b;
    }

    public final T c() {
        return this.a;
    }
}
