package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class Dx2 extends Ix2 {
    public final Ix2 k = new C5257b90();

    public static QT1 s(QT1 qt1) throws C2605Bx0 {
        String g = qt1.g();
        if (g.charAt(0) == '0') {
            QT1 qt12 = new QT1(g.substring(1), null, qt1.f(), EnumC3839Ok.UPC_A);
            if (qt1.e() != null) {
                qt12.i(qt1.e());
            }
            return qt12;
        }
        throw C2605Bx0.a();
    }

    @Override // o.Ix2, o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, C2605Bx0, UB {
        return s(this.k.a(i, c10792xn, map));
    }

    @Override // o.AbstractC9608sv1, o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, C2605Bx0 {
        return s(this.k.c(c7120in));
    }

    @Override // o.AbstractC9608sv1, o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, C2605Bx0 {
        return s(this.k.d(c7120in, map));
    }

    @Override // o.Ix2
    public int l(C10792xn c10792xn, int[] iArr, StringBuilder sb) throws C9349rr1 {
        return this.k.l(c10792xn, iArr, sb);
    }

    @Override // o.Ix2
    public QT1 m(int i, C10792xn c10792xn, int[] iArr, Map<XV, ?> map) throws C9349rr1, C2605Bx0, UB {
        return s(this.k.m(i, c10792xn, iArr, map));
    }

    @Override // o.Ix2
    public EnumC3839Ok q() {
        return EnumC3839Ok.UPC_A;
    }
}
