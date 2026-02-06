package o;

/* renamed from: o.vp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10312vp0 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    public final long X;

    EnumC10312vp0(long j) {
        this.X = j;
    }

    public static EnumC10312vp0 g(long j) {
        EnumC10312vp0[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].h() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    public long h() {
        return this.X;
    }
}
