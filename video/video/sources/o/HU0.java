package o;

/* loaded from: classes4.dex */
public enum HU0 {
    JAVA_0_9(1.5f, "0.9"),
    JAVA_1_1(1.1f, "1.1"),
    JAVA_1_2(1.2f, "1.2"),
    JAVA_1_3(1.3f, "1.3"),
    JAVA_1_4(1.4f, "1.4"),
    JAVA_1_5(1.5f, "1.5"),
    JAVA_1_6(1.6f, "1.6"),
    JAVA_1_7(1.7f, "1.7"),
    JAVA_1_8(1.8f, "1.8"),
    JAVA_1_9(9.0f, "9"),
    JAVA_9(9.0f, "9"),
    JAVA_10(10.0f, "10"),
    JAVA_11(11.0f, "11"),
    JAVA_12(12.0f, "12"),
    JAVA_13(13.0f, "13"),
    JAVA_14(14.0f, "14"),
    JAVA_15(15.0f, "15"),
    JAVA_16(16.0f, "16"),
    JAVA_17(17.0f, "17"),
    JAVA_RECENT(j(), Float.toString(j()));
    
    public final float X;
    public final String Y;

    HU0(float f, String str) {
        this.X = f;
        this.Y = str;
    }

    public static HU0 h(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 57:
                if (str.equals("9")) {
                    c = 0;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = 1;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = 2;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 3;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = 4;
                    break;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    c = 5;
                    break;
                }
                break;
            case 1572:
                if (str.equals("15")) {
                    c = 6;
                    break;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    c = 7;
                    break;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    c = '\b';
                    break;
                }
                break;
            case 47611:
                if (str.equals("0.9")) {
                    c = '\t';
                    break;
                }
                break;
            case 48564:
                if (str.equals("1.1")) {
                    c = '\n';
                    break;
                }
                break;
            case 48565:
                if (str.equals("1.2")) {
                    c = 11;
                    break;
                }
                break;
            case 48566:
                if (str.equals("1.3")) {
                    c = '\f';
                    break;
                }
                break;
            case 48567:
                if (str.equals("1.4")) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 48568:
                if (str.equals("1.5")) {
                    c = 14;
                    break;
                }
                break;
            case 48569:
                if (str.equals("1.6")) {
                    c = 15;
                    break;
                }
                break;
            case 48570:
                if (str.equals("1.7")) {
                    c = 16;
                    break;
                }
                break;
            case 48571:
                if (str.equals("1.8")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return JAVA_9;
            case 1:
                return JAVA_10;
            case 2:
                return JAVA_11;
            case 3:
                return JAVA_12;
            case 4:
                return JAVA_13;
            case 5:
                return JAVA_14;
            case 6:
                return JAVA_15;
            case 7:
                return JAVA_16;
            case '\b':
                return JAVA_17;
            case '\t':
                return JAVA_0_9;
            case '\n':
                return JAVA_1_1;
            case 11:
                return JAVA_1_2;
            case '\f':
                return JAVA_1_3;
            case '\r':
                return JAVA_1_4;
            case 14:
                return JAVA_1_5;
            case 15:
                return JAVA_1_6;
            case 16:
                return JAVA_1_7;
            case 17:
                return JAVA_1_8;
            default:
                float l = l(str);
                if (l - 1.0d < 1.0d) {
                    int max = Math.max(str.indexOf(46), str.indexOf(44));
                    if (Float.parseFloat(str.substring(max + 1, Math.max(str.length(), str.indexOf(44, max)))) > 0.9f) {
                        return JAVA_RECENT;
                    }
                } else if (l > 10.0f) {
                    return JAVA_RECENT;
                }
                return null;
        }
    }

    public static HU0 i(String str) {
        return h(str);
    }

    public static float j() {
        float l = l(System.getProperty("java.specification.version", "99.0"));
        if (l > 0.0f) {
            return l;
        }
        return 99.0f;
    }

    public static float l(String str) {
        if (str.contains(UE.h)) {
            String[] split = str.split("\\.");
            if (split.length < 2) {
                return -1.0f;
            }
            return C3482Ks1.X(split[0] + '.' + split[1], -1.0f);
        }
        return C3482Ks1.X(str, -1.0f);
    }

    public boolean e(HU0 hu0) {
        if (this.X >= hu0.X) {
            return true;
        }
        return false;
    }

    public boolean g(HU0 hu0) {
        if (this.X <= hu0.X) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.Y;
    }
}
