package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.o82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8440o82 implements InterfaceC7508kN0 {
    public final int a;
    public final androidx.camera.core.g b;

    public C8440o82(androidx.camera.core.g gVar, String str) {
        YM0 I4 = gVar.I4();
        if (I4 != null) {
            Integer num = (Integer) I4.a().d(str);
            if (num != null) {
                this.a = num.intValue();
                this.b = gVar;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override // o.InterfaceC7508kN0
    public List<Integer> a() {
        return Collections.singletonList(Integer.valueOf(this.a));
    }

    @Override // o.InterfaceC7508kN0
    public InterfaceFutureC8411o11<androidx.camera.core.g> b(int i) {
        if (i != this.a) {
            return C7221jC0.f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return C7221jC0.h(this.b);
    }

    public void c() {
        this.b.close();
    }

    public C8440o82(androidx.camera.core.g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }
}
