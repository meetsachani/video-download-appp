package o;

/* renamed from: o.zm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11277zm2 extends C11055ys {
    @Override // o.C11055ys, o.InterfaceC2618Cb0
    public int b() {
        return 2;
    }

    @Override // o.C11055ys
    public int d(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) (c - 'S'));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        } else if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c - C11304zt1.a));
            return 2;
        } else if (c >= '{' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return d((char) (c - 128), sb) + 2;
        }
    }
}
