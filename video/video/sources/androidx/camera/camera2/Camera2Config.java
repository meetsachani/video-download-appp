package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import o.C11310zv;
import o.C3001Fv;
import o.C3594Lx;
import o.C4967Zx;
import o.FP0;
import o.InterfaceC3981Pw;
import o.InterfaceC5207ax;
import o.InterfaceC6986iD2;

/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements C4967Zx.b {
        @Override // o.C4967Zx.b
        public C4967Zx getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ InterfaceC6986iD2 a(Context context) {
        return new C3001Fv(context);
    }

    public static /* synthetic */ InterfaceC3981Pw b(Context context, Object obj, Set set) {
        try {
            return new C11310zv(context, obj, set);
        } catch (C3594Lx e) {
            throw new FP0(e);
        }
    }

    public static C4967Zx c() {
        InterfaceC5207ax.a aVar = new InterfaceC5207ax.a() { // from class: o.wv
            @Override // o.InterfaceC5207ax.a
            public final InterfaceC5207ax a(Context context, AbstractC3497Kx abstractC3497Kx, C2898Ex c2898Ex) {
                return new C2791Du(context, abstractC3497Kx, c2898Ex);
            }
        };
        InterfaceC3981Pw.a aVar2 = new InterfaceC3981Pw.a() { // from class: o.xv
            @Override // o.InterfaceC3981Pw.a
            public final InterfaceC3981Pw a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new C4967Zx.a().l(aVar).m(aVar2).u(new InterfaceC6986iD2.c() { // from class: o.yv
            @Override // o.InterfaceC6986iD2.c
            public final InterfaceC6986iD2 a(Context context) {
                return Camera2Config.a(context);
            }
        }).c();
    }
}
