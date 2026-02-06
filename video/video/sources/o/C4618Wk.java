package o;

/* renamed from: o.Wk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4618Wk implements InterfaceC2618Cb0 {
    public static char c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        if (i2 <= 255) {
            return (char) i2;
        }
        return (char) (i2 - 256);
    }

    @Override // o.InterfaceC2618Cb0
    public void a(C3021Gb0 c3021Gb0) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c3021Gb0.j()) {
                break;
            }
            sb.append(c3021Gb0.d());
            c3021Gb0.f++;
            if (KH0.o(c3021Gb0.e(), c3021Gb0.f, b()) != b()) {
                c3021Gb0.p(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = c3021Gb0.a() + length + 1;
        c3021Gb0.r(a);
        if (c3021Gb0.h().b() - a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c3021Gb0.j() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + C9680tD0.j));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            c3021Gb0.s(c(sb.charAt(i), c3021Gb0.a() + 1));
        }
    }

    @Override // o.InterfaceC2618Cb0
    public int b() {
        return 5;
    }
}
