package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.l80  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7691l80 extends C7448k80 {

    /* renamed from: o.l80$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC6964i80.values().length];
            try {
                iArr[EnumC6964i80.Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6964i80.Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6964i80.Y0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6964i80.Z0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6964i80.a1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC6964i80.b1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC6964i80.c1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    @InterfaceC6480g82(version = "1.5")
    @NotNull
    public static final EnumC6964i80 f(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return EnumC6964i80.c1;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c != 'H') {
            if (c != 'M') {
                if (c == 'S') {
                    return EnumC6964i80.Z0;
                }
                throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
            }
            return EnumC6964i80.a1;
        } else {
            return EnumC6964i80.b1;
        }
    }

    @InterfaceC6480g82(version = "1.5")
    @NotNull
    public static final EnumC6964i80 g(@NotNull String str) {
        C6562gT0.p(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return EnumC6964i80.Z;
                                }
                            } else if (str.equals("ns")) {
                                return EnumC6964i80.Y;
                            }
                        } else if (str.equals("ms")) {
                            return EnumC6964i80.Y0;
                        }
                    } else if (str.equals("s")) {
                        return EnumC6964i80.Z0;
                    }
                } else if (str.equals("m")) {
                    return EnumC6964i80.a1;
                }
            } else if (str.equals(C10901yE.i)) {
                return EnumC6964i80.b1;
            }
        } else if (str.equals("d")) {
            return EnumC6964i80.c1;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final String h(@NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "<this>");
        switch (a.a[enumC6964i80.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return C10901yE.i;
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + enumC6964i80).toString());
        }
    }
}
