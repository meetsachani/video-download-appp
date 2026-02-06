package o;

import o.C10757xe0;

@InterfaceC5844da0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public class VN2 {
    public static final char a = 0;
    public static final char b = 31;
    public static final AbstractC10514we0 c;
    public static final AbstractC10514we0 d;
    public static final AbstractC10514we0 e;

    static {
        C10757xe0.c b2 = C10757xe0.b();
        b2.d((char) 0, (char) 65533);
        b2.e("�");
        for (char c2 = 0; c2 <= 31; c2 = (char) (c2 + 1)) {
            if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                b2.b(c2, "�");
            }
        }
        b2.b('&', "&amp;");
        b2.b('<', "&lt;");
        b2.b('>', "&gt;");
        d = b2.c();
        b2.b('\'', "&apos;");
        b2.b('\"', "&quot;");
        c = b2.c();
        b2.b('\t', "&#x9;");
        b2.b('\n', "&#xA;");
        b2.b(C8206nB.d, "&#xD;");
        e = b2.c();
    }

    public static AbstractC10514we0 a() {
        return e;
    }

    public static AbstractC10514we0 b() {
        return d;
    }
}
