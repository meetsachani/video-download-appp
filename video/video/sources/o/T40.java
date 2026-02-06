package o;

@Deprecated
/* loaded from: classes2.dex */
public final class T40 {
    public final int a;
    public final int b;
    public final String c;

    public T40(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @InterfaceC11300zs1
    public static T40 a(C3012Fy1 c3012Fy1) {
        String str;
        c3012Fy1.Z(2);
        int L = c3012Fy1.L();
        int i = L >> 1;
        int L2 = ((c3012Fy1.L() >> 3) & 31) | ((L & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = C5137af1.g;
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (L2 >= 10) {
            str2 = UE.h;
        }
        sb.append(str2);
        sb.append(L2);
        return new T40(i, L2, sb.toString());
    }
}
