package o;

import o.InterfaceC2426Ac0;

/* renamed from: o.Fi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2950Fi extends InterfaceC2426Ac0.a {
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public C2950Fi(int i, String str, int i2, int i3, int i4, int i5) {
        this.b = i;
        if (str != null) {
            this.c = str;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            return;
        }
        throw new NullPointerException("Null mediaType");
    }

    @Override // o.InterfaceC2426Ac0.a
    public int b() {
        return this.d;
    }

    @Override // o.InterfaceC2426Ac0.a
    public int c() {
        return this.f;
    }

    @Override // o.InterfaceC2426Ac0.a
    public int d() {
        return this.b;
    }

    @Override // o.InterfaceC2426Ac0.a
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC2426Ac0.a) {
            InterfaceC2426Ac0.a aVar = (InterfaceC2426Ac0.a) obj;
            if (this.b == aVar.d() && this.c.equals(aVar.e()) && this.d == aVar.b() && this.e == aVar.g() && this.f == aVar.c() && this.g == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC2426Ac0.a
    public int f() {
        return this.g;
    }

    @Override // o.InterfaceC2426Ac0.a
    public int g() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.b + ", mediaType=" + this.c + ", bitrate=" + this.d + ", sampleRate=" + this.e + ", channels=" + this.f + ", profile=" + this.g + "}";
    }
}
