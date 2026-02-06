package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.zX1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11219zX1<T> implements EY0<T>, Serializable {
    @NotNull
    public static final a Y0 = new a(null);
    public static final AtomicReferenceFieldUpdater<C11219zX1<?>, Object> Z0 = AtomicReferenceFieldUpdater.newUpdater(C11219zX1.class, Object.class, "Y");
    @Nullable
    public volatile FA0<? extends T> X;
    @Nullable
    public volatile Object Y;
    @NotNull
    public final Object Z;

    /* renamed from: o.zX1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C11219zX1(@NotNull FA0<? extends T> fa0) {
        C6562gT0.p(fa0, "initializer");
        this.X = fa0;
        Bx2 bx2 = Bx2.a;
        this.Y = bx2;
        this.Z = bx2;
    }

    private final Object writeReplace() {
        return new KP0(getValue());
    }

    @Override // o.EY0
    public T getValue() {
        T t = (T) this.Y;
        Bx2 bx2 = Bx2.a;
        if (t != bx2) {
            return t;
        }
        FA0<? extends T> fa0 = this.X;
        if (fa0 != null) {
            T invoke = fa0.invoke();
            if (P2.a(Z0, this, bx2, invoke)) {
                this.X = null;
                return invoke;
            }
        }
        return (T) this.Y;
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

    public static /* synthetic */ void a() {
    }
}
