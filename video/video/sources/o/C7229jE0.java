package o;

import android.location.GnssStatus;
import android.os.Build;

/* renamed from: o.jE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7229jE0 extends AbstractC6988iE0 {
    public final GnssStatus i;

    /* renamed from: o.jE0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static float a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        public static boolean b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    /* renamed from: o.jE0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static float a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        public static boolean b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public C7229jE0(Object obj) {
        this.i = (GnssStatus) C10907yF1.l((GnssStatus) obj);
    }

    @Override // o.AbstractC6988iE0
    public float a(int i) {
        return this.i.getAzimuthDegrees(i);
    }

    @Override // o.AbstractC6988iE0
    public float b(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.i, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6988iE0
    public float c(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.i, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6988iE0
    public float d(int i) {
        return this.i.getCn0DbHz(i);
    }

    @Override // o.AbstractC6988iE0
    public int e(int i) {
        return this.i.getConstellationType(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7229jE0)) {
            return false;
        }
        return this.i.equals(((C7229jE0) obj).i);
    }

    @Override // o.AbstractC6988iE0
    public float f(int i) {
        return this.i.getElevationDegrees(i);
    }

    @Override // o.AbstractC6988iE0
    public int g() {
        return this.i.getSatelliteCount();
    }

    @Override // o.AbstractC6988iE0
    public int h(int i) {
        return this.i.getSvid(i);
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    @Override // o.AbstractC6988iE0
    public boolean i(int i) {
        return this.i.hasAlmanacData(i);
    }

    @Override // o.AbstractC6988iE0
    public boolean j(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.i, i);
        }
        return false;
    }

    @Override // o.AbstractC6988iE0
    public boolean k(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.i, i);
        }
        return false;
    }

    @Override // o.AbstractC6988iE0
    public boolean l(int i) {
        return this.i.hasEphemerisData(i);
    }

    @Override // o.AbstractC6988iE0
    public boolean m(int i) {
        return this.i.usedInFix(i);
    }
}
