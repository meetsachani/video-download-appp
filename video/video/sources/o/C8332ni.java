package o;

/* renamed from: o.ni  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8332ni extends AbstractC3142Hh {
    public final int i;
    public final double j;
    public final Throwable k;

    public C8332ni(int i, double d, Throwable th) {
        this.i = i;
        this.j = d;
        this.k = th;
    }

    @Override // o.AbstractC3142Hh
    public double b() {
        return this.j;
    }

    @Override // o.AbstractC3142Hh
    public int c() {
        return this.i;
    }

    @Override // o.AbstractC3142Hh
    public Throwable d() {
        return this.k;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3142Hh) {
            AbstractC3142Hh abstractC3142Hh = (AbstractC3142Hh) obj;
            if (this.i == abstractC3142Hh.c() && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(abstractC3142Hh.b()) && ((th = this.k) != null ? th.equals(abstractC3142Hh.d()) : abstractC3142Hh.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int doubleToLongBits = (((this.i ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.j) >>> 32) ^ Double.doubleToLongBits(this.j)))) * 1000003;
        Throwable th = this.k;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return doubleToLongBits ^ hashCode;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.i + ", audioAmplitudeInternal=" + this.j + ", errorCause=" + this.k + "}";
    }
}
