package o;

import o.C8590ol1;

/* renamed from: o.pt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8866pt2 {
    public static final String a = "TransitionBuilder";

    public static C8590ol1.b a(C8590ol1 c8590ol1, int i, int i2, androidx.constraintlayout.widget.e eVar, int i3, androidx.constraintlayout.widget.e eVar2) {
        C8590ol1.b bVar = new C8590ol1.b(i, c8590ol1, i2, i3);
        b(c8590ol1, bVar, eVar, eVar2);
        return bVar;
    }

    public static void b(C8590ol1 c8590ol1, C8590ol1.b bVar, androidx.constraintlayout.widget.e eVar, androidx.constraintlayout.widget.e eVar2) {
        int I = bVar.I();
        int B = bVar.B();
        c8590ol1.k0(I, eVar);
        c8590ol1.k0(B, eVar2);
    }

    public static void c(C7114il1 c7114il1) {
        C8590ol1 c8590ol1 = c7114il1.F1;
        if (c8590ol1 != null) {
            if (c8590ol1.t0(c7114il1)) {
                if (c8590ol1.c != null && !c8590ol1.s().isEmpty()) {
                    return;
                }
                throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
            }
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
    }
}
