package o;

import java.util.NoSuchElementException;

@Deprecated
/* renamed from: o.ul  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10052ul implements InterfaceC2631Ce1 {
    public final long b;
    public final long c;
    public long d;

    public AbstractC10052ul(long j, long j2) {
        this.b = j;
        this.c = j2;
        reset();
    }

    @Override // o.InterfaceC2631Ce1
    public boolean c() {
        if (this.d > this.c) {
            return true;
        }
        return false;
    }

    public final void e() {
        long j = this.d;
        if (j >= this.b && j <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }

    public final long f() {
        return this.d;
    }

    @Override // o.InterfaceC2631Ce1
    public boolean next() {
        this.d++;
        return !c();
    }

    @Override // o.InterfaceC2631Ce1
    public void reset() {
        this.d = this.b - 1;
    }
}
