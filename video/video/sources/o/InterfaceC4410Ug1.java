package o;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.G02;

@Deprecated
/* renamed from: o.Ug1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4410Ug1 extends G02 {

    /* renamed from: o.Ug1$a */
    /* loaded from: classes2.dex */
    public interface a extends G02.a<InterfaceC4410Ug1> {
        void j(InterfaceC4410Ug1 interfaceC4410Ug1);
    }

    @Override // o.G02
    boolean a();

    @Override // o.G02
    long c();

    @Override // o.G02
    boolean d(long j);

    long e(long j, LZ1 lz1);

    @Override // o.G02
    long f();

    @Override // o.G02
    void g(long j);

    default List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
        return Collections.EMPTY_LIST;
    }

    long i(long j);

    long k();

    void m() throws IOException;

    void o(a aVar, long j);

    C10079ur2 q();

    void r(long j, boolean z);

    long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j);
}
