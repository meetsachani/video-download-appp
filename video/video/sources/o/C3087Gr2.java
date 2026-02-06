package o;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import o.AbstractC5317bO0;
import o.AbstractC7692l81;
import o.C3773Nr2;
import o.C7177j10;
import o.InterfaceC6859hi0;
import o.M11;

@Deprecated
/* renamed from: o.Gr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3087Gr2 {

    /* renamed from: o.Gr2$a */
    /* loaded from: classes2.dex */
    public interface a {
        InterfaceC6859hi0 a(InterfaceC6859hi0.a aVar);
    }

    public static C3773Nr2 a(AbstractC7692l81.a aVar, List<? extends InterfaceC11054yr2>[] listArr) {
        boolean z;
        boolean z2;
        AbstractC5317bO0.a aVar2 = new AbstractC5317bO0.a();
        for (int i = 0; i < aVar.d(); i++) {
            C10079ur2 h = aVar.h(i);
            List<? extends InterfaceC11054yr2> list = listArr[i];
            for (int i2 = 0; i2 < h.X; i2++) {
                C9593sr2 b = h.b(i2);
                if (aVar.a(i, i2, false) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = b.X;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < b.X; i4++) {
                    iArr[i4] = aVar.i(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 < list.size()) {
                            InterfaceC11054yr2 interfaceC11054yr2 = list.get(i5);
                            if (interfaceC11054yr2.n().equals(b) && interfaceC11054yr2.m(i4) != -1) {
                                z2 = true;
                                break;
                            }
                            i5++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    zArr[i4] = z2;
                }
                aVar2.g(new C3773Nr2.a(b, z, iArr, zArr));
            }
        }
        C10079ur2 k = aVar.k();
        for (int i6 = 0; i6 < k.X; i6++) {
            C9593sr2 b2 = k.b(i6);
            int[] iArr2 = new int[b2.X];
            Arrays.fill(iArr2, 0);
            aVar2.g(new C3773Nr2.a(b2, false, iArr2, new boolean[b2.X]));
        }
        return new C3773Nr2(aVar2.e());
    }

    public static C3773Nr2 b(AbstractC7692l81.a aVar, InterfaceC11054yr2[] interfaceC11054yr2Arr) {
        AbstractC5317bO0 L;
        List[] listArr = new List[interfaceC11054yr2Arr.length];
        for (int i = 0; i < interfaceC11054yr2Arr.length; i++) {
            InterfaceC11054yr2 interfaceC11054yr2 = interfaceC11054yr2Arr[i];
            if (interfaceC11054yr2 != null) {
                L = AbstractC5317bO0.M(interfaceC11054yr2);
            } else {
                L = AbstractC5317bO0.L();
            }
            listArr[i] = L;
        }
        return a(aVar, listArr);
    }

    public static M11.a c(InterfaceC6859hi0 interfaceC6859hi0) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC6859hi0.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC6859hi0.d(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new M11.a(1, 0, length, i);
    }

    public static InterfaceC6859hi0[] d(InterfaceC6859hi0.a[] aVarArr, a aVar) {
        InterfaceC6859hi0[] interfaceC6859hi0Arr = new InterfaceC6859hi0[aVarArr.length];
        boolean z = false;
        for (int i = 0; i < aVarArr.length; i++) {
            InterfaceC6859hi0.a aVar2 = aVarArr[i];
            if (aVar2 != null) {
                int[] iArr = aVar2.b;
                if (iArr.length > 1 && !z) {
                    interfaceC6859hi0Arr[i] = aVar.a(aVar2);
                    z = true;
                } else {
                    interfaceC6859hi0Arr[i] = new C2999Fu0(aVar2.a, iArr[0], aVar2.c);
                }
            }
        }
        return interfaceC6859hi0Arr;
    }

    public static C7177j10.d e(C7177j10.d dVar, int i, C10079ur2 c10079ur2, boolean z, @InterfaceC11300zs1 C7177j10.f fVar) {
        C7177j10.d.a H1 = dVar.B().M0(i).H1(i, z);
        if (fVar != null) {
            H1.J1(i, c10079ur2, fVar);
        }
        return H1.B();
    }
}
