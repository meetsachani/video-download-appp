package o;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C10833xx0;
import o.C4224Si1;

@Deprecated
/* renamed from: o.iZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7066iZ implements PH0 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public final int b;
    public final boolean c;

    public C7066iZ() {
        this(0, true);
    }

    public static void b(int i, List<Integer> list) {
        if (C7775lT0.m(d, i) != -1 && !list.contains(Integer.valueOf(i))) {
            list.add(Integer.valueOf(i));
        }
    }

    public static C3894Oz0 e(C10071up2 c10071up2, C10833xx0 c10833xx0, @InterfaceC11300zs1 List<C10833xx0> list) {
        int i;
        if (g(c10833xx0)) {
            i = 4;
        } else {
            i = 0;
        }
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new C3894Oz0(i, c10071up2, null, list);
    }

    public static Xu2 f(int i, boolean z, C10833xx0 c10833xx0, @InterfaceC11300zs1 List<C10833xx0> list, C10071up2 c10071up2) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else if (z) {
            list = Collections.singletonList(new C10833xx0.b().g0(C4128Rj1.x0).G());
        } else {
            list = Collections.EMPTY_LIST;
        }
        String str = c10833xx0.d1;
        if (!TextUtils.isEmpty(str)) {
            if (!C4128Rj1.b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!C4128Rj1.b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new Xu2(2, c10071up2, new C10118v10(i2, list));
    }

    public static boolean g(C10833xx0 c10833xx0) {
        C4224Si1.b d2;
        C4224Si1 c4224Si1 = c10833xx0.e1;
        if (c4224Si1 == null) {
            return false;
        }
        for (int i = 0; i < c4224Si1.e(); i++) {
            if (c4224Si1.d(i) instanceof C6263fI0) {
                return !((C6263fI0) d2).Z.isEmpty();
            }
        }
        return false;
    }

    public static boolean h(InterfaceC4324Tj0 interfaceC4324Tj0, InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        try {
            boolean d2 = interfaceC4324Tj0.d(interfaceC4421Uj0);
            interfaceC4421Uj0.i();
            return d2;
        } catch (EOFException unused) {
            interfaceC4421Uj0.i();
            return false;
        } catch (Throwable th) {
            interfaceC4421Uj0.i();
            throw th;
        }
    }

    @Override // o.PH0
    /* renamed from: c */
    public C9833tr a(Uri uri, C10833xx0 c10833xx0, @InterfaceC11300zs1 List<C10833xx0> list, C10071up2 c10071up2, Map<String, List<String>> map, InterfaceC4421Uj0 interfaceC4421Uj0, ND1 nd1) throws IOException {
        int a = C4940Zp0.a(c10833xx0.g1);
        int b = C4940Zp0.b(map);
        int c = C4940Zp0.c(uri);
        int[] iArr = d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a, arrayList);
        b(b, arrayList);
        b(c, arrayList);
        for (int i : iArr) {
            b(i, arrayList);
        }
        interfaceC4421Uj0.i();
        InterfaceC4324Tj0 interfaceC4324Tj0 = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            InterfaceC4324Tj0 interfaceC4324Tj02 = (InterfaceC4324Tj0) C9542sf.g(d(intValue, c10833xx0, list, c10071up2));
            if (h(interfaceC4324Tj02, interfaceC4421Uj0)) {
                return new C9833tr(interfaceC4324Tj02, c10833xx0, c10071up2);
            }
            if (interfaceC4324Tj0 == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                interfaceC4324Tj0 = interfaceC4324Tj02;
            }
        }
        return new C9833tr((InterfaceC4324Tj0) C9542sf.g(interfaceC4324Tj0), c10833xx0, c10071up2);
    }

    @InterfaceC11300zs1
    @SuppressLint({"SwitchIntDef"})
    public final InterfaceC4324Tj0 d(int i, C10833xx0 c10833xx0, @InterfaceC11300zs1 List<C10833xx0> list, C10071up2 c10071up2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 7) {
                        if (i != 8) {
                            if (i != 11) {
                                if (i != 13) {
                                    return null;
                                }
                                return new BK2(c10833xx0.Z, c10071up2);
                            }
                            return f(this.b, this.c, c10833xx0, list, c10071up2);
                        }
                        return e(c10071up2, c10833xx0, list);
                    }
                    return new C11029yl1(0, 0L);
                }
                return new L7();
            }
            return new K3();
        }
        return new G3();
    }

    public C7066iZ(int i, boolean z) {
        this.b = i;
        this.c = z;
    }
}
