package o;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import o.InterfaceC6765hJ0;

/* renamed from: o.uz2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10111uz2<T, S extends InterfaceC6765hJ0<T, S, B>, B extends BaseStream<T, B>> implements BaseStream<T, B> {
    public final S X;

    public C10111uz2(S s) {
        this.X = s;
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    @Override // java.util.stream.BaseStream
    public boolean isParallel() {
        return this.X.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public Iterator<T> iterator() {
        return this.X.iterator().asIterator();
    }

    @Override // java.util.stream.BaseStream
    public B onClose(final Runnable runnable) {
        final S s = this.X;
        Objects.requireNonNull(s);
        return (B) ((InterfaceC6765hJ0) C8643oy2.f(new RJ0() { // from class: o.sz2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return InterfaceC6765hJ0.this.E2((InterfaceC8973qK0) obj);
            }
        }, new InterfaceC8973qK0() { // from class: o.tz2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                runnable.run();
            }
        })).e();
    }

    @Override // java.util.stream.BaseStream
    public B parallel() {
        return (B) this.X.parallel().e();
    }

    @Override // java.util.stream.BaseStream
    public B sequential() {
        return (B) this.X.sequential().e();
    }

    @Override // java.util.stream.BaseStream
    public Spliterator<T> spliterator() {
        return this.X.spliterator().e();
    }

    @Override // java.util.stream.BaseStream
    public B unordered() {
        return (B) this.X.unordered().e();
    }
}
