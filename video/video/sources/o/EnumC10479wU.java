package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.wU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC10479wU {
    public static final EnumC10479wU X;
    public static final EnumC10479wU Y;
    public static final EnumC10479wU Y0;
    public static final EnumC10479wU Z;
    public static final EnumC10479wU Z0;
    public static final EnumC10479wU a1;
    public static final EnumC10479wU b1;
    public static final EnumC10479wU c1;
    public static final /* synthetic */ EnumC10479wU[] d1;

    /* renamed from: o.wU$a */
    /* loaded from: classes3.dex */
    public enum a extends EnumC10479wU {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.EnumC10479wU
        public boolean e(int i, int i2) {
            if (((i + i2) & 1) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        X = aVar;
        EnumC10479wU enumC10479wU = new EnumC10479wU("DATA_MASK_001", 1) { // from class: o.wU.b
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if ((i & 1) == 0) {
                    return true;
                }
                return false;
            }
        };
        Y = enumC10479wU;
        EnumC10479wU enumC10479wU2 = new EnumC10479wU("DATA_MASK_010", 2) { // from class: o.wU.c
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if (i2 % 3 == 0) {
                    return true;
                }
                return false;
            }
        };
        Z = enumC10479wU2;
        EnumC10479wU enumC10479wU3 = new EnumC10479wU("DATA_MASK_011", 3) { // from class: o.wU.d
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if ((i + i2) % 3 == 0) {
                    return true;
                }
                return false;
            }
        };
        Y0 = enumC10479wU3;
        EnumC10479wU enumC10479wU4 = new EnumC10479wU("DATA_MASK_100", 4) { // from class: o.wU.e
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if ((((i / 2) + (i2 / 3)) & 1) == 0) {
                    return true;
                }
                return false;
            }
        };
        Z0 = enumC10479wU4;
        EnumC10479wU enumC10479wU5 = new EnumC10479wU("DATA_MASK_101", 5) { // from class: o.wU.f
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if ((i * i2) % 6 == 0) {
                    return true;
                }
                return false;
            }
        };
        a1 = enumC10479wU5;
        EnumC10479wU enumC10479wU6 = new EnumC10479wU("DATA_MASK_110", 6) { // from class: o.wU.g
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if ((i * i2) % 6 < 3) {
                    return true;
                }
                return false;
            }
        };
        b1 = enumC10479wU6;
        EnumC10479wU enumC10479wU7 = new EnumC10479wU("DATA_MASK_111", 7) { // from class: o.wU.h
            @Override // o.EnumC10479wU
            public boolean e(int i, int i2) {
                if (((i + i2 + ((i * i2) % 3)) & 1) == 0) {
                    return true;
                }
                return false;
            }
        };
        c1 = enumC10479wU7;
        d1 = new EnumC10479wU[]{aVar, enumC10479wU, enumC10479wU2, enumC10479wU3, enumC10479wU4, enumC10479wU5, enumC10479wU6, enumC10479wU7};
    }

    public EnumC10479wU(String str, int i) {
    }

    public static EnumC10479wU valueOf(String str) {
        return (EnumC10479wU) Enum.valueOf(EnumC10479wU.class, str);
    }

    public static EnumC10479wU[] values() {
        return (EnumC10479wU[]) d1.clone();
    }

    public abstract boolean e(int i, int i2);

    public final void g(C2469An c2469An, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (e(i2, i3)) {
                    c2469An.e(i3, i2);
                }
            }
        }
    }

    public /* synthetic */ EnumC10479wU(String str, int i, a aVar) {
        this(str, i);
    }
}
