package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class Z41 {
    public static final Z41 X = new a("DEFAULT", 0);
    public static final Z41 Y = new Z41("STRING", 1) { // from class: o.Z41.b
        @Override // o.Z41
        public DV0 g(Long l) {
            if (l == null) {
                return HV0.X;
            }
            return new MV0(l.toString());
        }
    };
    public static final /* synthetic */ Z41[] Z = e();

    /* loaded from: classes3.dex */
    public enum a extends Z41 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.Z41
        public DV0 g(Long l) {
            if (l == null) {
                return HV0.X;
            }
            return new MV0(l);
        }
    }

    public Z41(String str, int i) {
    }

    public static /* synthetic */ Z41[] e() {
        return new Z41[]{X, Y};
    }

    public static Z41 valueOf(String str) {
        return (Z41) Enum.valueOf(Z41.class, str);
    }

    public static Z41[] values() {
        return (Z41[]) Z.clone();
    }

    public abstract DV0 g(Long l);

    public /* synthetic */ Z41(String str, int i, a aVar) {
        this(str, i);
    }
}
