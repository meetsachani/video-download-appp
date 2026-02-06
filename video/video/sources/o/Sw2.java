package o;

/* loaded from: classes3.dex */
public final /* synthetic */ class Sw2 {
    public static /* synthetic */ long a(long j, long j2) {
        if (j2 < 0) {
            if ((j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                return j;
            }
            return j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }
}
