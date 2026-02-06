package o;

import android.content.Context;
import o.C7025iN1;

/* renamed from: o.Uh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4415Uh2 {
    SURFACE_0(C7025iN1.f.m3_sys_elevation_level0),
    SURFACE_1(C7025iN1.f.m3_sys_elevation_level1),
    SURFACE_2(C7025iN1.f.m3_sys_elevation_level2),
    SURFACE_3(C7025iN1.f.m3_sys_elevation_level3),
    SURFACE_4(C7025iN1.f.m3_sys_elevation_level4),
    SURFACE_5(C7025iN1.f.m3_sys_elevation_level5);
    
    public final int X;

    EnumC4415Uh2(@InterfaceC9154r30 int i) {
        this.X = i;
    }

    @JF
    public static int h(@InterfaceC5670cr1 Context context, @InterfaceC9397s30 float f) {
        return new C9523sa0(context).c(C9179r91.b(context, C7025iN1.c.colorSurface, 0), f);
    }

    @JF
    public int g(@InterfaceC5670cr1 Context context) {
        return h(context, context.getResources().getDimension(this.X));
    }
}
