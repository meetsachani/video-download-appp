package o;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Iterator;

/* renamed from: o.oE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8463oE0 extends AbstractC6988iE0 {
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f824o = 32;
    public static final int p = 33;
    public static final int q = 64;
    public static final int r = -87;
    public static final int s = 64;
    public static final int t = 24;
    public static final int u = 193;
    public static final int v = 200;
    public static final int w = 200;
    public static final int x = 35;
    public final GpsStatus i;
    public int j;
    public Iterator<GpsSatellite> k;
    public int l;
    public GpsSatellite m;

    public C8463oE0(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) C10907yF1.l(gpsStatus);
        this.i = gpsStatus2;
        this.j = -1;
        this.k = gpsStatus2.getSatellites().iterator();
        this.l = -1;
        this.m = null;
    }

    public static int p(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i > 200 && i <= 235) {
            return 5;
        }
        if (i >= 193 && i <= 200) {
            return 4;
        }
        return 0;
    }

    public static int r(int i) {
        int p2 = p(i);
        if (p2 != 2) {
            if (p2 != 3) {
                if (p2 != 5) {
                    return i;
                }
                return i - 200;
            }
            return i - 64;
        }
        return i + 87;
    }

    @Override // o.AbstractC6988iE0
    public float a(int i) {
        return q(i).getAzimuth();
    }

    @Override // o.AbstractC6988iE0
    public float b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6988iE0
    public float c(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6988iE0
    public float d(int i) {
        return q(i).getSnr();
    }

    @Override // o.AbstractC6988iE0
    public int e(int i) {
        return p(q(i).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8463oE0)) {
            return false;
        }
        return this.i.equals(((C8463oE0) obj).i);
    }

    @Override // o.AbstractC6988iE0
    public float f(int i) {
        return q(i).getElevation();
    }

    @Override // o.AbstractC6988iE0
    public int g() {
        int i;
        synchronized (this.i) {
            try {
                if (this.j == -1) {
                    for (GpsSatellite gpsSatellite : this.i.getSatellites()) {
                        this.j++;
                    }
                    this.j++;
                }
                i = this.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // o.AbstractC6988iE0
    public int h(int i) {
        return r(q(i).getPrn());
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    @Override // o.AbstractC6988iE0
    public boolean i(int i) {
        return q(i).hasAlmanac();
    }

    @Override // o.AbstractC6988iE0
    public boolean j(int i) {
        return false;
    }

    @Override // o.AbstractC6988iE0
    public boolean k(int i) {
        return false;
    }

    @Override // o.AbstractC6988iE0
    public boolean l(int i) {
        return q(i).hasEphemeris();
    }

    @Override // o.AbstractC6988iE0
    public boolean m(int i) {
        return q(i).usedInFix();
    }

    public final GpsSatellite q(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.i) {
            try {
                if (i < this.l) {
                    this.k = this.i.getSatellites().iterator();
                    this.l = -1;
                }
                while (true) {
                    int i2 = this.l;
                    if (i2 >= i) {
                        break;
                    }
                    this.l = i2 + 1;
                    if (!this.k.hasNext()) {
                        this.m = null;
                        break;
                    }
                    this.m = this.k.next();
                }
                gpsSatellite = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (GpsSatellite) C10907yF1.l(gpsSatellite);
    }
}
