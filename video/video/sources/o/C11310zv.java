package o;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.zv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11310zv implements InterfaceC3981Pw {
    public static final String c = "Camera2DeviceSurfaceManager";
    public final Map<String, C3243Ih2> a;
    public final InterfaceC4751Xt b;

    /* renamed from: o.zv$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4751Xt {
        @Override // o.InterfaceC4751Xt
        public CamcorderProfile a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // o.InterfaceC4751Xt
        public boolean b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public C11310zv(Context context, Object obj, Set<String> set) throws C3594Lx {
        this(context, new a(), obj, set);
    }

    @Override // o.InterfaceC3981Pw
    public Pair<Map<InterfaceC6743hD2<?>, AbstractC4008Qd2>, Map<AbstractC8324ng, AbstractC4008Qd2>> a(int i, String str, List<AbstractC8324ng> list, Map<InterfaceC6743hD2<?>, List<Size>> map) {
        C10907yF1.b(!map.isEmpty(), "No new use cases to be bound.");
        C3243Ih2 c3243Ih2 = this.a.get(str);
        if (c3243Ih2 != null) {
            return c3243Ih2.z(i, list, map);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // o.InterfaceC3981Pw
    public AbstractC4609Wh2 b(int i, String str, int i2, Size size) {
        C3243Ih2 c3243Ih2 = this.a.get(str);
        if (c3243Ih2 != null) {
            return c3243Ih2.L(i, i2, size);
        }
        return null;
    }

    public final void c(Context context, C8392nx c8392nx, Set<String> set) throws C3594Lx {
        C10907yF1.l(context);
        for (String str : set) {
            this.a.put(str, new C3243Ih2(context, str, c8392nx, this.b));
        }
    }

    public C11310zv(Context context, InterfaceC4751Xt interfaceC4751Xt, Object obj, Set<String> set) throws C3594Lx {
        C8392nx a2;
        this.a = new HashMap();
        C10907yF1.l(interfaceC4751Xt);
        this.b = interfaceC4751Xt;
        if (obj instanceof C8392nx) {
            a2 = (C8392nx) obj;
        } else {
            a2 = C8392nx.a(context);
        }
        c(context, a2, set);
    }
}
