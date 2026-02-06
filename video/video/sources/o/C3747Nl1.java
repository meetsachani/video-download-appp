package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.Nl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3747Nl1 extends AbstractC9608sv1 {
    public final AbstractC9608sv1[] a;

    public C3747Nl1(Map<XV, ?> map) {
        Collection collection;
        boolean z;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(XV.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(XV.ASSUME_CODE_39_CHECK_DIGIT) != null) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC3839Ok.EAN_13) || collection.contains(EnumC3839Ok.UPC_A) || collection.contains(EnumC3839Ok.EAN_8) || collection.contains(EnumC3839Ok.UPC_E)) {
                arrayList.add(new C3942Pl1(map));
            }
            if (collection.contains(EnumC3839Ok.CODE_39)) {
                arrayList.add(new DE(z));
            }
            if (collection.contains(EnumC3839Ok.CODE_93)) {
                arrayList.add(new FE());
            }
            if (collection.contains(EnumC3839Ok.CODE_128)) {
                arrayList.add(new BE());
            }
            if (collection.contains(EnumC3839Ok.ITF)) {
                arrayList.add(new C9955uL0());
            }
            if (collection.contains(EnumC3839Ok.CODABAR)) {
                arrayList.add(new C11144zE());
            }
            if (collection.contains(EnumC3839Ok.RSS_14)) {
                arrayList.add(new C9235rN1());
            }
            if (collection.contains(EnumC3839Ok.RSS_EXPANDED)) {
                arrayList.add(new C9478sN1());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C3942Pl1(map));
            arrayList.add(new DE());
            arrayList.add(new C11144zE());
            arrayList.add(new FE());
            arrayList.add(new BE());
            arrayList.add(new C9955uL0());
            arrayList.add(new C9235rN1());
            arrayList.add(new C9478sN1());
        }
        this.a = (AbstractC9608sv1[]) arrayList.toArray(new AbstractC9608sv1[arrayList.size()]);
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1 {
        for (AbstractC9608sv1 abstractC9608sv1 : this.a) {
            try {
                return abstractC9608sv1.a(i, c10792xn, map);
            } catch (FO1 unused) {
            }
        }
        throw C9349rr1.a();
    }

    @Override // o.AbstractC9608sv1, o.DO1
    public void reset() {
        for (AbstractC9608sv1 abstractC9608sv1 : this.a) {
            abstractC9608sv1.reset();
        }
    }
}
