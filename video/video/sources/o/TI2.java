package o;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.C3716Nd2;

/* loaded from: classes.dex */
public class TI2 extends C4279Sx0 {
    public static final int d = 100;
    public static final int e = 0;
    public final C3716Nd2.a c;

    public TI2(InterfaceC9610sw interfaceC9610sw, C3716Nd2.a aVar) {
        super(interfaceC9610sw);
        this.c = aVar;
    }

    @Override // o.C4279Sx0, o.InterfaceC9610sw
    public InterfaceFutureC8411o11<List<Void>> e(List<C3597Ly> list, int i, int i2) {
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        C10907yF1.b(z, "Only support one capture config.");
        return C7221jC0.c(Collections.singletonList(this.c.a(r(list.get(0)), s(list.get(0)))));
    }

    public final int r(C3597Ly c3597Ly) {
        Integer num = (Integer) c3597Ly.f().h(C3597Ly.k, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int s(C3597Ly c3597Ly) {
        Integer num = (Integer) c3597Ly.f().h(C3597Ly.j, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
