package o;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* renamed from: o.uj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10045uj0 implements InterfaceC9802tj0 {
    public final Object a = new Object();
    public final C7641kw b;
    public int c;

    public C10045uj0(C7641kw c7641kw, int i) {
        this.b = c7641kw;
        this.c = i;
    }

    @Override // o.InterfaceC9802tj0
    public int a() {
        int i;
        synchronized (this.a) {
            i = this.c;
        }
        return i;
    }

    @Override // o.InterfaceC9802tj0
    public Rational b() {
        if (!c()) {
            return Rational.ZERO;
        }
        return (Rational) this.b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // o.InterfaceC9802tj0
    public boolean c() {
        Range range = (Range) this.b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range != null && ((Integer) range.getLower()).intValue() != 0 && ((Integer) range.getUpper()).intValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9802tj0
    public Range<Integer> d() {
        return (Range) this.b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public void e(int i) {
        synchronized (this.a) {
            this.c = i;
        }
    }
}
