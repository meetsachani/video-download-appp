package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Nj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3740Nj2<T> implements EY0<T>, Serializable {
    @Nullable
    public FA0<? extends T> X;
    @Nullable
    public volatile Object Y;
    @NotNull
    public final Object Z;

    public C3740Nj2(@NotNull FA0<? extends T> fa0, @Nullable Object obj) {
        C6562gT0.p(fa0, "initializer");
        this.X = fa0;
        this.Y = Bx2.a;
        this.Z = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new KP0(getValue());
    }

    @Override // o.EY0
    public T getValue() {
        T t;
        T t2 = (T) this.Y;
        Bx2 bx2 = Bx2.a;
        if (t2 != bx2) {
            return t2;
        }
        synchronized (this.Z) {
            t = (T) this.Y;
            if (t == bx2) {
                FA0<? extends T> fa0 = this.X;
                C6562gT0.m(fa0);
                t = fa0.invoke();
                this.Y = t;
                this.X = null;
            }
        }
        return t;
    }

    @Override // o.EY0
    public boolean isInitialized() {
        if (this.Y != Bx2.a) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C3740Nj2(FA0 fa0, Object obj, int i, C9516sY c9516sY) {
        this(fa0, (i & 2) != 0 ? null : obj);
    }
}
