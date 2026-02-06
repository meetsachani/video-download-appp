package o;

/* renamed from: o.vt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10331vt0 {
    public final int a;
    public final int[] b;
    public final UT1[] c;

    public C10331vt0(int i, int[] iArr, int i2, int i3, int i4) {
        this.a = i;
        this.b = iArr;
        float f = i2;
        float f2 = i4;
        this.c = new UT1[]{new UT1(f, f2), new UT1(i3, f2)};
    }

    public UT1[] a() {
        return this.c;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10331vt0) || this.a != ((C10331vt0) obj).a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }
}
