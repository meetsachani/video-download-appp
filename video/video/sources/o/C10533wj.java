package o;

import o.InterfaceC7588ki2;

/* renamed from: o.wj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10533wj extends InterfaceC7588ki2.a {
    public final int b;
    public final InterfaceC7588ki2 c;

    public C10533wj(int i, InterfaceC7588ki2 interfaceC7588ki2) {
        this.b = i;
        if (interfaceC7588ki2 != null) {
            this.c = interfaceC7588ki2;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    @Override // o.InterfaceC7588ki2.a
    public int a() {
        return this.b;
    }

    @Override // o.InterfaceC7588ki2.a
    public InterfaceC7588ki2 b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC7588ki2.a) {
            InterfaceC7588ki2.a aVar = (InterfaceC7588ki2.a) obj;
            if (this.b == aVar.a() && this.c.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.b + ", surfaceOutput=" + this.c + "}";
    }
}
