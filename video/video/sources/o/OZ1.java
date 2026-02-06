package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.C4224Si1;
import o.C8931q92;

@Deprecated
/* loaded from: classes2.dex */
public final class OZ1 {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 2192;
    public static final int i = 2816;
    public static final int j = 2817;
    public static final int k = 2819;
    public static final int l = 2820;
    public static final String m = "SefReader";
    public static final int n = 1397048916;

    /* renamed from: o  reason: collision with root package name */
    public static final int f575o = 12;
    public static final int p = 8;
    public static final int q = 12;
    public static final C5365bb2 r = C5365bb2.h(':');
    public static final C5365bb2 s = C5365bb2.h('*');
    public final List<a> a = new ArrayList();
    public int b = 0;
    public int c;

    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    public static int b(String str) throws C3989Py1 {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return h;
            case 1:
                return k;
            case 2:
                return i;
            case 3:
                return l;
            case 4:
                return j;
            default:
                throw C3989Py1.a("Invalid SEF name", null);
        }
    }

    public static C8931q92 f(C3012Fy1 c3012Fy1, int i2) throws C3989Py1 {
        ArrayList arrayList = new ArrayList();
        List<String> o2 = s.o(c3012Fy1.I(i2));
        for (int i3 = 0; i3 < o2.size(); i3++) {
            List<String> o3 = r.o(o2.get(i3));
            if (o3.size() == 3) {
                try {
                    arrayList.add(new C8931q92.b(Long.parseLong(o3.get(0)), Long.parseLong(o3.get(1)), 1 << (Integer.parseInt(o3.get(2)) - 1)));
                } catch (NumberFormatException e2) {
                    throw C3989Py1.a(null, e2);
                }
            } else {
                throw C3989Py1.a(null, null);
            }
        }
        return new C8931q92(arrayList);
    }

    public final void a(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        C3012Fy1 c3012Fy1 = new C3012Fy1(8);
        interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, 8);
        this.c = c3012Fy1.w() + 8;
        if (c3012Fy1.s() != 1397048916) {
            ke1.a = 0L;
            return;
        }
        ke1.a = interfaceC4421Uj0.getPosition() - (this.c - 12);
        this.b = 2;
    }

    public int c(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1, List<C4224Si1.b> list) throws IOException {
        int i2 = this.b;
        long j2 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        e(interfaceC4421Uj0, list);
                        ke1.a = 0L;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    d(interfaceC4421Uj0, ke1);
                }
            } else {
                a(interfaceC4421Uj0, ke1);
            }
        } else {
            long length = interfaceC4421Uj0.getLength();
            if (length != -1 && length >= 8) {
                j2 = length - 8;
            }
            ke1.a = j2;
            this.b = 1;
        }
        return 1;
    }

    public final void d(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        long length = interfaceC4421Uj0.getLength();
        int i2 = this.c - 20;
        C3012Fy1 c3012Fy1 = new C3012Fy1(i2);
        interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            c3012Fy1.Z(2);
            short z = c3012Fy1.z();
            if (z != 2192 && z != 2816 && z != 2817 && z != 2819 && z != 2820) {
                c3012Fy1.Z(8);
            } else {
                this.a.add(new a(z, (length - this.c) - c3012Fy1.w(), c3012Fy1.w()));
            }
        }
        if (this.a.isEmpty()) {
            ke1.a = 0L;
            return;
        }
        this.b = 3;
        ke1.a = this.a.get(0).b;
    }

    public final void e(InterfaceC4421Uj0 interfaceC4421Uj0, List<C4224Si1.b> list) throws IOException {
        long position = interfaceC4421Uj0.getPosition();
        int length = (int) ((interfaceC4421Uj0.getLength() - interfaceC4421Uj0.getPosition()) - this.c);
        C3012Fy1 c3012Fy1 = new C3012Fy1(length);
        interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, length);
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            a aVar = this.a.get(i2);
            c3012Fy1.Y((int) (aVar.b - position));
            c3012Fy1.Z(4);
            int w = c3012Fy1.w();
            int b = b(c3012Fy1.I(w));
            int i3 = aVar.c - (w + 8);
            if (b != 2192) {
                if (b != 2816 && b != 2817 && b != 2819 && b != 2820) {
                    throw new IllegalStateException();
                }
            } else {
                list.add(f(c3012Fy1, i3));
            }
        }
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }
}
