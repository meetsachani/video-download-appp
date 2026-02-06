package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.rx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9374rx2 implements Iterator<C7162ix2>, GW0 {
    public final int X;
    public boolean Y;
    public int Y0;
    public final int Z;

    public /* synthetic */ C9374rx2(int i, int i2, int i3, C9516sY c9516sY) {
        this(i, i2, i3);
    }

    public int b() {
        int i = this.Y0;
        if (i == this.X) {
            if (this.Y) {
                this.Y = false;
                return i;
            }
            throw new NoSuchElementException();
        }
        this.Y0 = C7162ix2.n(this.Z + i);
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Y;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ C7162ix2 next() {
        return C7162ix2.g(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C9374rx2(int i, int i2, int i3) {
        this.X = i2;
        boolean z = false;
        int a = Uw2.a(i, i2);
        if (i3 <= 0 ? a >= 0 : a <= 0) {
            z = true;
        }
        this.Y = z;
        this.Z = C7162ix2.n(i3);
        this.Y0 = this.Y ? i : i2;
    }
}
