package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class VK1 extends WK1 implements InterfaceC11033ym1 {
    public static final QT1[] c = new QT1[0];
    public static final UT1[] d = new UT1[0];

    /* loaded from: classes3.dex */
    public static final class b implements Serializable, Comparator<QT1> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(QT1 qt1, QT1 qt12) {
            Map<ST1, Object> e = qt1.e();
            ST1 st1 = ST1.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) e.get(st1)).intValue(), ((Integer) qt12.e().get(st1)).intValue());
        }
    }

    public static List<QT1> h(List<QT1> list) {
        for (QT1 qt1 : list) {
            if (qt1.e().containsKey(ST1.STRUCTURED_APPEND_SEQUENCE)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<QT1> arrayList2 = new ArrayList();
                for (QT1 qt12 : list) {
                    arrayList.add(qt12);
                    if (qt12.e().containsKey(ST1.STRUCTURED_APPEND_SEQUENCE)) {
                        arrayList2.add(qt12);
                    }
                }
                Collections.sort(arrayList2, new b());
                StringBuilder sb = new StringBuilder();
                int i = 0;
                int i2 = 0;
                for (QT1 qt13 : arrayList2) {
                    sb.append(qt13.g());
                    i += qt13.d().length;
                    Map<ST1, Object> e = qt13.e();
                    ST1 st1 = ST1.BYTE_SEGMENTS;
                    if (e.containsKey(st1)) {
                        for (byte[] bArr : (Iterable) qt13.e().get(st1)) {
                            i2 += bArr.length;
                        }
                    }
                }
                byte[] bArr2 = new byte[i];
                byte[] bArr3 = new byte[i2];
                int i3 = 0;
                int i4 = 0;
                for (QT1 qt14 : arrayList2) {
                    System.arraycopy(qt14.d(), 0, bArr2, i3, qt14.d().length);
                    i3 += qt14.d().length;
                    Map<ST1, Object> e2 = qt14.e();
                    ST1 st12 = ST1.BYTE_SEGMENTS;
                    if (e2.containsKey(st12)) {
                        for (byte[] bArr4 : (Iterable) qt14.e().get(st12)) {
                            System.arraycopy(bArr4, 0, bArr3, i4, bArr4.length);
                            i4 += bArr4.length;
                        }
                    }
                }
                QT1 qt15 = new QT1(sb.toString(), bArr2, d, EnumC3839Ok.QR_CODE);
                if (i2 > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(bArr3);
                    qt15.j(ST1.BYTE_SEGMENTS, arrayList3);
                }
                arrayList.add(qt15);
                return arrayList;
            }
        }
        return list;
    }

    @Override // o.InterfaceC11033ym1
    public QT1[] a(C7120in c7120in) throws C9349rr1 {
        return b(c7120in, null);
    }

    @Override // o.InterfaceC11033ym1
    public QT1[] b(C7120in c7120in, Map<XV, ?> map) throws C9349rr1 {
        K20[] n;
        ArrayList arrayList = new ArrayList();
        for (K20 k20 : new C3454Kl1(c7120in.b()).n(map)) {
            try {
                C9753tW c2 = f().c(k20.a(), map);
                UT1[] b2 = k20.b();
                if (c2.f() instanceof UK1) {
                    ((UK1) c2.f()).a(b2);
                }
                QT1 qt1 = new QT1(c2.j(), c2.g(), b2, EnumC3839Ok.QR_CODE);
                List<byte[]> a2 = c2.a();
                if (a2 != null) {
                    qt1.j(ST1.BYTE_SEGMENTS, a2);
                }
                String b3 = c2.b();
                if (b3 != null) {
                    qt1.j(ST1.ERROR_CORRECTION_LEVEL, b3);
                }
                if (c2.k()) {
                    qt1.j(ST1.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c2.i()));
                    qt1.j(ST1.STRUCTURED_APPEND_PARITY, Integer.valueOf(c2.h()));
                }
                arrayList.add(qt1);
            } catch (FO1 unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return c;
        }
        List<QT1> h = h(arrayList);
        return (QT1[]) h.toArray(new QT1[h.size()]);
    }
}
