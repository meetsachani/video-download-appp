package o;

import o.InterfaceC3240Ih;

/* renamed from: o.oi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8576oi extends InterfaceC3240Ih.c {
    public final int a;
    public final long b;

    public C8576oi(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // o.InterfaceC3240Ih.c
    public int a() {
        return this.a;
    }

    @Override // o.InterfaceC3240Ih.c
    public long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3240Ih.c) {
            InterfaceC3240Ih.c cVar = (InterfaceC3240Ih.c) obj;
            if (this.a == cVar.a() && this.b == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.a + ", timestampNs=" + this.b + "}";
    }
}
