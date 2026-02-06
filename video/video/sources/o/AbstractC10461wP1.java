package o;

/* renamed from: o.wP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10461wP1 {
    public static AbstractC10461wP1 d(long j, long j2, AbstractC3142Hh abstractC3142Hh) {
        boolean z;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "duration must be positive value.");
        if (j2 >= 0) {
            z2 = true;
        }
        C10907yF1.b(z2, "bytes must be positive value.");
        return new C7832lj(j, j2, abstractC3142Hh);
    }

    public abstract AbstractC3142Hh a();

    public abstract long b();

    public abstract long c();
}
