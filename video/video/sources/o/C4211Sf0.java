package o;

import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Sf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4211Sf0 implements InterfaceC10688xL1 {
    public static final String a = "ExcludedSupportedSizesQuirk";
    public static final int b = -1;

    public static boolean l() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean m() {
        if ("OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean n() {
        if ("OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean o() {
        if ("REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean p() {
        if (C3931Pi2.a.equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean q() {
        if (C3931Pi2.a.equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean r() {
        if (!m() && !n() && !l() && !q() && !p() && !o()) {
            return false;
        }
        return true;
    }

    public List<Size> d(String str, int i) {
        if (m()) {
            return g(str, i);
        }
        if (n()) {
            return h(str, i);
        }
        if (l()) {
            return f(str, i, null);
        }
        if (q()) {
            return k(str, i, null);
        }
        if (p()) {
            return j(str, i, null);
        }
        if (o()) {
            return i(str, i);
        }
        C7433k41.p(a, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    public List<Size> e(String str, Class<?> cls) {
        if (l()) {
            return f(str, -1, cls);
        }
        if (q()) {
            return k(str, -1, cls);
        }
        if (p()) {
            return j(str, -1, cls);
        }
        C7433k41.p(a, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    public final List<Size> f(String str, int i, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    public final List<Size> g(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(S92.y, 3000));
        }
        return arrayList;
    }

    public final List<Size> h(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(S92.y, 3000));
        }
        return arrayList;
    }

    public final List<Size> i(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    public final List<Size> j(String str, int i, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i != 34 && cls == null) {
                if (i == 35) {
                    arrayList.add(new Size(2048, I3.g));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, FC.u));
                    return arrayList;
                }
            } else {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, I3.g));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, FC.u));
                return arrayList;
            }
        } else if (str.equals("1") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, I3.g));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, FC.u));
        }
        return arrayList;
    }

    public final List<Size> k(String str, int i, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i != 34 && cls == null) {
                if (i == 35) {
                    arrayList.add(new Size(4128, 2322));
                    arrayList.add(new Size(3088, 3088));
                    arrayList.add(new Size(3264, 2448));
                    arrayList.add(new Size(3264, 1836));
                    arrayList.add(new Size(2048, I3.g));
                    arrayList.add(new Size(2048, 1152));
                    arrayList.add(new Size(1920, FC.u));
                    return arrayList;
                }
            } else {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, I3.g));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, FC.u));
                return arrayList;
            }
        } else if (str.equals("1") && (i == 34 || i == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, I3.g));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, FC.u));
        }
        return arrayList;
    }
}
