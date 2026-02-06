package o;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import o.C9800ti2;

/* renamed from: o.yj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11019yj extends C9800ti2.d {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public C11019yj(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid != null) {
            this.a = uuid;
            this.b = i;
            this.c = i2;
            if (rect != null) {
                this.d = rect;
                if (size != null) {
                    this.e = size;
                    this.f = i3;
                    this.g = z;
                    return;
                }
                throw new NullPointerException("Null size");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null uuid");
    }

    @Override // o.C9800ti2.d
    public Rect a() {
        return this.d;
    }

    @Override // o.C9800ti2.d
    public int b() {
        return this.c;
    }

    @Override // o.C9800ti2.d
    public boolean c() {
        return this.g;
    }

    @Override // o.C9800ti2.d
    public int d() {
        return this.f;
    }

    @Override // o.C9800ti2.d
    public Size e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9800ti2.d) {
            C9800ti2.d dVar = (C9800ti2.d) obj;
            if (this.a.equals(dVar.g()) && this.b == dVar.f() && this.c == dVar.b() && this.d.equals(dVar.a()) && this.e.equals(dVar.e()) && this.f == dVar.d() && this.g == dVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C9800ti2.d
    public int f() {
        return this.b;
    }

    @Override // o.C9800ti2.d
    public UUID g() {
        return this.a;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OutConfig{uuid=" + this.a + ", targets=" + this.b + ", format=" + this.c + ", cropRect=" + this.d + ", size=" + this.e + ", rotationDegrees=" + this.f + ", mirroring=" + this.g + "}";
    }
}
