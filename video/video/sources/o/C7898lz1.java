package o;

import java.io.IOException;
import o.NV0;

/* renamed from: o.lz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7898lz1 {
    public static C7412jz1 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        boolean z;
        if (nv0.q() == NV0.b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new C7412jz1(c10624x51, NX0.c(nv0, c10624x51, C6006eE2.e(), C9867tz1.a, z, false));
    }
}
