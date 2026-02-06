package o;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Dx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2800Dx {
    public static String a(C8392nx c8392nx, Integer num, List<String> list) throws C3197Hv {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) c8392nx.d("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) c8392nx.d("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static List<String> b(C2791Du c2791Du, C2898Ex c2898Ex) throws FP0 {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c2791Du.a().e());
            if (c2898Ex == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
            } else {
                try {
                    str = a(c2791Du.a(), c2898Ex.d(), asList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : asList) {
                    if (!str3.equals(str)) {
                        arrayList2.add(c2791Du.f(str3));
                    }
                }
                Iterator<InterfaceC6420fx> it = c2898Ex.b(arrayList2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC6918hx) it.next()).c());
                }
            }
            return arrayList;
        } catch (C3197Hv e) {
            throw new FP0(C3692Mx.a(e));
        } catch (C3594Lx e2) {
            throw new FP0(e2);
        }
    }
}
