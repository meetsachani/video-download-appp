package o;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public class A31 {

    /* loaded from: classes4.dex */
    public static class a<O, L> {
        public final L a;
        public final O b;
        public final Supplier<Lock> c;
        public final Supplier<Lock> d;

        public a(O o2, L l, Supplier<Lock> supplier, Supplier<Lock> supplier2) {
            Objects.requireNonNull(o2, "object");
            this.b = o2;
            Objects.requireNonNull(l, "lock");
            this.a = l;
            Objects.requireNonNull(supplier, "readLockSupplier");
            this.c = supplier;
            Objects.requireNonNull(supplier2, "writeLockSupplier");
            this.d = supplier2;
        }

        public void a(InterfaceC7598kl0<O, ?> interfaceC7598kl0) {
            g(this.c, interfaceC7598kl0);
        }

        public void b(InterfaceC7598kl0<O, ?> interfaceC7598kl0) {
            g(this.d, interfaceC7598kl0);
        }

        public <T> T c(InterfaceC3551Ll0<O, T, ?> interfaceC3551Ll0) {
            return (T) h(this.c, interfaceC3551Ll0);
        }

        public <T> T d(InterfaceC3551Ll0<O, T, ?> interfaceC3551Ll0) {
            return (T) h(this.d, interfaceC3551Ll0);
        }

        public L e() {
            return this.a;
        }

        public O f() {
            return this.b;
        }

        public void g(Supplier<Lock> supplier, InterfaceC7598kl0<O, ?> interfaceC7598kl0) {
            supplier.get().lock();
            try {
                interfaceC7598kl0.accept(this.b);
            } finally {
            }
        }

        public <T> T h(Supplier<Lock> supplier, InterfaceC3551Ll0<O, T, ?> interfaceC3551Ll0) {
            supplier.get().lock();
            try {
                return interfaceC3551Ll0.apply(this.b);
            } finally {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b<O> extends a<O, ReadWriteLock> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O o2, final ReadWriteLock readWriteLock) {
            super(o2, readWriteLock, new Supplier() { // from class: o.B31
                @Override // java.util.function.Supplier
                public final Object get() {
                    return readWriteLock.readLock();
                }
            }, new Supplier() { // from class: o.C31
                @Override // java.util.function.Supplier
                public final Object get() {
                    return readWriteLock.writeLock();
                }
            });
            readWriteLock.getClass();
        }
    }

    /* loaded from: classes4.dex */
    public static class c<O> extends a<O, StampedLock> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O o2, final StampedLock stampedLock) {
            super(o2, stampedLock, new Supplier() { // from class: o.D31
                @Override // java.util.function.Supplier
                public final Object get() {
                    return stampedLock.asReadLock();
                }
            }, new Supplier() { // from class: o.E31
                @Override // java.util.function.Supplier
                public final Object get() {
                    return stampedLock.asWriteLock();
                }
            });
            stampedLock.getClass();
        }
    }

    public static <O> b<O> a(O o2) {
        return new b<>(o2, new ReentrantReadWriteLock());
    }

    public static <O> c<O> b(O o2) {
        return new c<>(o2, new StampedLock());
    }
}
