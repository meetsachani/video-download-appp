package o;

/* loaded from: classes3.dex */
public final class UK1 {
    public final boolean a;

    public UK1(boolean z) {
        this.a = z;
    }

    public void a(UT1[] ut1Arr) {
        if (this.a && ut1Arr != null && ut1Arr.length >= 3) {
            UT1 ut1 = ut1Arr[0];
            ut1Arr[0] = ut1Arr[2];
            ut1Arr[2] = ut1;
        }
    }

    public boolean b() {
        return this.a;
    }
}
