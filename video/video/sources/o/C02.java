package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class C02<T> extends F02<T> implements Iterator<T>, HM<C7458kA2>, GW0 {
    public int X;
    @Nullable
    public T Y;
    @Nullable
    public HM<? super C7458kA2> Y0;
    @Nullable
    public Iterator<? extends T> Z;

    @Override // o.F02
    @Nullable
    public Object b(T t, @NotNull HM<? super C7458kA2> hm) {
        this.Y = t;
        this.X = 3;
        this.Y0 = hm;
        Object l = C7289jT0.l();
        if (l == C7289jT0.l()) {
            MV.c(hm);
        }
        if (l == C7289jT0.l()) {
            return l;
        }
        return C7458kA2.a;
    }

    @Override // o.F02
    @Nullable
    public Object e(@NotNull Iterator<? extends T> it, @NotNull HM<? super C7458kA2> hm) {
        if (!it.hasNext()) {
            return C7458kA2.a;
        }
        this.Z = it;
        this.X = 2;
        this.Y0 = hm;
        Object l = C7289jT0.l();
        if (l == C7289jT0.l()) {
            MV.c(hm);
        }
        if (l == C7289jT0.l()) {
            return l;
        }
        return C7458kA2.a;
    }

    public final Throwable g() {
        int i = this.X;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.X);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return C3897Pa0.X;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.X;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator<? extends T> it = this.Z;
                C6562gT0.m(it);
                if (it.hasNext()) {
                    this.X = 2;
                    return true;
                }
                this.Z = null;
            }
            this.X = 5;
            HM<? super C7458kA2> hm = this.Y0;
            C6562gT0.m(hm);
            this.Y0 = null;
            PT1.a aVar = PT1.Y;
            hm.q(PT1.b(C7458kA2.a));
        }
    }

    @Nullable
    public final HM<C7458kA2> i() {
        return this.Y0;
    }

    public final T j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void k(@Nullable HM<? super C7458kA2> hm) {
        this.Y0 = hm;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.X;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.X = 0;
                    T t = this.Y;
                    this.Y = null;
                    return t;
                }
                throw g();
            }
            this.X = 1;
            Iterator<? extends T> it = this.Z;
            C6562gT0.m(it);
            return it.next();
        }
        return j();
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        RT1.n(obj);
        this.X = 4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
