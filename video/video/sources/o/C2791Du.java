package o;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.Du  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2791Du implements InterfaceC5207ax {
    public static final String h = "Camera2CameraFactory";
    public static final int i = 1;
    public final InterfaceC2797Dw a;
    public final AbstractC3497Kx b;
    public final C3399Jx c;
    public final C8392nx d;
    public final List<String> e;
    public final C10376w40 f;
    public final Map<String, C5926dv> g = new HashMap();

    public C2791Du(Context context, AbstractC3497Kx abstractC3497Kx, C2898Ex c2898Ex) throws FP0 {
        this.b = abstractC3497Kx;
        C8392nx b = C8392nx.b(context, abstractC3497Kx.c());
        this.d = b;
        this.f = C10376w40.c(context);
        this.e = e(C2800Dx.b(this, c2898Ex));
        C2693Cu c2693Cu = new C2693Cu(b);
        this.a = c2693Cu;
        C3399Jx c3399Jx = new C3399Jx(c2693Cu, 1);
        this.c = c3399Jx;
        c2693Cu.c(c3399Jx);
    }

    @Override // o.InterfaceC5207ax
    public InterfaceC7402jx b(String str) throws C3594Lx {
        if (this.e.contains(str)) {
            return new C4851Yu(this.d, str, f(str), this.a, this.c, this.b.b(), this.b.c(), this.f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // o.InterfaceC5207ax
    public Set<String> c() {
        return new LinkedHashSet(this.e);
    }

    @Override // o.InterfaceC5207ax
    public InterfaceC2797Dw d() {
        return this.a;
    }

    public final List<String> e(List<String> list) throws FP0 {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.equals("0") && !str.equals("1")) {
                if (h(str)) {
                    arrayList.add(str);
                } else {
                    C7433k41.a(h, "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public C5926dv f(String str) throws C3594Lx {
        try {
            C5926dv c5926dv = this.g.get(str);
            if (c5926dv == null) {
                C5926dv c5926dv2 = new C5926dv(str, this.d);
                this.g.put(str, c5926dv2);
                return c5926dv2;
            }
            return c5926dv;
        } catch (C3197Hv e) {
            throw C3692Mx.a(e);
        }
    }

    @Override // o.InterfaceC5207ax
    /* renamed from: g */
    public C8392nx a() {
        return this.d;
    }

    public final boolean h(String str) throws FP0 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.d.d(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C3197Hv e) {
            throw new FP0(C3692Mx.a(e));
        }
    }
}
