package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.Pl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3942Pl1 extends AbstractC9608sv1 {
    public final Ix2[] a;

    public C3942Pl1(Map<XV, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(XV.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC3839Ok.EAN_13)) {
                arrayList.add(new C5257b90());
            } else if (collection.contains(EnumC3839Ok.UPC_A)) {
                arrayList.add(new Dx2());
            }
            if (collection.contains(EnumC3839Ok.EAN_8)) {
                arrayList.add(new C5742d90());
            }
            if (collection.contains(EnumC3839Ok.UPC_E)) {
                arrayList.add(new Kx2());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C5257b90());
            arrayList.add(new C5742d90());
            arrayList.add(new Kx2());
        }
        this.a = (Ix2[]) arrayList.toArray(new Ix2[arrayList.size()]);
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1 {
        boolean z;
        Collection collection;
        boolean z2;
        int[] p = Ix2.p(c10792xn);
        for (Ix2 ix2 : this.a) {
            try {
                QT1 m = ix2.m(i, c10792xn, p, map);
                if (m.b() == EnumC3839Ok.EAN_13 && m.g().charAt(0) == '0') {
                    z = true;
                } else {
                    z = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(XV.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(EnumC3839Ok.UPC_A)) {
                    z2 = false;
                    if (!z && z2) {
                        QT1 qt1 = new QT1(m.g().substring(1), m.d(), m.f(), EnumC3839Ok.UPC_A);
                        qt1.i(m.e());
                        return qt1;
                    }
                    return m;
                }
                z2 = true;
                if (!z) {
                }
                return m;
            } catch (FO1 unused) {
            }
        }
        throw C9349rr1.a();
    }

    @Override // o.AbstractC9608sv1, o.DO1
    public void reset() {
        for (Ix2 ix2 : this.a) {
            ix2.reset();
        }
    }
}
