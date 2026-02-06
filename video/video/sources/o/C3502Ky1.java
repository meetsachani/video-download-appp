package o;

@InterfaceC5116aa0
@InterfaceC10420wF0
/* renamed from: o.Ky1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3502Ky1 {
    public final String a;
    public final int b;

    public C3502Ky1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static C3502Ky1 a(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            int i = 16;
            if (!str.startsWith("0x") && !str.startsWith("0X")) {
                if (charAt == '#') {
                    str = str.substring(1);
                } else if (charAt == '0' && str.length() > 1) {
                    str = str.substring(1);
                    i = 8;
                } else {
                    i = 10;
                }
            } else {
                str = str.substring(2);
            }
            return new C3502Ky1(str, i);
        }
        throw new NumberFormatException("empty string");
    }
}
