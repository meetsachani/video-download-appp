package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.yx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11078yx2 implements Iterator<C9860tx2>, GW0 {
    public final long X;
    public boolean Y;
    public long Y0;
    public final long Z;

    public /* synthetic */ C11078yx2(long j, long j2, long j3, C9516sY c9516sY) {
        this(j, j2, j3);
    }

    public long b() {
        long j = this.Y0;
        if (j == this.X) {
            if (this.Y) {
                this.Y = false;
                return j;
            }
            throw new NoSuchElementException();
        }
        this.Y0 = C9860tx2.n(this.Z + j);
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Y;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ C9860tx2 next() {
        return C9860tx2.g(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C11078yx2(long j, long j2, long j3) {
        this.X = j2;
        boolean z = false;
        if (j3 <= 0 ? C4434Um1.a(j, j2) >= 0 : C4434Um1.a(j, j2) <= 0) {
            z = true;
        }
        this.Y = z;
        this.Z = C9860tx2.n(j3);
        this.Y0 = this.Y ? j : j2;
    }
}
