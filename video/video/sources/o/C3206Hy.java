package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.InterfaceC6185ez;

/* renamed from: o.Hy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3206Hy {

    /* renamed from: o.Hy$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3108Gy {
        public final List<InterfaceC6185ez> a;

        public a(List<InterfaceC6185ez> list) {
            if (list != null && !list.isEmpty()) {
                this.a = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // o.InterfaceC3108Gy
        public List<InterfaceC6185ez> a() {
            return this.a;
        }
    }

    public static InterfaceC3108Gy a(List<InterfaceC6185ez> list) {
        return new a(list);
    }

    public static InterfaceC3108Gy b(InterfaceC6185ez... interfaceC6185ezArr) {
        return new a(Arrays.asList(interfaceC6185ezArr));
    }

    public static InterfaceC3108Gy c() {
        return b(new InterfaceC6185ez.a());
    }
}
