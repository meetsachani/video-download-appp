package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.Ol1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3845Ol1 implements DO1 {
    public Map<XV, ?> a;
    public DO1[] b;

    public final QT1 a(C7120in c7120in) throws C9349rr1 {
        DO1[] do1Arr = this.b;
        if (do1Arr != null) {
            for (DO1 do1 : do1Arr) {
                try {
                    return do1.d(c7120in, this.a);
                } catch (FO1 unused) {
                }
            }
        }
        throw C9349rr1.a();
    }

    public QT1 b(C7120in c7120in) throws C9349rr1 {
        if (this.b == null) {
            e(null);
        }
        return a(c7120in);
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1 {
        e(null);
        return a(c7120in);
    }

    @Override // o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1 {
        e(map);
        return a(c7120in);
    }

    public void e(Map<XV, ?> map) {
        boolean z;
        Collection collection;
        this.a = map;
        boolean z2 = false;
        if (map != null && map.containsKey(XV.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(XV.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC3839Ok.UPC_A) || collection.contains(EnumC3839Ok.UPC_E) || collection.contains(EnumC3839Ok.EAN_13) || collection.contains(EnumC3839Ok.EAN_8) || collection.contains(EnumC3839Ok.CODABAR) || collection.contains(EnumC3839Ok.CODE_39) || collection.contains(EnumC3839Ok.CODE_93) || collection.contains(EnumC3839Ok.CODE_128) || collection.contains(EnumC3839Ok.ITF) || collection.contains(EnumC3839Ok.RSS_14) || collection.contains(EnumC3839Ok.RSS_EXPANDED)) {
                z2 = true;
            }
            if (z2 && !z) {
                arrayList.add(new C3747Nl1(map));
            }
            if (collection.contains(EnumC3839Ok.QR_CODE)) {
                arrayList.add(new WK1());
            }
            if (collection.contains(EnumC3839Ok.DATA_MATRIX)) {
                arrayList.add(new C10722xU());
            }
            if (collection.contains(EnumC3839Ok.AZTEC)) {
                arrayList.add(new C5640ck());
            }
            if (collection.contains(EnumC3839Ok.PDF_417)) {
                arrayList.add(new C9859tx1());
            }
            if (collection.contains(EnumC3839Ok.MAXICODE)) {
                arrayList.add(new C2529Bd1());
            }
            if (z2 && z) {
                arrayList.add(new C3747Nl1(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C3747Nl1(map));
            }
            arrayList.add(new WK1());
            arrayList.add(new C10722xU());
            arrayList.add(new C5640ck());
            arrayList.add(new C9859tx1());
            arrayList.add(new C2529Bd1());
            if (z) {
                arrayList.add(new C3747Nl1(map));
            }
        }
        this.b = (DO1[]) arrayList.toArray(new DO1[arrayList.size()]);
    }

    @Override // o.DO1
    public void reset() {
        DO1[] do1Arr = this.b;
        if (do1Arr != null) {
            for (DO1 do1 : do1Arr) {
                do1.reset();
            }
        }
    }
}
