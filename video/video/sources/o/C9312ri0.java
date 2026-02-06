package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ri0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9312ri0 {
    public final List<C8577oi0> a;
    public final int b;
    public final boolean c;

    public C9312ri0(List<C8577oi0> list, int i, boolean z) {
        this.a = new ArrayList(list);
        this.b = i;
        this.c = z;
    }

    public List<C8577oi0> a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean c(List<C8577oi0> list) {
        return this.a.equals(list);
    }

    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9312ri0)) {
            return false;
        }
        C9312ri0 c9312ri0 = (C9312ri0) obj;
        if (!this.a.equals(c9312ri0.a()) || this.c != c9312ri0.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
    }

    public String toString() {
        return "{ " + this.a + " }";
    }
}
