package o;

/* loaded from: classes3.dex */
public final class IU0 {
    public static final int a = a();

    public static int a() {
        return f(System.getProperty("java.version"));
    }

    public static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return a;
    }

    public static boolean d() {
        if (a >= 9) {
            return true;
        }
        return false;
    }

    public static int e(String str) {
        try {
            String[] split = str.split("[._]", 3);
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int f(String str) {
        int e = e(str);
        if (e == -1) {
            e = b(str);
        }
        if (e == -1) {
            return 6;
        }
        return e;
    }
}
