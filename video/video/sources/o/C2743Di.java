package o;

import o.C3679Mt;
import o.V00;

/* renamed from: o.Di  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2743Di extends V00.b {
    public final int a;
    public final int b;
    public final C3679Mt.a<Void> c;

    public C2743Di(int i, int i2, C3679Mt.a<Void> aVar) {
        this.a = i;
        this.b = i2;
        if (aVar != null) {
            this.c = aVar;
            return;
        }
        throw new NullPointerException("Null completer");
    }

    @Override // o.V00.b
    public C3679Mt.a<Void> a() {
        return this.c;
    }

    @Override // o.V00.b
    public int b() {
        return this.a;
    }

    @Override // o.V00.b
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V00.b) {
            V00.b bVar = (V00.b) obj;
            if (this.a == bVar.b() && this.b == bVar.c() && this.c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
