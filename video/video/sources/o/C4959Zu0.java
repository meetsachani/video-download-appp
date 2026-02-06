package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Zu0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4959Zu0<T, R, E> implements B02<E> {
    @NotNull
    public final B02<T> a;
    @NotNull
    public final HA0<T, R> b;
    @NotNull
    public final HA0<R, Iterator<E>> c;

    /* renamed from: o.Zu0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static final a a = new a();
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
    }

    /* renamed from: o.Zu0$b */
    /* loaded from: classes3.dex */
    public static final class b implements Iterator<E>, GW0 {
        public final Iterator<T> X;
        public Iterator<? extends E> Y;
        public final /* synthetic */ C4959Zu0<T, R, E> Y0;
        public int Z;

        public b(C4959Zu0<T, R, E> c4959Zu0) {
            this.Y0 = c4959Zu0;
            this.X = c4959Zu0.a.iterator();
        }

        public final boolean b() {
            Iterator<? extends E> it = this.Y;
            if (it != null && it.hasNext()) {
                this.Z = 1;
                return true;
            }
            while (this.X.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.Y0.c.invoke(this.Y0.b.invoke(this.X.next()));
                if (it2.hasNext()) {
                    this.Y = it2;
                    this.Z = 1;
                    return true;
                }
            }
            this.Z = 2;
            this.Y = null;
            return false;
        }

        public final Iterator<E> c() {
            return (Iterator<? extends E>) this.Y;
        }

        public final Iterator<T> d() {
            return this.X;
        }

        public final int e() {
            return this.Z;
        }

        public final void f(Iterator<? extends E> it) {
            this.Y = it;
        }

        public final void g(int i) {
            this.Z = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.Z;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.Z;
            if (i != 2) {
                if (i == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.Z = 0;
                Iterator<? extends E> it = this.Y;
                C6562gT0.m(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4959Zu0(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends R> ha0, @NotNull HA0<? super R, ? extends Iterator<? extends E>> ha02) {
        C6562gT0.p(b02, "sequence");
        C6562gT0.p(ha0, "transformer");
        C6562gT0.p(ha02, "iterator");
        this.a = b02;
        this.b = ha0;
        this.c = ha02;
    }

    @Override // o.B02
    @NotNull
    public Iterator<E> iterator() {
        return new b(this);
    }
}
