package o;

/* renamed from: o.Uu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4464Uu0 {
    public static String a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "OFF";
                }
                throw new IllegalArgumentException("Unknown flash mode " + i);
            }
            return "ON";
        }
        return "AUTO";
    }

    public static int b(String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case 2527:
                    if (str.equals("ON")) {
                        c = 0;
                        break;
                    }
                    break;
                case 78159:
                    if (str.equals("OFF")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2020783:
                    if (str.equals("AUTO")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 0;
                default:
                    throw new IllegalArgumentException("Unknown flash mode name " + str);
            }
        }
        throw new NullPointerException("name cannot be null");
    }
}
