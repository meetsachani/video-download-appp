package o;

import java.util.LinkedList;

/* renamed from: o.oc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8555oc2 {
    public static final C8555oc2 e = new C8555oc2(AbstractC4447Up2.b, 0, 0, 0);
    public final int a;
    public final AbstractC4447Up2 b;
    public final int c;
    public final int d;

    public C8555oc2(AbstractC4447Up2 abstractC4447Up2, int i, int i2, int i3) {
        this.b = abstractC4447Up2;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public C8555oc2 a(int i) {
        int i2;
        AbstractC4447Up2 abstractC4447Up2 = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int i5 = JH0.h[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC4447Up2 = abstractC4447Up2.a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.c;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        C8555oc2 c8555oc2 = new C8555oc2(abstractC4447Up2, i3, i8 + 1, i4 + i2);
        if (c8555oc2.c == 2078) {
            return c8555oc2.b(i + 1);
        }
        return c8555oc2;
    }

    public C8555oc2 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        return new C8555oc2(this.b.b(i - i2, i2), this.a, 0, this.d);
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.a;
    }

    public AbstractC4447Up2 f() {
        return this.b;
    }

    public boolean g(C8555oc2 c8555oc2) {
        int i;
        int i2 = this.d + (JH0.h[this.a][c8555oc2.a] >> 16);
        int i3 = c8555oc2.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= c8555oc2.d) {
            return true;
        }
        return false;
    }

    public C8555oc2 h(int i, int i2) {
        int i3;
        int i4 = this.d;
        AbstractC4447Up2 abstractC4447Up2 = this.b;
        int i5 = this.a;
        if (i != i5) {
            int i6 = JH0.h[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            abstractC4447Up2 = abstractC4447Up2.a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C8555oc2(abstractC4447Up2.a(i2, i3), i, 0, i4 + i3);
    }

    public C8555oc2 i(int i, int i2) {
        int i3;
        AbstractC4447Up2 abstractC4447Up2 = this.b;
        int i4 = this.a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C8555oc2(abstractC4447Up2.a(JH0.j[i4][i], i3).a(i2, 5), this.a, 0, this.d + i3 + 5);
    }

    public C10792xn j(byte[] bArr) {
        LinkedList<AbstractC4447Up2> linkedList = new LinkedList();
        for (AbstractC4447Up2 abstractC4447Up2 = b(bArr.length).b; abstractC4447Up2 != null; abstractC4447Up2 = abstractC4447Up2.d()) {
            linkedList.addFirst(abstractC4447Up2);
        }
        C10792xn c10792xn = new C10792xn();
        for (AbstractC4447Up2 abstractC4447Up22 : linkedList) {
            abstractC4447Up22.c(c10792xn, bArr);
        }
        return c10792xn;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", JH0.b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
