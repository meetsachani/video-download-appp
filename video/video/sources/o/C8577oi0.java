package o;

/* renamed from: o.oi0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8577oi0 {
    public final boolean a;
    public final C9504sU b;
    public final C9504sU c;
    public final C10331vt0 d;

    public C8577oi0(C9504sU c9504sU, C9504sU c9504sU2, C10331vt0 c10331vt0, boolean z) {
        this.b = c9504sU;
        this.c = c9504sU2;
        this.d = c10331vt0;
        this.a = z;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C10331vt0 b() {
        return this.d;
    }

    public C9504sU c() {
        return this.b;
    }

    public C9504sU d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8577oi0)) {
            return false;
        }
        C8577oi0 c8577oi0 = (C8577oi0) obj;
        if (!a(this.b, c8577oi0.b) || !a(this.c, c8577oi0.c) || !a(this.d, c8577oi0.d)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        if (this.c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (e(this.b) ^ e(this.c)) ^ e(this.d);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.b);
        sb.append(" , ");
        sb.append(this.c);
        sb.append(" : ");
        C10331vt0 c10331vt0 = this.d;
        if (c10331vt0 == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(c10331vt0.c());
        }
        sb.append(valueOf);
        sb.append(" ]");
        return sb.toString();
    }
}
