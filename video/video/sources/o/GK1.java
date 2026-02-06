package o;

@InterfaceC4238Sm
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public enum GK1 {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    
    public final char X;
    public final char Y;

    GK1(char c, char c2) {
        this.X = c;
        this.Y = c2;
    }

    public static GK1 g(char c) {
        GK1[] values;
        for (GK1 gk1 : values()) {
            if (gk1.h() == c || gk1.i() == c) {
                return gk1;
            }
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("No enum corresponding to given code: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    public char h() {
        return this.X;
    }

    public char i() {
        return this.Y;
    }
}
