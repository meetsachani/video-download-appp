package o;

/* renamed from: o.xW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC10730xW1 {
    INVITE("INVITE"),
    REQUEST("REQUEST"),
    CHALLENGE("CHALLENGE"),
    SHARE("SHARE");
    
    public final String X;

    EnumC10730xW1(String stringValue) {
        this.X = stringValue;
    }

    @InterfaceC11300zs1
    public static EnumC10730xW1 e(String intentType) {
        EnumC10730xW1[] values;
        for (EnumC10730xW1 enumC10730xW1 : values()) {
            if (enumC10730xW1.toString().equals(intentType)) {
                return enumC10730xW1;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String g(String intentType) {
        for (EnumC10730xW1 enumC10730xW1 : values()) {
            if (enumC10730xW1.toString().equals(intentType)) {
                return intentType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.X;
    }
}
