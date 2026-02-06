package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.kk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7595kk1<Model, Data> {

    /* renamed from: o.kk1$a */
    /* loaded from: classes.dex */
    public static class a<Data> {
        public final InterfaceC6575gX0 a;
        public final List<InterfaceC6575gX0> b;
        public final InterfaceC9990uU<Data> c;

        public a(InterfaceC6575gX0 interfaceC6575gX0, InterfaceC9990uU<Data> interfaceC9990uU) {
            this(interfaceC6575gX0, Collections.EMPTY_LIST, interfaceC9990uU);
        }

        public a(InterfaceC6575gX0 interfaceC6575gX0, List<InterfaceC6575gX0> list, InterfaceC9990uU<Data> interfaceC9990uU) {
            this.a = (InterfaceC6575gX0) C10175vF1.e(interfaceC6575gX0);
            this.b = (List) C10175vF1.e(list);
            this.c = (InterfaceC9990uU) C10175vF1.e(interfaceC9990uU);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i, int i2, C5448bw1 c5448bw1);
}
