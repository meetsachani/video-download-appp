package o;

/* renamed from: o.sU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9504sU {
    public final int a;
    public final int b;

    public C9504sU(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9504sU)) {
            return false;
        }
        C9504sU c9504sU = (C9504sU) obj;
        if (this.a != c9504sU.a || this.b != c9504sU.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a ^ this.b;
    }

    public final String toString() {
        return this.a + C9811tl1.c + this.b + ')';
    }
}
