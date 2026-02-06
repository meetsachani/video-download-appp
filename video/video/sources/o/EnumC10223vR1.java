package o;

/* renamed from: o.vR1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10223vR1 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: o.vR1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC10223vR1.values().length];
            a = iArr;
            try {
                iArr[EnumC10223vR1.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC10223vR1.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC10223vR1.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean g(int i, boolean z, int i2) {
        int i3 = a.a[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        if ((!z || i >= 28) && i2 <= 4 && i > 25) {
            return false;
        }
        return true;
    }
}
